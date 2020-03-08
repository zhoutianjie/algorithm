package huawei2;

import java.util.Scanner;

/**
 * 输入一行字符，分别统计出包含英文字母、空格、数字和其它字符的个数
 */
public class Solution41 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            String str = in.nextLine();
            int yinwen = 0;
            int kongge = 0;
            int shuzi = 0;
            int qita = 0;
            for(int i=0;i<str.length();i++){
                if(Character.isLetter(str.charAt(i))){
                    yinwen++;
                }else if(str.charAt(i)== ' '){
                    kongge++;
                }else if(Character.isDigit(str.charAt(i))){
                    shuzi++;
                }else {
                    qita++;
                }
            }
            System.out.println(yinwen);
            System.out.println(kongge);
            System.out.println(shuzi);
            System.out.println(qita);

        }
    }
}
