package huawei2;

import java.util.Scanner;

/**
 * 字符串加解密
 * 按照指定规则对输入的字符串进行处理。
 *
 * 详细描述：
 *
 * 将输入的两个字符串合并。
 *
 * 对合并后的字符串进行排序，要求为：下标为奇数的字符和下标为偶数的字符分别从小到大排序。这里的下标意思是字符在字符串中的位置。
 *
 * 对排序后的字符串进行操作，如果字符为‘0’——‘9’或者‘A’——‘F’或者‘a’——‘f’，则对他们所代表的16进制的数进行BIT倒序的操作，并转换为相应的大写字符。如字符为‘4’，为0100b，则翻转后为0010b，也就是2。转换后的字符为‘2’； 如字符为‘7’，为0111b，则翻转后为1110b，也就是e。转换后的字符为大写‘E’
 */
public class Solution29 {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            String str1 = in.nextLine();
            String str2 = in.nextLine();
            char[] auc = str1.toCharArray();
            char[] acuResult = new char[auc.length];

            char[] result = str2.toCharArray();
            char[] password = new char[result.length];

            Encrypt(auc,acuResult);
            String acuResultStr = new String(acuResult);
            System.out.println(acuResultStr);

            unEncrypt(result,password);
            String passwordStr = new String(password);
            System.out.println(passwordStr);
        }
    }

    public static void Encrypt (char aucPassword[], char aucResult[]){
        for (int i=0;i<aucPassword.length;i++){
            char c = aucPassword[i];
            if(Character.isLowerCase(c)){
                if(c == 'z'){
                    c = 'a';
                }else {
                    c = (char) (c+1);
                }
                c = Character.toUpperCase(c);
            }else if(Character.isUpperCase(c)){
                if(c == 'Z'){
                    c='A';
                }else {
                    c = (char) (c+1);
                }
                c=Character.toLowerCase(c);
            }else if(Character.isDigit(c)){
                if(c == '9'){
                    c='0';
                }else {
                    c= (char) (c+1);
                }
            }
            aucResult[i]=c;
        }
    }

    public static int unEncrypt (char result[], char password[]){
        for(int i=0;i<result.length;i++){
            char c = result[i];
            if(Character.isLowerCase(c)){
                c= Character.toUpperCase(c);
                if(c=='A'){
                    c='Z';
                }else {
                    c= (char) (c-1);
                }
            }else if(Character.isUpperCase(c)){
                c=Character.toLowerCase(c);
                if(c=='a'){
                    c='z';
                }else {
                    c= (char) (c-1);
                }
            }else if(Character.isDigit(c)){
                if(c=='0'){
                    c='9';
                }else {
                    c= (char) (c-1);
                }
            }
            password[i]=c;
        }
        return 0;
    }

}
