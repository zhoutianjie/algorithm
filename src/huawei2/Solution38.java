package huawei2;

import java.util.Scanner;

/**
 * 统计每个月兔子的总数
 *有一只兔子，从出生后第3个月起每个月都生一只兔子，小兔子长到第三个月后每个月又生一只兔子，假如兔子都不死，问每个月的兔子总数为多少？
 *
 */
public class Solution38 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int mounth = in.nextInt();
            System.out.println(getTotalCount(mounth));
        }
    }

    private static int getTotalCount(int month){
        if(month == 1 || month == 2){
            return 1;
        }
        return getTotalCount(month-1)+getTotalCount(month-2);
    }
}
