package huawei2;

import java.util.Scanner;
import java.util.Stack;

/**
 * 整数与IP地址间的转换
 */
public class Solution34 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            String ip = in.next();
            long ip_long = in.nextLong();
            System.out.println(convert2longip(ip));
            System.out.println(convert2long(ip_long));
        }
    }

    private static long convert2longip(String ip){
        String[] ips = ip.split("\\.");
        int k=24;
        long sum=0;
        for (int i=0;i<3;i++,k=k-8){
            sum=sum+(Long.parseLong(ips[i])<<k); //一定要加括号，移位操作的优先级比+-要低
        }
        sum+=Long.parseLong(ips[ips.length-1]);
        return sum;
    }

    private static String convert2long(long ip){
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<4;i++){
            stack.push((int) (ip&255));
            ip>>=8;
        }
        while (!stack.isEmpty()){
            sb.append(stack.pop());
            sb.append(".");
        }
        return sb.toString().substring(0,sb.length()-1);

    }
}
