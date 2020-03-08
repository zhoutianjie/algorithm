package huawei2;

import java.util.Scanner;

/**
 * 数字颠倒
 * 输入一个整数，将这个整数以字符串的形式逆序输出
 * 程序不考虑负数的情况，若数字含有0，则逆序形式也含有0，如输入为100，则输出为001
 */
public class Solution11 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int m = in.nextInt();
            StringBuilder sb = new StringBuilder();
            while (m!=0){
                sb.append(m%10);
                m=m/10;
            }
            System.out.println(sb.toString());
        }
    }
}
