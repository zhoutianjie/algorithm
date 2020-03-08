package huawei2;

import java.util.Scanner;

/**
 * 句子逆序
 * 将一个英文语句以单词为单位逆序排放。例如“I am a boy”，逆序排放后为“boy a am I”
 * 所有单词之间用一个空格隔开，语句中除了英文字母外，不再包含其他字符
 */
public class Solution13 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        System.out.println(reverse(str));
    }
    public static String reverse(String sentence){
        String[] strs = sentence.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i= strs.length-1;i>=0;i--){
            if(i==0){
                sb.append(strs[i]);
            }else {
                sb.append(strs[i]);
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}
