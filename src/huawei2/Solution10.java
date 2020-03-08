package huawei2;

import java.util.Scanner;

/**
 * 字符个数统计
 * 编写一个函数，计算字符串中含有的不同字符的个数。
 *字符在ACSII码范围内(0~127)，换行表示结束符，不算在字符里。不在范围内的不作统计
 */
public class Solution10 {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int[] isAppeard = new int[128];
            String line = in.nextLine();
            for(int i=0;i<line.length();i++){
                isAppeard[line.charAt(i)]++;
            }
            int cnt = 0;
            for(int i=0;i<isAppeard.length;i++){
                if(isAppeard[i]!=0){
                    cnt++;
                }
            }
            System.out.println(cnt);
        }
    }
}
