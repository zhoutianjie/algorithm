package huawei2;

import java.util.Scanner;

/**
 * 字符串反转
 * 写出一个程序，接受一个字符串，然后输出该字符串反转后的字符串。
 */
public class Solution12 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            String str = in.nextLine();
            StringBuilder sb = new StringBuilder(str);
            System.out.println(sb.reverse().toString());
        }
    }
}
