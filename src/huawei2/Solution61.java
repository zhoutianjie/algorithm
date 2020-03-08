package huawei2;

import java.util.Scanner;

/**
 * 查找组成一个偶数最接近的两个素数
 */
public class Solution61 {
    public static boolean isPrime(int i){
        if(i== 1){
            return false;
        }
        for(int j=2;j<=Math.sqrt(i*1.0);j++){
            if(i%j == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int num = in.nextInt();
            int prime1=0;
            int prime2=0;
            for(int i=1;i<=num/2;i++){
                if(isPrime(i) && isPrime(num-i)){
                    prime1 = i;
                    prime2 = num-i;
                }
            }
            System.out.println(prime1);
            System.out.println(prime2);

        }
    }
}
