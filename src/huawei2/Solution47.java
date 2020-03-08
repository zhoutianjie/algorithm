package huawei2;

import java.io.UnsupportedEncodingException;
import java.util.Scanner;

/**
 * 按字节截取字符串
 *
 * 编写一个截取字符串的函数，输入为一个字符串和字节数，输出为按字节截取的字符串。但是要保证汉字不被截半个，如"我ABC"4，应该截为"我AB"，输入"我ABC汉DEF"6，应该输出为"我ABC"而不是"我ABC+汉的半个"
 */
public class Solution47 {
//    public static void main(String[] args) throws UnsupportedEncodingException {
//        Scanner sc = new Scanner(System.in);
//        while (sc.hasNext()) {
//            String str = sc.next();
//            String[] strs = new String[str.length()];
//            for (int i = 0; i < strs.length; i++) {
//                strs[i] = String.valueOf(str.charAt(i));
//            }
//            int byteNum = sc.nextInt();
//            StringBuilder res = new StringBuilder();
//            for (int i = 0; i < strs.length; i++) {
//                int chLen = strs[i].getBytes("GBK").length;
//                if (byteNum >= chLen){
//                    byteNum -= chLen;
//                    res.append(strs[i]);
//                }else {
//                    break;
//                }
//            }
//            System.out.println(res.toString());
//        }
//    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            String str = in.next();//这里不能用nextLine
            int n = in.nextInt();
            System.out.println(getResult(str,n));
        }
    }

    public static String getResult(String str,int n){
        int temp = 0;
        StringBuilder sb = new StringBuilder();
        for (int i=0;i<str.length();i++){
            char c = str.charAt(i);
            if(String.valueOf(c).matches("[\u4e00-\u9fa5]")){
                temp+=2;
            }else {
                temp+=1;
            }
            if(temp<=n){
                sb.append(c);
            }else {
                break;
            }
        }
        return sb.toString();
    }
}
