import threads.lettcode_1116.IntConsumer;
import threads.lettcode_1116.ZeroEvenOdd;

public class Main {

    public static void main(String[] args){
        int[] nums = new int[]{1,3,5,6};
        int[] numss = new int[]{0,0,1,1,1,2,2,3,3,4};
        int result = new LettCode().searchInsert(nums,2,1);
        System.out.println(result);
    }
}
