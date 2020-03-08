package huawei2;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 字符串连接最长路径查找
 * 给定n个字符串，请对n个字符串按照字典序排列。
 * 字典序：这是单个字符的大小情况，那么如果是两个字符串比较大小呢？在计算机中，两个字符串比较大小，是按照从左到右的顺序进行比较，
 * 如果第1位相等，就比较第2位，直至有一位可以比较出大小来，则不再继续比较。
 */
public class Solution14 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int n = in.nextInt();
            String[] strs = new String[n];
            for (int i=0;i<n;i++){
                strs[i]=in.next();
            }
            Arrays.sort(strs);
            for(int i=0;i<n;i++){
                System.out.println(strs[i]);
            }
        }
    }
}
