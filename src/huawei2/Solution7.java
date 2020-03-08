package huawei2;

import java.util.Scanner;

/**
 * 取近似值
 * 写出一个程序，接受一个正浮点数值，输出该数值的近似整数值。
 * 如果小数点后数值大于等于5,向上取整；小于5，则向下取整
 */
public class Solution7 {

    private static int getResult(float a){
        int b = (int) a;
        if((a-b)>=0.5)return b+1;
        else return b;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            float a = in.nextFloat();
            System.out.println(getResult(a));
        }
    }
}
