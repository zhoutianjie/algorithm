package huawei2;

import java.util.Scanner;

/**
 * 求int型正整数在内存中存储时1的个数
 */
public class Solution15 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int m = in.nextInt();
            int cnt = 0;
            while (m!=0){
                if((m&1)==1){
                    cnt++;
                }
                m=m>>1;
            }
            System.out.println(cnt);
        }
    }
}
