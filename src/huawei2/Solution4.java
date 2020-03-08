package huawei2;
import java.util.Scanner;

/**
 * 字符串分割
 */
public class Solution4 {
    public static void main(String[] args){
        Scanner in  = new Scanner(System.in);
        while (in.hasNext()){
            String str = adjust(in.nextLine());
            for(int i=0;i<str.length();i=i+8){
                System.out.println(str.substring(i,i+8));
            }

        }
    }

    private static String adjust(String str){
        int len = str.length();
        int n = len % 8;
        if( n!=0){
            StringBuilder sb = new StringBuilder(str);
            for (int i=0;i<8-n;i++){
                sb.append(0);
            }
            return sb.toString();
        }
        return str;
    }
}
