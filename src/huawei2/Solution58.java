package huawei2;

import java.util.Scanner;

/**
 * 高精度整数相加
 * 长整数相加
 */
public class Solution58 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            String add = in.nextLine().trim();
            String augend = in.nextLine().trim();
            System.out.println(AddLongInteger(add,augend));
        }
    }
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
}
