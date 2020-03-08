package huawei2;

import java.util.Scanner;

/**
 * 判断两个ip是否处于同一个子网
 */
public class Solution40 {

    private static boolean checkMask(String mask){
        String[] arr = mask.split("\\.");
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<arr.length;i++){
            String str = Integer.toBinaryString(Integer.parseInt(arr[i]));
            while (str.length()!=8)str="0"+str;
            sb.append(str);
        }
        int firstIndex = sb.indexOf("0");
        int lastIndex = sb.lastIndexOf("1");
        if(firstIndex<lastIndex)return false;
        return true;
    }

    private static boolean checkip(String ip){
        String[] strs = ip.split("\\.");
        for (int i=0;i<strs.length;i++){
                int value = Integer.parseInt(strs[i]);
                if(value<0 || value>255){
                    return false;
                }
        }
        return true;
    }

    private static int[] getIntArr(String ip){
        String[] ips = ip.split("\\.");
        int[] m = new int[ips.length];
        for (int i=0;i<ips.length;i++){
            m[i]=Integer.parseInt(ips[i]);
        }
        return m;
    }

    private static boolean getResult(String ip1,String ip2,String mask){
       int[] ips1 = getIntArr(ip1);
       int[] ips2 = getIntArr(ip2);
       int[] masks = getIntArr(mask);
       for (int i=0;i<ip1.length();i++){
           if((ips1[i]&masks[i])!=(ips2[i]&masks[i])){
               return false;
           }
       }
       return true;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            String mask = in.nextLine();
            String ip1 = in.nextLine();
            String ip2 = in.nextLine();
            if(checkMask(mask)||checkip(ip1)||checkip(ip2)){
                System.out.println(1);
            }else if(getResult(ip1,ip2,mask)){
                System.out.println(0);
            }else {
                System.out.println(2);
            }

        }
    }
}
