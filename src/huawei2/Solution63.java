package huawei2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Solution63 {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String str = in.next();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<str.length();i++){
          char c = str.charAt(i);
          if(i==0){
              sb.append(c);
          } else if(Character.isLetter(c) && Character.isDigit(str.charAt(i-1))){
              sb.append(" ");
              sb.append(c);
          }else {
              sb.append(c);
          }
        }
        String[] strs = sb.toString().split(" ");
        Arrays.sort(strs, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int num1 = getStrEndNum(o1);
                int num2 = getStrEndNum(o2);
                if(num1!=num2){
                    return num1-num2;
                }else {
                    String str1 = getStrBegin(o1);
                    String str2 = getStrBegin(o2);
                    if(str1.length()!=str2.length()){
                        return str1.length()-str2.length();
                    }else {
                        return getStrBegin(o1).compareTo(getStrBegin(o2));
                    }
                }
            }
        });
        StringBuilder result = new StringBuilder();
        for (String s:strs){
            String begin = getStrBegin(s);
            int num = getStrEndNum(s);
            for (int i=0;i<num;i++){
                result.append(begin);
            }
        }
        System.out.println(result.toString());

    }

    private static int getStrEndNum(String str){
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            if(Character.isDigit(c)){
                sb.append(c);
            }
        }
        int num = Integer.parseInt(sb.toString());
        return num;
    }

    private static String getStrBegin(String str){
        StringBuilder sb = new StringBuilder();
        for (int i=0;i<str.length();i++){
            char c = str.charAt(i);
            if(Character.isLetter(c)){
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
