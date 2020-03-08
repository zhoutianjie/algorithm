package huawei2;

import java.util.Scanner;

/**
 * 质数因子
 * 功能:输入一个正整数，按照从小到大的顺序输出它的所有质数的因子（如180的质数因子为2 2 3 3 5 ）
 * 最后一个数后面也要有空格
 */
public class Solution6 {

    private static String getResult(long n){
        StringBuilder sb = new StringBuilder();
        for(int i=2;i<=n;i++){
            while (n%i == 0){
                sb.append(i+" ");
                n=n/i;
            }
        }
        return sb.toString();
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            long n = in.nextLong();
            System.out.println(getResult(n));
        }
    }
}
