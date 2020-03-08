package huawei2;

import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * 明明的随机数
 */
public class Solution3 {
//    public static void main(String[] args){
//        Scanner in = new Scanner(System.in);
//        while (in.hasNext()){
//            int N = in.nextInt();
//            TreeSet<Integer> set = new TreeSet<>();
//            for(int i=0;i<N;i++){
//                set.add(in.nextInt());
//            }
//            for(Integer i:set){
//                System.out.println(i);
//            }
//        }
//    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int N = in.nextInt();
            int[] arr = new int[N];
            for(int i=0;i<N;i++){
                arr[i]=in.nextInt();
            }
            Arrays.sort(arr);
            System.out.println(arr[0]);
            for (int i=1;i<N;i++){
                if(arr[i]!=arr[i-1]){
                    System.out.println(arr[i]);
                }
            }
        }
    }


}
