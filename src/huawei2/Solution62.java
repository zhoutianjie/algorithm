package huawei2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution62 {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int low = in.nextInt();
        int high = in.nextInt();
        List<Integer> list = new ArrayList<>();
        for(int i=low;i<high;i++){
            if(isPrime(i)){
                list.add(i);
            }
        }
        if(list.isEmpty()){
            System.out.println(0);
        }else {
            int shiweishu = 0;
            int geweishu = 0;
            for (int i=0;i<list.size();i++){
                shiweishu+=getshiweishu(list.get(i));
                geweishu+=getgeweishu(list.get(i));
            }
            int min = Math.min(shiweishu,geweishu);
            System.out.println(min);
        }


    }

    private static boolean isPrime(int n){
        if(n == 1){
            return false;
        }
        for (int i=2;i<=Math.sqrt(n*1.0);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    private static int getshiweishu(int n){
        if(n<10){
            return 0;
        }else {
            n=n/10;
            n=n%10;
            return n;
        }
    }

    private static int getgeweishu(int n){
        return n%10;
    }

}
