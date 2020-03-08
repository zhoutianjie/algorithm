package huawei2;

import java.util.*;

/**
 * 称砝码
 * 现有一组砝码，重量互不相等，分别为m1,m2,m3…mn；
 * 每种砝码对应的数量为x1,x2,x3...xn。现在要用这些砝码去称物体的重量(放在同一侧)，问能称出多少种不同的重量。
 *
 *
 * 注：
 *
 * 称重重量包括0
 */
public class Solution42 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int n = in.nextInt();
            int[] weights = new int[n];
            int[] number = new int[n];
            for(int i=0;i<n;i++){
                weights[i]=in.nextInt();
            }
            for (int i=0;i<n;i++){
                number[i]=in.nextInt();
            }
            System.out.println(getResult(n,weights,number));
        }

    }

    private static int getResult(int n,int[] weights,int[] number){
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<=number[0];i++){
            set.add(i*weights[0]);
        }
        for (int i=1;i<n;i++){
            List<Integer> list = new ArrayList<>(set);
            for(int j=0;j<=number[i];j++){
                for (int k=0;k<list.size();k++){
                    set.add(list.get(k)+j*weights[i]);
                }
            }
        }
        return set.size();
    }
}
