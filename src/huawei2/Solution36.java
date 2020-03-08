package huawei2;

import java.util.Scanner;

/**
 * 蛇形矩阵
 * 题目说明
 *
 * 蛇形矩阵是由1开始的自然数依次排列成的一个矩阵上三角形。
 *
 *
 *
 *
 *
 *
 *
 * 样例输入
 *
 * 5
 *
 * 样例输出
 *
 * 1 3 6 10 15
 *
 * 2 5 9 14
 *
 * 4 8 13
 *
 * 7 12
 *
 * 11
 *
 * 接口说明
 *
 * 原型
 *
 * void GetResult(int Num, char * pResult);
 *
 * 输入参数：
 *
 *         int Num：输入的正整数N
 *
 * 输出参数：
 *
 *         int * pResult：指向存放蛇形矩阵的字符串指针
 *
 *         指针指向的内存区域保证有效
 *
 * 返回值：
 *
 *         void
 */
public class Solution36 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int N = in.nextInt();
            int first_col = 1;
            for(int i=1;i<=N;i++){
                System.out.print(first_col);
                int tmp = first_col;
                for (int j = i+1;j<=N;j++){
                    tmp+=j;
                    System.out.print(" "+tmp);
                }
                System.out.println();
                first_col+=i;
            }
        }
        in.close();
    }

}
