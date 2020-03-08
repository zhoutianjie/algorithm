package huawei2;

import java.util.Scanner;

/**
 * 提取不重复的整数
 * 输入一个int型整数，按照从右向左的阅读顺序，返回一个不含重复数字的新的整数
 */
public class Solution9 {

    //1.输入的是int型，返回的也是int型
    private static int getResult1(int n){
        int sum = 0;
        boolean[] iscontains = new boolean[10];
        while (n!=0){
            int tmp = n%10;
            if(!iscontains[tmp]){
                sum = tmp+10*sum;
                iscontains[tmp]=true;
            }
            n=n/10;
        }
        return sum;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int n = in.nextInt();
            System.out.println(getResult1(n));
        }
    }

    //如果是字符串输出的话，可以通过队列和stack判断，相比于整数更容易
}
