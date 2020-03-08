package huawei2;

import java.util.Scanner;

/**
 * 合唱队
 * 计算最少出列多少位同学，使得剩下的同学排成合唱队形
 * 说明：
 * N位同学站成一排，音乐老师要请其中的(N-K)位同学出列，使得剩下的K位同学排成合唱队形。
 * 合唱队形是指这样的一种队形：设K位同学从左到右依次编号为1，2…，K，他们的身高分别为T1，T2，…，TK，   则他们的身高满足存在i（1<=i<=K）使得T1<T2<......<Ti-1<Ti>Ti+1>......>TK。
 * 你的任务是，已知所有N位同学的身高，计算最少需要几位同学出列，可以使得剩下的同学排成合唱队形。
 * 动态规划最长递增子序列的解法
 */
public class Solution24 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int N = in.nextInt();
            int[] arr = new int[N];
            for(int i=0;i<N;i++){
                arr[i]=in.nextInt();
            }
            System.out.println(getResult(arr,N));
        }
    }

    private static int getResult(int[] arr,int n){
        //求左右每个位置对应的最长子序列的长度，在相加求最大值，然后n减去最大值就是最终的结果
        int[] dpl = new int[n]; //从左到右的子序列长度
        int[] dpr = new int[n]; //从右到左子序列的长度
        for(int i=0;i<n;i++){
            dpl[i]=1;
            for(int j=0;j<i;j++){
                if(arr[j]<arr[i]){
                    dpl[i]=Math.max(dpl[i],dpl[j]+1);
                }
            }
        }

        for(int i=n-1;i>=0;i--){
            dpr[i]=1;
            for (int j=n-1;j>i;j--){
                if(arr[j]<arr[i]){
                    dpr[i] = Math.max(dpr[i],dpr[j]+1);
                }
            }
        }

        int max = 0;
        for (int i=0;i<n;i++){
            if(max<dpl[i]+dpr[i]){
                max=dpl[i]+dpr[i];
            }
        }

        return n-max+1;
    }


}
