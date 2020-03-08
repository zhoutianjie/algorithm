package huawei2;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 名字的漂亮度
 * 给出一个名字，该名字有26个字符串组成，定义这个字符串的“漂亮度”是其所有字母“漂亮度”的总和。
 * 每个字母都有一个“漂亮度”，范围在1到26之间。没有任何两个字母拥有相同的“漂亮度”。字母忽略大小写。
 * 给出多个名字，计算每个名字最大可能的“漂亮度”
 */

public class Solution46 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int n = in.nextInt();
            for(int i=0;i<n;i++){
                String str = in.next().trim();
                System.out.println(getMaxBeautiful(str));
            }
        }
    }
    private static int getMaxBeautiful(String str){
        char[] chs = str.toLowerCase().toCharArray();
        int[] a = new int[26];
        int k=26;
        int res=0;
        for(int i=0;i<chs.length;i++){
            a[chs[i]-'a']++;
        }
        Arrays.sort(a);
        for(int i=25;i>=0;i--){
            res+=a[i]*k--;
        }
        return res;

    }
}
