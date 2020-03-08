package huawei2;

import java.util.Scanner;

/**
 * 字符串运用，密码截取
 */
public class Solution33 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String str = in.nextLine();
            System.out.println(getMaxLen(str));
        }
    }

    private static int getMaxLen(String password){
        char[] chs = password.toCharArray();
        int maxLen = 0;
        for(int i=0;i<chs.length;i++){
            int len1 = getParamLen(chs,i,i);
            int len2 = getParamLen(chs,i,i+1);
            if(maxLen<len1){
                maxLen = len1;
            }
            if(maxLen<len2){
                maxLen = len2;
            }
        }
        return maxLen;
    }

    private static int getParamLen(char[] arry,int i,int j){
        int m=0;
        while (i>=0 && j<=arry.length-1 && i<=j){
            if(arry[i] == arry[j]){
                m=j-i+1;
                i--;j++;
            }else {
                break;
            }
        }
        return m;
    }
}
