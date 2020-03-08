package huawei2;

import java.util.Scanner;

/**
 * 求小球落地5次后所经历的路程和第5次反弹的高度
 */
public class Solution39 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int height = in.nextInt();
            System.out.println(getJourney(height));
            System.out.println(getTenthHeigh(height));
        }
    }

    public static double  getJourney(int high){
        int N = 5;
        double a = high;
        double sum = a*2;
        for(int i=2;i<N;i++){
            a=a*0.5;
            sum+=a;
        }
        return sum;
    }

    public static double getTenthHeigh(int high){
        int N = 5;
        double a = 0.5*high;
        for(int i=1;i<N;i++){
            a=a*0.5;
        }
        return a;
    }
}
