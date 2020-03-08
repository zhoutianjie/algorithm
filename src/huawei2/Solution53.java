package huawei2;

import java.util.Scanner;

/**
 * 计算字符串的距离
 * Levenshtein 距离，又称编辑距离，指的是两个字符串之间，由一个转换成另一个所需的最少编辑操作次数。许可的编辑操作包括将一个字符替换成另一个字符，插入一个字符，删除一个字符。编辑距离的算法是首先由俄国科学家Levenshtein提出的，故又叫Levenshtein Distance。
 *
 * Ex：
 *
 * 字符串A:abcdefg
 *
 * 字符串B: abcdef
 *
 * 通过增加或是删掉字符”g”的方式达到目的。这两种方案都需要一次操作。把这个操作所需要的次数定义为两个字符串的距离。
 *
 * 要求：
 *
 * 给定任意两个字符串，写出一个算法计算它们的编辑距离。
 * 字符串编辑距离
 *
 * 字符串的编辑距离，又称为Levenshtein距离，由俄罗斯的数学家Vladimir Levenshtein在1965年提出。是指利用字符操作，把字符串A转换成字符串B所需要的最少操作数。其中，字符操作包括：
 *
 * 删除一个字符
 * 插入一个字符
 * 修改一个字符
 * 例如对于字符串"if"和"iff"，可以通过插入一个'f'或者删除一个'f'来达到目的。
 *
 * 问题描述：给定两个字符串A和B，求字符串A至少经过多少步字符操作变成字符串B。
 *
 * 我们先以一个例子分析，比如eat变成tea。对于第一个字符，e != a，所以要想让这两个字符相等，有三种可以选择的办法
 *
 * 修改字符，将e直接变成a，需要走1步。
 * 插入字符，在e的前面插入a，也需要走1步。
 * 删除字符，将e删除，然后比较后面的与a，也需要走1步。
 * 如果是 e==a，那么就可以直接跳过这个字符比较下面的字符，那么他们的距离也就是前面一步的举例了。
 *
 * 经过举例子分析，很容易发现这是一个动态规划问题，那么我们就按照动态规划的一套方法来求解。
 *
 * 1、维护一个dp数组，其中dp[i][j]表示s1[0]---s1[i]和s2[0]--s2[j]相同需要进行的最少步骤；
 *
 * 2、边界条件初始化，dp[i][0]=i，相当于将s1挨个变成空所要进行的步数，对于dp[0][j]=j同理；
 *
 * 3、状态转移方程，我们要得到dp[i][j]的值，假设s1[i-1]和s2[j-1]之前的都已经相等了，那么如果s1[i]==s2[j]，显然不需要进行操作，dp[i][j]==dp[i-1][j-1]；如果s1[i]!=s2[j]，那么到达dp[i][j]的就有三条路，分别从dp[i-1][j-1]、dp[i-1][j]、dp[i][j-1]，对应的含义分别是修改字符、删除字符和插入字符，在三种操作下，经历的步数都要+1，所以我们只要找三者的最小值然后+1就可以了。
 *
 * 这个题目有一种巧妙的理解办法，就是画表格。画表格法在动态规划太有用了！！！特别是处理这种数组是二维的情况，可以直观的理解状态转移的过程，非常值得学习。
 */
public class Solution53 {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            String str1 = in.nextLine();
            String str2 = in.nextLine();
            System.out.println(getResult(str1,str2));
        }
    }

    public static int getResult(String str1,String str2){
        int[][] dp = new int[str1.length()+1][str2.length()+1];
        for(int i=0;i<dp.length;i++){
            dp[i][0]=i;
        }
        for(int j=0;j<dp[0].length;j++){
            dp[0][j]=j;
        }

        for(int i=1;i<dp.length;i++){
            for(int j=1;j<dp[0].length;j++){
                if(str1.charAt(i-1)==str2.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1];
                }else {
                    dp[i][j]= min(dp[i-1][j-1],dp[i-1][j],dp[i][j-1])+1;
                }
            }
        }
        return dp[dp.length-1][dp[0].length-1];
    }

    private static int min(int a,int b,int c){
        return Math.min(a,Math.min(b,c));
    }



}
