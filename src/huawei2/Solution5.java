package huawei2;

import java.util.Scanner;

/**
 * 进制转换
 */
public class Solution5 {
    //普通解法1
//    public static void main(String[] args){
//        Scanner in = new Scanner(System.in);
//        while (in.hasNext()){   //hasnext 是空行结束  //hasnextline 是回车结束
//            String str = in.nextLine();
//            int sum = 0;
//            for(int i=2;i<str.length();i++){
//                int x = switch2Int(str.charAt(i));
//                sum = x+16*sum;
//            }
//            String result = String.valueOf(sum);
//            System.out.println(result);
//        }
//    }
//
    public static int switch2Int(char c){
        switch (c){
            case '1':
                return 1;
            case '2':
                return 2;
            case '3':
                return 3;
            case '4':
                return 4;
            case '5':
                return 5;
            case '6':
                return 6;
            case '7':
                return 7;
            case '8':
                return 8;
            case '9':
                return 9;
            case 'a':
            case 'A':
                return 10;
            case 'b':
            case 'B':
                return 11;
            case 'c':
            case 'C':
                return 12;
            case 'd':
            case 'D':
                return 13;
            case 'e':
            case 'E':
                return 14;
            case 'f':
            case 'F':
                return 15;
        }
        return 0;
    }
//    普通解法2
//    public static void main(String[] args){
//        Scanner in = new Scanner(System.in);
//        while (in.hasNext()){   //hasnext 是空行结束  //hasnextline 是回车结束
//            String str = in.next().substring(2);
//            System.out.println(Integer.parseInt(str,16));
//        }
//    }
//    普通解法3
//    public static void main(String[] args) throws Exception{
//        Scanner sc=new Scanner(System.in);
//        while (sc.hasNext()){
//            String str=sc.next();
//            System.out.println(Integer.decode(str));
//        }
//    }

//支持超长字符串相加
    public static String AddLongInteger(String addend, String augend){
        StringBuilder reverse_addend_sb = new StringBuilder(addend);
        StringBuilder reverse_augend_sb = new StringBuilder(augend);

        String reverse_addend = reverse_addend_sb.reverse().toString();
        String reverse_augend = reverse_augend_sb.reverse().toString();

        StringBuilder result = new StringBuilder();
        int len_addend = reverse_addend.length();
        int len_augend = reverse_augend.length();
        int len_min = Math.min(len_addend,len_augend);
        int tmp = 0;
        for(int i=0;i<len_min;i++){
            int sum = tmp+Integer.valueOf(""+reverse_addend.charAt(i))+Integer.valueOf(""+reverse_augend.charAt(i));
            result.append(sum%10);
            tmp = sum/10;
        }
        if(len_min == len_addend){
            for(int i=len_min;i<len_augend;i++){
                int sum = tmp+Integer.valueOf(""+reverse_augend.charAt(i));
                result.append(sum%10);
                tmp = sum/10;
            }
        }else {
            for(int i=len_min;i<len_addend;i++){
               int sum = tmp+Integer.valueOf(""+reverse_addend.charAt(i));
               result.append(sum%10);
               tmp = sum/10;
            }
        }
        if (tmp!=0){
            result.append(tmp);
        }
        return result.reverse().toString();
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){   //hasnext 是空行结束  //hasnextline 是回车结束
            String str = in.nextLine();
            String sum = "0";
            for(int i=2;i<str.length();i++){
                int x = switch2Int(str.charAt(i));
                String tmp = AddLongInteger(sum,sum);
                for (int j=0;j<14;j++){
                    tmp = AddLongInteger(tmp,sum);
                }
                sum = AddLongInteger(""+x,tmp);
            }
            System.out.println(sum);
        }
    }



}
