import java.util.HashMap;

/**
 * 二分查找
 * logn的时间复杂度 有序数组
 */
public class BinarySearch {

    /**
     * 非递归实现
     * @param arr
     * @param n
     * @param value
     * @return
     */
   public int search(int[] arr,int n,int value){
       int low = 0;
       int high = n-1;
       while (low<=high){
           int mid = low+(high-low)>>1;
           if(arr[mid] == value){
               return mid;
           }else if(value<arr[mid]){
               high = mid-1;
           }else {
               low = mid+1;
           }
       }
       return -1;
   }

    /**
     * 要求时间复杂度为线性，不使用额外的空间（不太理解是什么意思）
     * @param nums
     * @return
     */
    public int singleNumber(int[] nums) {
       //异或法，相同的数字异或以后为0
        int num = 0;
        for (int i=0;i<nums.length;++i){
            num = num^nums[i];
        }
        return num;
    }

}
