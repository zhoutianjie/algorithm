import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LettcodeSolution {
    /**
     * LettCode 习题
     * Serial: 78
     * difficulty: 中等
     * Description: 给定一组不含重复元素的整数数组nums，返回该数组所有可能的子集
     */
    //解法1 开始时输出子集为空，然后每一步都向子集添加新的整数，并且生成新的子集
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());
        for (int i=0;i<nums.length;i++){
            int resultSize = result.size();
            for (int j=0;j<resultSize;j++){
                List<Integer> list = result.get(j);
                List<Integer> newList = new ArrayList<>(list);
                newList.add(nums[i]);
                result.add(newList);
            }
        }
        return result;
    }

    /**
     * LettCode 习题
     * Serial: 90
     * difficulty: 中等
     * Description:给定一个可能包含重复元素的整数数组 nums，返回该数组所有可能的子集
     */
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());
        Arrays.sort(nums);
        int[] dp = new int[nums.length];//dp 表示当nums[i] 要加入集合的是时候，新生成的第一个子集对应的index，显然就是上一次集合对应的长度
        int j=0;
        int k=0;
        for (int i=0;i<nums.length;i++){
            int resultSize = result.size(); //nums[i] 还没有加入到集合里面，构成若干新子集，此时的集合长度
            if(i>0 && nums[i]==nums[i-1]){
                dp[i]=resultSize;
                k=dp[i-1];
            }else {
                dp[i]=resultSize;
                k=0;
            }
            for (j=k;j<resultSize;j++){
                List<Integer> list = result.get(j);
                List<Integer> newList = new ArrayList<>(list);
                newList.add(nums[i]);
                result.add(newList);
            }
        }
        return result;

    }

    //53 最大子序列和
    //假设sum[i]为已nums[i]结尾的最大连续子数组之和
    //那么sum[i]=Math.max(sum[i-1]+nums[i],nums[i])
    public int maxSubArray(int[] nums){
        int[] sum = new int[nums.length];
        sum[0]=nums[0];
        int maxSum = sum[0];
        for(int i=1;i<nums.length;i++){
            sum[i]=Math.max(sum[i-1]+nums[i],nums[i]);
            if(maxSum<sum[i]){
                maxSum = sum[i];
            }
        }
        return maxSum;
    }

    //62 不同路径

    /**
     * 一个机器人位于一个 m x n 网格的左上角 （起始点在下图中标记为“Start” ）。
     *
     * 机器人每次只能向下或者向右移动一步。机器人试图达到网格的右下角（在下图中标记为“Finish”）。
     *
     * 问总共有多少条不同的路径？
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/unique-paths
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     * dp[i][j]=dp[i-1][j]+dp[i][j-1]
     * @param m
     * @param n
     * @return
     */
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        int maxValue = Integer.MIN_VALUE;
        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                if(i==0 || j==0){
                    dp[i][j]=1;
                }else {
                    dp[i][j]=dp[i-1][j]+dp[i][j-1];
                }
                maxValue = Math.max(maxValue,dp[i][j]);
            }
        }
        return maxValue;
    }

    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }

    //695 岛屿的最大面积
    public int maxAreaOfIsland(int[][] grid) {
        int maxValue = 0;
        for (int i=0;i<grid.length;i++){
            for (int j=0;j<grid[0].length;j++){
                int area = area(grid,i,j);
                maxValue = Math.max(maxValue,area);
            }
        }
        return maxValue;
    }

    private int area(int[][] grid,int i,int j){
        if(i==grid.length || i<0){
            return 0;
        }else if(j==grid[0].length || j<0){
            return 0;
        }
        if(grid[i][j]==1){
            grid[i][j]=0;
            return 1+area(grid,i-1,j)+area(grid,i+1,j)+area(grid,i,j-1)+area(grid,i,j+1);
        }
        return 0;
    }

    







}
