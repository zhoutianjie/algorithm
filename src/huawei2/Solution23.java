package huawei2;

import java.util.Scanner;

/**
 * 删除字符串中出现最少的字符
 * 实现删除字符串中出现次数最少的字符，若多个字符出现次数一样，则都删除。输出删除这些单词后的字符串，字符串中其它字符保持原来的顺序。
 */
public class Solution23 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            String line = in.nextLine();
            int[] a = new int[26];
            int min = Integer.MAX_VALUE;
            for(int i=0;i<line.length();i++){
                int index = line.charAt(i)-'a';
                a[index]++;
                if(a[index]<min){
                    min = a[index];
                }
            }
            StringBuilder sb = new StringBuilder();
            for(int i=0;i< line.length();i++){
                int index = line.charAt(i)-'a';
                if(a[index]!=min){
                    sb.append(line.charAt(i));
                }
            }
            System.out.println(sb.toString());
        }
    }
}
