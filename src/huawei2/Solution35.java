package huawei2;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 图片整理
 */
public class Solution35 {
    public static void main(String[] args){
        Scanner in  = new Scanner(System.in);
        while (in.hasNext()){
            String str = in.nextLine();
            char[] chs = str.toCharArray();
            Arrays.sort(chs);
            System.out.println(new String(chs));
        }
    }
}
