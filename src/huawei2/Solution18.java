package huawei2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 识别有效的ip地址和掩码，并进行分类统计
 *
 * 请解析IP地址和对应的掩码，进行分类识别。要求按照A/B/C/D/E类地址归类，不合法的地址和掩码单独归类。
 *
 * 所有的IP地址划分为 A,B,C,D,E五类
 *
 * A类地址1.0.0.0~126.255.255.255;
 *
 * B类地址128.0.0.0~191.255.255.255;
 *
 * C类地址192.0.0.0~223.255.255.255;
 *
 * D类地址224.0.0.0~239.255.255.255；
 *
 * E类地址240.0.0.0~255.255.255.255
 *
 *
 * 私网IP范围是：
 *
 * 10.0.0.0～10.255.255.255
 *
 * 172.16.0.0～172.31.255.255
 *
 * 192.168.0.0～192.168.255.255
 *
 *
 * 子网掩码为二进制下前面是连续的1，然后全是0。（例如：255.255.255.32就是一个非法的掩码）
 * 注意二进制下全是1或者全是0均为非法
 *
 * 注意：
 * 1. 类似于【0.*.*.*】的IP地址不属于上述输入的任意一类，也不属于不合法ip地址，计数时可以忽略
 * 2. 私有IP地址和A,B,C,D,E类地址是不冲突的
 */
public class Solution18 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int typeA = 0;
        int typeB = 0;
        int typeC = 0;
        int typeD = 0;
        int typeE = 0;
        int errorIpOrMaskCode = 0;
        int privIp = 0;

        while (scanner.hasNext()) {
            String ipt = scanner.nextLine();
            String[] ipAndMaskCode = ipt.split("~");
            String ip = ipAndMaskCode[0];
            String maskCode = ipAndMaskCode[1];
            // 判断格式
            if (!isValidFormat(ip) || !isValidFormat(maskCode)) {
                errorIpOrMaskCode++;
                continue;
            }

            // 判断掩码是否错误
            if (!validMaskCode(maskCode)) {
                errorIpOrMaskCode++;
                continue;
            }

            // 判断ip类别
            String fnStr = ip.substring(0, ip.indexOf("."));
            int fn = Integer.valueOf(fnStr);
            if (fn >= 1 && fn < 127) {
                // A
                typeA++;
            } else if (fn >= 128 && fn < 192) {
                // B
                typeB++;
            } else if (fn >= 192 && fn < 224) {
                // C
                typeC++;
            } else if (fn >= 224 && fn < 240) {
                // D
                typeD++;
            } else if (fn >= 240 && fn <= 255) {
                // E
                typeE++;
            }

            // 判断是否是私网IP
            String ipSubStr = ip.substring(ip.indexOf(".") + 1);
            String snStr = ipSubStr.substring(0, ipSubStr.indexOf("."));
            int sn = Integer.valueOf(snStr);
            if (fn == 10 || (fn == 172 && sn >= 16 && sn <= 31) || (fn == 192 && sn == 168)) {
                privIp++;
            }
//          System.out.printf("%d %d%n", fn, sn);

        }
        scanner.close();

        System.out.printf("%d %d %d %d %d %d %d%n", typeA, typeB, typeC, typeD, typeE, errorIpOrMaskCode, privIp);

    }

    /**
     * 判断ip和掩码是否是xxx.xxx.xxx.xxx格式Ø
     *
     * @param ip
     * @return
     */
    private static boolean isValidFormat(String ip) {
        boolean res = true;
        if (ip == null || "".equals(ip))
            return false;
        Pattern pattern = Pattern.compile("^(\\d+)\\.(\\d+)\\.(\\d+)\\.(\\d+)$");
        Matcher matcher = pattern.matcher(ip);

        if (matcher.matches()) {
            String[] nums = ip.split("\\.");
            for (String num : nums) {
                int n = Integer.valueOf(num);
                if (n < 0 || n > 255) {
                    res = false;
                    break;
                }
            }
        } else {
            res = false;
        }

        return res;
    }

    /**
     * 判断掩码是否是前面全为1后面全为0 的格式
     *
     * @param maskCode
     * @return
     */
    private static boolean validMaskCode(String maskCode) {
        boolean res = true;
        String[] nums = maskCode.split("\\.");
        StringBuilder sb = new StringBuilder();
        for (String num : nums) {
            int n = Integer.valueOf(num);
            sb.append(binaryString(n));
        }
        int firstIndexOf0 = sb.indexOf("0");
        int lastIndexOf1 = sb.lastIndexOf("1");
        if (firstIndexOf0 < lastIndexOf1) {
            res = false;
        }
        return res;
    }

    /**
     * 将整数转成对应的八位二进制字符串
     * @param num
     * @return
     */
    private static String binaryString(int num) {
        StringBuilder result = new StringBuilder();
        int flag = 1 << 7;
        for (int i = 0; i < 8; i++) {
            int val = (flag & num) == 0 ? 0 : 1;
            result.append(val);
            num <<= 1;
        }
        return result.toString();
    }


}
