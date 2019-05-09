/**
 * 基本排序算法
 */
public class Sorting {

    public void swap(int[] arr,int a,int b){
        int tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
    }

    /**
     * 冒泡法，稳定的排序算法，原地排序算法，时间复杂度为O(n2)
     * @param arr
     * @param length
     */
    public void bubbleSort(int[] arr,int length){
        if(length<=1){
            return;
        }
        for(int i=0;i<length;i++){
            boolean flag = false;
            for(int j=0;j<length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    swap(arr,j,j+1);
                    flag = true;
                }
            }
            if(!flag){
                return;
            }
        }
    }

    /**
     * 插入排序 ，稳定的排序算法，原地排序算法，时间复杂度为O(n2)
     * @param arr
     * @param length
     */
    public void insertSort(int[] arr,int length){
        if(length<=1)return;
        for(int i=1;i<length;i++){
            int value = arr[i];
            int j = i-1;
            for (;j>=0;--j){
                if(arr[j]>value){
                    arr[j+1]=arr[j];
                }else {
                    break;
                }
            }
            arr[j+1]=value;
        }
    }

    /**
     * 选择排序
     * 从未排序数组中找最小的元素，交换放在已排序数组的末尾
     */
    public void choseSort(int[] arr,int length){
        if(length<=1)return;
        int minValue = arr[0];
        int minIndex = 0;
        for(int i=0;i<length;i++){
            for(int j=i;j<length;j++){
                if(minValue>arr[j]){
                    minValue = arr[j];
                    minIndex = j;
                }
            }
            swap(arr,i,minIndex);
        }
    }

    /**
     * 快排 原地排序 时间复杂度为nlogn 不稳定
     */
    public int partition(int[] arr,int left,int right){
        int key = arr[left];
        while (left<right){
            while (left<right && arr[right]>key){
                right--;
            }
            arr[left]=arr[right];

            while (left<right && arr[left]<=key){
                left++;
            }
            arr[right]=arr[left];
        }

        arr[left] = key;
        return left;
    }

    public void quickSort(int[] arr,int left,int right){
        if(left<right){
            int result = partition(arr,left,right);
            quickSort(arr,left,result-1);
            quickSort(arr,result+1,right);
        }
    }

}
