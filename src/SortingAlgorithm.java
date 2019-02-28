/**
 * 排序算法
 */
public class SortingAlgorithm {

    public static void swap(int[] arr,int a,int b){
        int tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
    }

    /**
     * 自上而下堆化
     * @param arr
     * @param count 堆大小，可以理解为数组大小
     * @param i 所要堆化的结点下标
     */
    public static void heapify(int[] arr,int count,int i){
       while (true){
           int maxPos = i;
           if(2*i+1<count && arr[i]<arr[2*i+1])maxPos = 2*i+1;
           if(2*i+2<count && arr[maxPos]<arr[2*i+2])maxPos = 2*i+2;
           if(maxPos == i)break;
           swap(arr,i,maxPos);
           i=maxPos;
       }
    }

    /**
     * 建堆 从最后一个非叶子节点自上而下，从后向前堆化
     * @param arr
     * @param length 数组长度
     */
    public static void buildHeap(int[] arr,int length){
        int index = (length-1-1)/2;//最后一个非叶子节点的下标
        for(int i=index;i>=0;i--){
            heapify(arr,length,i);
        }
    }

    /**
     * 建堆并排序
     * @param arr
     * @param length
     */
    public static void heapSort(int[] arr,int length){
        buildHeap(arr,length);
        for (int j = length-1;j>0;j--){
            swap(arr,0,j);
            heapify(arr,j,0);
        }
    }
}
