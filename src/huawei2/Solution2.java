package huawei2;

import java.util.Scanner;

/**
 * 计算字符个数
 */
public class Solution2 {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            String line = in.nextLine().toUpperCase();
            String ch = in.nextLine().toUpperCase();
            int cnt = 0;
            for(int i=0;i<line.length();i++){
                String str = String.valueOf(line.charAt(i));
                if(str.equals(ch)){
                    cnt++;
                }
            }
            System.out.println(cnt);
        }
    }
}
