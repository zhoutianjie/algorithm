package huawei2;

import java.util.Scanner;

/**
 * 单词倒排
 * 对字符串中的所有单词进行倒排。
 *
 * 说明：
 *
 * 1、每个单词是以26个大写或小写英文字母构成；
 *
 * 2、非构成单词的字符均视为单词间隔符；
 *
 * 3、要求倒排后的单词间隔符以一个空格表示；如果原字符串中相邻单词间有多个间隔符时，倒排转换后也只允许出现一个空格间隔符；
 *
 * 4、每个单词最长20个字母；
 */
public class Solution31 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            String str = in.nextLine();
            String[] strs = str.split("[^a-zA-Z]+");
            StringBuilder sb = new StringBuilder();
            for(int i=strs.length-1;i>=0;i--){
                sb.append(strs[i]+" ");
            }
            System.out.println(sb.toString().trim());
        }

    }
}
