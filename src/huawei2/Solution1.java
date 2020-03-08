package huawei2;

import java.util.Scanner;

/**
 * 字符串最后一个单词的长度
 */
public class Solution1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            String line = in.nextLine();
            String[] words = line.split(" ");
            System.out.println(words[words.length-1].length());
        }
    }
}
