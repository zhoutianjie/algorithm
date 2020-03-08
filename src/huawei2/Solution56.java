package huawei2;

import java.util.Scanner;

/**
 * 挑7
 * 输出7有关数字的个数，包括7的倍数，还有包含7的数字（如17，27，37...70，71，72，73...）的个数（一组测试用例里可能有多组数据，请注意处理）
 */
public class Solution56 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int n = in.nextInt();
            System.out.println(getResult(n));
        }
    }

    public static int getResult(int n){
        int cnt = 0;
        for(int i=1;i<=n;i++){
            if(about7(i)){
                cnt++;
            }
        }
        return cnt;
    }

    private static boolean about7(int k){
        if(k%7==0){
            return true;
        }

        while (k!=0){
            if(k%10==7){
                return true;
            }
            k=k/10;
        }

        return false;

    }
}
