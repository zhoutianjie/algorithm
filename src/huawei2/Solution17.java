package huawei2;

import java.util.Scanner;

/**
 * 坐标移动
 * 开发一个坐标计算工具， A表示向左移动，D表示向右移动，W表示向上移动，S表示向下移动。从（0,0）点开始移动，从输入字符串里面读取一些坐标，并将最终输入结果输出到输出文件里面
 */
public class Solution17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String s = in.nextLine();
            String[] str = s.split(";");
            int row = 0;
            int column = 0;

            for (int i = 0; i < str.length; i++) {
                if (str[i].length() <= 3) {
                    if (str[i].charAt(0) == 'A' && str[i].substring(1).matches("[0-9]+")) {
                        row -= Integer.parseInt(str[i].substring(1));
                    }

                    if (str[i].charAt(0) == 'D' && str[i].substring(1).matches("[0-9]+")) {
                        row += Integer.parseInt(str[i].substring(1));
                    }

                    if (str[i].charAt(0) == 'W' && str[i].substring(1).matches("[0-9]+")) {
                        column += Integer.parseInt(str[i].substring(1));
                    }

                    if (str[i].charAt(0) == 'S' && str[i].substring(1).matches("[0-9]+")) {
                        column -= Integer.parseInt(str[i].substring(1));
                    }
                }
            }

            System.out.println(row + "," + column);
        }

    }
}
