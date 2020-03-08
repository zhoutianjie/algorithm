package huawei2;

import java.util.Scanner;

/**
 * 输入n个整数，输出其中最小的k个
 * 可以用排序来做，最好用堆排(复习一下堆排) 这里是小顶堆 0(n)
 */
public class Solution59 {
    private static void swap(int[] arr,int i,int j){
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    /**
     * 堆化某个节点
     * @param arr
     * @param len
     */
    private static void heapfily(int[] arr,int i,int len){
        while (true){
            int minPos = i;
            if(2*i+1<len && arr[2*i+1]<arr[minPos])minPos=2*i+1;
            if(2*i+2<len && arr[2*i+2]<arr[minPos])minPos=2*i+2;
            swap(arr,i,minPos);
            if(minPos == i){
                break;
            }
            i=minPos;
        }
    }

    private static void buildHeap(int[] arr,int len){
        //找到最后一个非叶子节点
        for(int i=(len-2)/2;i>=0;i--){
            heapfily(arr,i,len);
        }
    }

    private static void heapSort(int[] arr,int len,int k){
        StringBuilder sb = new StringBuilder();
        buildHeap(arr,len);
        for(int j=len-1;j>0;j--){
            swap(arr,0,j);
            if(k>0){
               sb.append(arr[j]+" ");
            }
            k--;
            if(k<=0){
                break;
            }
            heapfily(arr,0,j);
        }
        System.out.println(sb.toString().trim());
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int N = in.nextInt();
            int k = in.nextInt();
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = in.nextInt();
            }
            heapSort(arr,arr.length,k);
        }
    }


}
