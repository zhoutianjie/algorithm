package huawei2;

import java.util.Scanner;

/**
 * 简单密码
 * 密码是我们生活中非常重要的东东，我们的那么一点不能说的秘密就全靠它了。哇哈哈. 接下来渊子要在密码之上再加一套密码，虽然简单但也安全。
 * 假设渊子原来一个BBS上的密码为zvbo9441987,为了方便记忆，他通过一种算法把这个密码变换成YUANzhi1987，这个密码是他的名字和出生年份，怎么忘都忘不了，而且可以明目张胆地放在显眼的地方而不被别人知道真正的密码。
 * 他是这么变换的，大家都知道手机上的字母： 1--1， abc--2, def--3, ghi--4, jkl--5, mno--6, pqrs--7, tuv--8 wxyz--9, 0--0,就这么简单，渊子把密码中出现的小写字母都变成对应的数字，数字和其他的符号都不做变换，
 * 声明：密码中没有空格，而密码中出现的大写字母则变成小写之后往后移一位，如：X，先变成小写，再往后移一位，不就是y了嘛，简单吧。记住，z往后移是a哦。
 */
public class Solution21 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<str.length();i++){
            if(Character.isUpperCase(str.charAt(i))){
                sb.append(bigCharSwitch(str.charAt(i)));
            }else if(Character.isLowerCase(str.charAt(i))){
                sb.append(smallCharSwitch(str.charAt(i)));
            }else {
                sb.append(str.charAt(i));
            }
        }
        System.out.println(sb.toString());
    }

    public static char bigCharSwitch(char c){
        char ch = Character.toLowerCase(c);
        if(ch == 'z'){
            return 'a';
        }else {
            return (char) (ch+1);
        }
    }

    public static char smallCharSwitch(char c){
        if(c == 'a'|| c=='b'||c=='c'){
            return '2';
        }else if(c=='d'||c=='e'||c=='f'){
            return '3';
        }else if(c=='g'||c=='h'||c=='i'){
            return '4';
        }else if(c=='j'||c=='k'||c=='l'){
            return '5';
        }else if(c=='m'||c=='n'||c=='o'){
            return '6';
        }else if(c=='p'||c=='q'||c=='r'||c=='s'){
            return '7';
        }else if(c=='t'||c=='u'||c=='v'){
            return '8';
        }else if(c=='w'||c=='x'||c=='y'||c=='z'){
            return '9';
        }else {
            return c;
        }
    }
}
