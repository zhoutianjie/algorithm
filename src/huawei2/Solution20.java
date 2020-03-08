package huawei2;

import java.util.Scanner;

/**
 * 密码验证合格程序
 * 密码要求:
 * 1.长度超过8位
 * 2.包括大小写字母.数字.其它符号,以上四种至少三种
 * 3.不能有相同长度超2的子串重复
 * 说明:长度超过2的子串
 */
public class Solution20 {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            String str = in.nextLine();
            if(changduchaoguo8(str)&&baohanbutongfuhao(str)&&bunnegyouchangduchaguo2(str)){
                System.out.println("OK");
            }else {
                System.out.println("NG");
            }
        }
    }

    private static boolean changduchaoguo8(String str){
        return str.length()>8;
    }

    private static boolean baohanbutongfuhao(String str){
        int shuzhi=0;
        int daxiezimi = 0;
        int xiaoxiezimu = 0;
        int qitafuhao = 0;
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            if(Character.isDigit(c)){
                shuzhi=1;
            }else if(Character.isLowerCase(c)){
                xiaoxiezimu = 1;
            }else if(Character.isUpperCase(c)){
                daxiezimi = 1;
            }else {
                qitafuhao = 1;
            }
        }
        int sum = shuzhi+xiaoxiezimu+daxiezimi+qitafuhao;
        return sum>=3;
    }

    private static boolean bunnegyouchangduchaguo2(String str){
        for(int i=0;i<str.length()-3;i++){
            if(str.substring(i+3).contains(str.substring(i,i+3))){
                return false;
            }
        }
        return true;
    }

}
