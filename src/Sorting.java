import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

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

    /**
     * 归并排序
     */

    /**
     * 堆排
     */


    /**
     * 三数之和(先排序)
     */
    public List<List<Integer>> threeSum(int[] nums) {
        //先排序
        Arrays.sort(nums);
        List<List<Integer>> result = new LinkedList<>();
        int lo ;
        int hi ;
        //i的下标表示的是第一个数，考虑到三个数的相加，所以i的下标最多是len-3
        for(int i=0;i<nums.length-2;i++){
            if(i==0 || i>0 && nums[i]!=nums[i-1]){
                lo = i+1;
                hi = nums.length-1;
                int sum=-nums[i];
                while(lo<hi){
                    if(nums[lo]+nums[hi]==sum){
                        result.add(Arrays.asList(nums[i],nums[lo],nums[hi]));
                        while(lo<hi && nums[lo]==nums[lo+1])lo++;
                        while(lo<hi && nums[hi]==nums[hi-1])hi--;
                        lo++;hi--;
                    }else if(nums[lo]+nums[hi]<sum){
                        lo++;
                    }else{
                        hi--;
                    }
                }
            }
        }
        return result;
    }


    public List<List<Integer>> threeSum1(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
            if(i==0 || i>0 && nums[i]!=nums[i+1]){
                int low=i+1;
                int high=nums.length-1;
                int sum = -nums[i];
                while (low<high){
                    if(nums[low]+nums[high] == sum){
                        result.add(Arrays.asList(nums[i],nums[low],nums[high]));
                        while (low<high && nums[low]==nums[low+1])low++;
                        while (low<high && nums[high]==nums[high-1])high--;
                    }else if(nums[low]+nums[high]<sum){
                        low++;
                    }else {
                        high--;
                    }
                }
            }
        }
        return result;
    }

    /**
     * 求众数
     */
}
