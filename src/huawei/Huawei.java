package huawei;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;
import com.sun.org.apache.xml.internal.security.algorithms.Algorithm;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.io.UnsupportedEncodingException;
import java.text.DecimalFormat;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Huawei {
//1.字符串最后一个单词的长度
//    public static void main(String[] args){
//        Scanner in = new Scanner(System.in);
//        String str = in.nextLine();
//        String[] strs = str.split(" ");
//        System.out.println(strs[strs.length-1].length());
//    }
//2.计算字符个数
//    public static void main(String[] args){
//        Scanner in = new Scanner(System.in);
//        String str = in.nextLine().toUpperCase();
//        Character c = in.nextLine().toUpperCase().charAt(0);
//        int cnt = 0;
//        for(int i=0;i<str.length();i++){
//            if(str.charAt(i) == c){
//                cnt++;
//            }
//        }
//        System.out.println(cnt);
//    }
//字符串逆序
//    public static void main(String[] args){
//        Scanner in = new Scanner(System.in);
//        String str = in.nextLine();
//        String result = "";
//        for(int i=str.length()-1;i>=0;i--){
//            result+=str.charAt(i);
//        }
//        System.out.println(result);
//    }
//字符串分割
//    public static void main(String[] args){
//        Scanner scanner = new Scanner(System.in);
//        List<String> list = new ArrayList<>();
//        while (scanner.hasNext()){
//            String str = scanner.nextLine();
//            int count = 8;
//            if(str != ""){
//                String adjustStr = adjust(str);
//                for(int i=0;i<adjustStr.length();i+=count){
//                    String substr = adjustStr.substring(i,i+count);
//                    System.out.println(substr);
//                }
//            }
//
//        }
//
//    }
//
//    public static String adjust(String str){
//       int m = str.length()%8;
//       if(m == 0){
//           return str;
//       }else {
//           for(int i=0;i<8-m;i++){
//               str+="0";
//           }
//           return str;
//       }
//
//    }


//16进制转10进制
//    public static void main(String[] args){
//        Scanner in = new Scanner(System.in);
//        while (in.hasNextLine()){   //hasnext 是空行结束  //hasnextline 是回车结束
//            String str = in.nextLine();
//            int sum = 0;
//            for(int i=2;i<str.length();i++){
//                int x = switch2Int(str.charAt(i));
//                sum = x+16*sum;
//            }
//            String result = String.valueOf(sum);
//            System.out.println(result); //牛客网的bug必须用println
//        }
//    }
//
//    public static int switch2Int(char c){
//        switch (c){
//            case '1':
//                return 1;
//            case '2':
//                return 2;
//            case '3':
//                return 3;
//            case '4':
//                return 4;
//            case '5':
//                return 5;
//            case '6':
//                return 6;
//            case '7':
//                return 7;
//            case '8':
//                return 8;
//            case '9':
//                return 9;
//            case 'a':
//            case 'A':
//                return 10;
//            case 'b':
//            case 'B':
//                return 11;
//            case 'c':
//            case 'C':
//                return 12;
//            case 'd':
//            case 'D':
//                return 13;
//            case 'e':
//            case 'E':
//                return 14;
//            case 'f':
//            case 'F':
//                return 15;
//        }
//        return 0;
//    }
    //输出所有的质数因子
//    public static void main(String[] args){
//        Scanner in = new Scanner(System.in);
//        long n = in.nextLong();
//        String result = getResult(n);
//        System.out.println(result);
//    }
//
//    public static String getResult(long n){
//        StringBuilder sb = new StringBuilder();
//        for(int i=2;i<=n;i++){
//            while (n%i == 0){
//                sb.append(i+" ");
//                n/=i;
//            }
//        }
//        return sb.toString();
//    }
    //取近似值
//    public static void main(String[] args){
//        Scanner in = new Scanner(System.in);
//        float value = in.nextFloat();
//        int num = (int) value;
//        float x = value-(float) num;
//        if(x >=0.5){
//            num++;
//        }
//        System.out.println(num);
//    }

    //合并表记录
//    public static void main(String[] args){
//        Scanner in = new Scanner(System.in);
//        Map<Integer,Integer> map = new TreeMap<>();
//        int n = 0;
//        while (in.hasNext()){
//            n = in.nextInt();
//            for(int i=0;i<n;i++){
//                int key = in.nextInt();
//                int value = in.nextInt();
//                if(map.containsKey(key)){
//                    map.put(key,map.get(key)+value);
//                }else {
//                    map.put(key,value);
//                }
//            }
//            for (Integer key:map.keySet()){
//                System.out.println(key+" "+map.get(key));
//            }
//        }
//    }
    //字符串反转
//    public static void main(String[] args){
//        Scanner in = new Scanner(System.in);
//        String str = in.nextLine();
//        StringBuilder sb = new StringBuilder(str);
//        sb.reverse();
//        String result = sb.toString();
//        System.out.println(result);
//    }

    //最小公倍数
//    public static void main(String[] args){
//        Scanner in = new Scanner(System.in);
//        int a = in.nextInt();
//        int b = in.nextInt();
//        System.out.println(a*b/gcd(a,b));
//    }
//
//    public static int gcd(int a,int b){
//        return b==0 ? a:gcd(b, a%b);
//    }
    //提取不重复的整数
//    public static void main(String[] args){
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        boolean[] flags = new boolean[10];
//        int num = 0;
//        while (n!=0){
//            if(!flags[n%10]){
//                flags[n%10] = true;
//                num = 10*num+n%10;
//            }
//            n/=10;
//        }
//        System.out.println(num);
//    }
    //字符个数统计
//    public static void main(String[] args){
//        Scanner in = new Scanner(System.in);
//        String str = in.nextLine();
//        int[] flags = new int[128];
//        for(int i=0;i<str.length();i++){
//            if(flags[str.charAt(i)] == 0){
//                flags[str.charAt(i)]=1;
//            }
//        }
//        int cnt =0;
//        for(int i=0;i<flags.length;i++){
//            if(flags[i] == 1){
//                cnt++;
//            }
//        }
//        System.out.println(cnt);
//    }
    //数字颠倒
//    public static void main(String[] args){
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        StringBuilder sb = new StringBuilder();
//        while (n!=0){
//            sb.append(n%10);
//            n/=10;
//        }
//        System.out.println(sb.toString());
//    }
    //句子逆序
//    public static void main(String[] args){
//        Scanner in = new Scanner(System.in);
//        String str = in.nextLine();
//        System.out.println(reverse(str));
//    }
//    public static String reverse(String sentence){
//        String[] strs = sentence.split(" ");
//        StringBuilder sb = new StringBuilder();
//        for(int i= strs.length-1;i>=0;i--){
//            if(i==0){
//                sb.append(strs[i]);
//            }else {
//                sb.append(strs[i]);
//                sb.append(" ");
//            }
//        }
//        return sb.toString();
//    }
    //字符串的连接最长路径查找
//    public static void main(String[] args){
//        Scanner in = new Scanner(System.in);
//        while (in.hasNext()){
//            int len = in.nextInt();
//            String[] arr = new String[len];
//            int k=0;
//            for(int i=0;i<len;i++){
//                String str = in.next();//不能在nextInt或者next后面接着用nextLine() 会导致nextLine第一次读到的是空格，所以这里用next。或者调用完nextInt以后多调用一次nextLine()
//                arr[k] = str;
//                k++;
//            }
//
//            bubbleSort(arr,arr.length);
//            for(int i=0;i<arr.length;i++){
//                System.out.println(arr[i]);
//            }
//        }
//    }
//
//    public static void bubbleSort(String[] arr,int length){
//        boolean isSwap = false;
//        for(int i=0;i<length;i++){
//            isSwap = false;
//            for(int j=0;j<length-i-1;j++){
//                if(arr[j].compareTo(arr[j+1])>0){
//                    swap(arr,j,j+1);
//                    isSwap = true;
//                }
//            }
//            if(!isSwap){
//                return;
//            }
//
//        }
//    }
//    public static void swap(String[] arr,int a,int b){
//        String tmp = arr[a];
//        arr[a] = arr[b];
//        arr[b] = tmp;
//    }
    //字符串连接最长路径
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        String [] ss = new String[num];
//        for (int i = 0; i < num; i++) {
//            ss[i]=sc.next();
//        }
//        Arrays.sort(ss);
//        for (int i = 0; i < ss.length; i++) {
//            System.out.println(ss[i]);
//        }
//    }
    //求int类型数据在内存中存储的1的个数
//    public static void main(String[] args){
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        int cnt = 0;
//        while (n!=0){
//            if((n&1) !=0 ){
//                cnt++;
//            }
//            n=n>>1;
//        }
//        System.out.println(cnt);
//    }
    //明明的随机数待修改
//    public static void main(String[] args){
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        List<Integer> list = new ArrayList<>();
//        int k=0;
//        int[] flags = new int[1000];
//        for(int i=0;i<n;i++){
//            int num = in.nextInt();
//            if(flags[num] == 0){
//                flags[num] = 1;
//                list.add(num);
//            }
//        }
//        Collections.sort(list);
//        for(int i=0;i<list.size();i++){
//            System.out.println(list.get(i));
//        }
//
//    }

//明明的随机数
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        while(sc.hasNext()){
//
//            TreeSet<Integer> set=new TreeSet<Integer>();
//            int n=sc.nextInt();
//            if(n>0){
//                for(int i=0;i<n;i++){
//                    set.add(sc.nextInt());
//                }
//            }
//            for(Integer i:set){
//                System.out.println(i);
//            }
//        }
//    }
    //坐标移动


//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        while (in.hasNext()) {
//            String s = in.nextLine();
//            String[] str = s.split(";");
//            int row = 0;
//            int column = 0;
//
//            for (int i = 0; i < str.length; i++) {
//                if (str[i].length() <= 3) {
//                    if (str[i].charAt(0) == 'A' && str[i].substring(1).matches("[0-9]+")) {
//                        row -= Integer.parseInt(str[i].substring(1));
//                    }
//
//                    if (str[i].charAt(0) == 'D' && str[i].substring(1).matches("[0-9]+")) {
//                        row += Integer.parseInt(str[i].substring(1));
//                    }
//
//                    if (str[i].charAt(0) == 'W' && str[i].substring(1).matches("[0-9]+")) {
//                        column += Integer.parseInt(str[i].substring(1));
//                    }
//
//                    if (str[i].charAt(0) == 'S' && str[i].substring(1).matches("[0-9]+")) {
//                        column -= Integer.parseInt(str[i].substring(1));
//                    }
//                }
//            }
//
//            System.out.println(row + "," + column);
//        }
//
//    }
    //删除字符串中出现次数最少的字符
//    public static void main(String[] args){
//        Scanner in = new Scanner(System.in);
//        while (in.hasNext()){
//            String line = in.nextLine();
//            int[] a = new int[26];
//            int min = Integer.MAX_VALUE;
//            for(int i=0;i<line.length();i++){
//               int index = line.charAt(i)-'a';
//               a[index]++;
//               if(a[index]<min){
//                   min = a[index];
//               }
//            }
//            StringBuilder sb = new StringBuilder();
//            for(int i=0;i< line.length();i++){
//                int index = line.charAt(i)-'a';
//                if(a[index]!=min){
//                    sb.append(line.charAt(i));
//                }
//            }
//            System.out.println(sb.toString());
//        }
//    }
    //字符串排序
//    public static void main(String[] args){
//        Scanner in = new Scanner(System.in);
//        while (in.hasNext()){
//            String str = in.nextLine();
//            List<Character> list = new ArrayList<>();
//            char[] ss = str.toCharArray();
//            for(char c:ss){
//                if(Character.isLetter(c)){
//                    list.add(c);
//                }
//            }
//            Collections.sort(list, new Comparator<Character>() {
//                @Override
//                public int compare(Character o1, Character o2) {
//                    return Character.toLowerCase(o1)-Character.toLowerCase(o2);
//                }
//            });
//            StringBuilder sb = new StringBuilder();
//            int total = 0;
//            for(char c:ss){
//                if(Character.isLetter(c)&& total<list.size()){
//                    sb.append(list.get(total));
//                    total++;
//                }else {
//                    sb.append(c);
//                }
//            }
//            System.out.println(sb.toString());
//        }
//    }
    //密码验证合格程序
//    public static void main(String[] args){
//        Scanner in = new Scanner(System.in);
//        while (in.hasNext()){
//            String str = in.nextLine();
//            if(isContentValid(str)&&isLengthVaild(str)&&!hasDuplicatedString(str)){
//                System.out.println("OK");
//            }else {
//                System.out.println("NG");
//            }
//        }
//    }
//    public static boolean isLengthVaild(String str){
//        return str.length()>8;
//    }
//
//    public static boolean isContentValid(String s){
//        int count = 0;
//        String[] str = {"[a-z]","[A-Z]","[0-9]","[^a-zA-Z0-9]"};
//        for(int i=0;i<str.length;i++){
//            Pattern p = Pattern.compile(str[i]);
//            Matcher m = p.matcher(s);
//            if(m.find()){
//                count++;
//            }
//        }
//        return count>=3;
//    }
//    public static boolean hasDuplicatedString(String s){
//        for(int i=0;i<s.length()-3;i++){
//            if(s.substring(i+3).contains(s.substring(i,i+3))){
//                return true;
//            }
//        }
//        return false;
//    }
    //购物单待修改
    //后面回过来再看

//    public static int getMaxValue(int[] val, int[] weight, int[] q, int n, int w) {
//        int[][] dp = new int[n + 1][w + 1];
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= w; j++) {
//                if (q[i-1] == 0) {  // 主件
//                    if (weight[i - 1] <= j) // 用j这么多钱去买 i 件商品 可以获得最大价值
//                        dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j- weight[i - 1]]+ val[i - 1]);
//                }
//                else { //附件
//                    if (weight[i - 1] + weight[q[i - 1]] <= j) //附件的话 加上主件一起算
//                        dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j- weight[i - 1]]+ val[i - 1]);
//                }
//            }
//        }
//        return dp[n][w];
//    }
//
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        while (input.hasNextInt()) {
//            int n = input.nextInt(); // 总钱数
//            int m = input.nextInt(); // 商品个数
//            int[] p = new int[m];
//            int[] v = new int[m];
//            int[] q = new int[m];
//            for (int i = 0; i < m; i++) {
//                p[i] = input.nextInt();        // 价格
//                v[i] = input.nextInt() * p[i]; // 价值
//                q[i] = input.nextInt();        // 主or附件
//            }
//            System.out.println(getMaxValue(v, p, q, m, n));
//        }
//    }
    //识别有效的IP地址和掩码并进行分类统计


//    public static void main(String[] args){
//        Scanner scanner = new Scanner(System.in);
//        int typeA = 0;
//        int typeB = 0;
//        int typeC = 0;
//        int typeD = 0;
//        int typeE = 0;
//        int errorIpOrMaskCode = 0;
//        int privIp = 0;
//
//        while (scanner.hasNext()) {
//            String ipt = scanner.nextLine();
//            String[] ipAndMaskCode = ipt.split("~");
//            String ip = ipAndMaskCode[0];
//            String maskCode = ipAndMaskCode[1];
//            // 判断格式
//            if (!isValidFormat(ip) || !isValidFormat(maskCode)) {
//                errorIpOrMaskCode++;
//                continue;
//            }
//
//            // 判断掩码是否错误
//            if (!validMaskCode(maskCode)) {
//                errorIpOrMaskCode++;
//                continue;
//            }
//
//            // 判断ip类别
//            String fnStr = ip.substring(0, ip.indexOf("."));
//            int fn = Integer.valueOf(fnStr);
//            if (fn >= 1 && fn < 127) {
//                // A
//                typeA++;
//            } else if (fn >= 128 && fn < 192) {
//                // B
//                typeB++;
//            } else if (fn >= 192 && fn < 224) {
//                // C
//                typeC++;
//            } else if (fn >= 224 && fn < 240) {
//                // D
//                typeD++;
//            } else if (fn >= 240 && fn <= 255) {
//                // E
//                typeE++;
//            }
//
//            // 判断是否是私网IP
//            String ipSubStr = ip.substring(ip.indexOf(".") + 1);
//            String snStr = ipSubStr.substring(0, ipSubStr.indexOf("."));
//            int sn = Integer.valueOf(snStr);
//            if (fn == 10 || (fn == 172 && sn >= 16 && sn <= 31) || (fn == 192 && sn == 168)) {
//                privIp++;
//            }
////          System.out.printf("%d %d%n", fn, sn);
//
//        }
//        scanner.close();
//
//        System.out.printf("%d %d %d %d %d %d %d%n", typeA, typeB, typeC, typeD, typeE, errorIpOrMaskCode, privIp);
//
//    }
//
//    /**
//     * 判断ip和掩码是否是xxx.xxx.xxx.xxx格式Ø
//     *
//     * @param ip
//     * @return
//     */
//    private static boolean isValidFormat(String ip) {
//        boolean res = true;
//        if (ip == null || "".equals(ip))
//            return false;
//        Pattern pattern = Pattern.compile("^(\\d+)\\.(\\d+)\\.(\\d+)\\.(\\d+)$");
//        Matcher matcher = pattern.matcher(ip);
//
//        if (matcher.matches()) {
//            String[] nums = ip.split("\\.");
//            for (String num : nums) {
//                int n = Integer.valueOf(num);
//                if (n < 0 || n > 255) {
//                    res = false;
//                    break;
//                }
//            }
//        } else {
//            res = false;
//        }
//
//        return res;
//    }
//
//    /**
//     * 判断掩码是否是前面全为1后面全为0 的格式
//     *
//     * @param maskCode
//     * @return
//     */
//    private static boolean validMaskCode(String maskCode) {
//        boolean res = true;
//        String[] nums = maskCode.split("\\.");
//        StringBuilder sb = new StringBuilder();
//        for (String num : nums) {
//            int n = Integer.valueOf(num);
//            sb.append(binaryString(n));
//        }
//        int firstIndexOf0 = sb.indexOf("0");
//        int lastIndexOf1 = sb.lastIndexOf("1");
//        if (firstIndexOf0 < lastIndexOf1) {
//            res = false;
//        }
//        return res;
//    }
//
//    /**
//     * 将整数转成对应的八位二进制字符串
//     * @param num
//     * @return
//     */
//    private static String binaryString(int num) {
//        StringBuilder result = new StringBuilder();
//        int flag = 1 << 7;
//        for (int i = 0; i < 8; i++) {
//            int val = (flag & num) == 0 ? 0 : 1;
//            result.append(val);
//            num <<= 1;
//        }
//        return result.toString();
//    }

    //简单错误记录
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        Map<String, Integer> map=new LinkedHashMap<String, Integer>();
//        while(sc.hasNext()){
//            String str=sc.next();
//            int linenum=sc.nextInt();
//            String[] arr=str.split("\\\\");  //根据\切割
//            String s=arr[arr.length-1];
//            if(s.length()>16)  //截取
//                s=s.substring(s.length()-16);
//            String key=s+" "+linenum;
//            int value=1;
//            if(map.containsKey(key))
//                map.put(key, map.get(key)+1);
//            else {
//                map.put(key, value);
//            }
//        }
//        int count=0;
//        for(String string:map.keySet()){
//            count++;
//            if(count>(map.keySet().size()-8)) //输出最后八个记录
//                System.out.println(string+" "+map.get(string));
//        }
//    }

    //简单密码
//    public static void main(String[] args){
//        Scanner in = new Scanner(System.in);
//        String str = in.nextLine();
//        StringBuilder sb = new StringBuilder();
//        for(int i=0;i<str.length();i++){
//            if(Character.isUpperCase(str.charAt(i))){
//                sb.append(bigCharSwitch(str.charAt(i)));
//            }else if(Character.isLowerCase(str.charAt(i))){
//                sb.append(smallCharSwitch(str.charAt(i)));
//            }else {
//                sb.append(str.charAt(i));
//            }
//        }
//        System.out.println(sb.toString());
//    }
//
//    public static char bigCharSwitch(char c){
//        char ch = Character.toLowerCase(c);
//        if(ch == 'z'){
//            return 'a';
//        }else {
//            return (char) (ch+1);
//        }
//    }
//
//    public static char smallCharSwitch(char c){
//        if(c == 'a'|| c=='b'||c=='c'){
//            return '2';
//        }else if(c=='d'||c=='e'||c=='f'){
//            return '3';
//        }else if(c=='g'||c=='h'||c=='i'){
//            return '4';
//        }else if(c=='j'||c=='k'||c=='l'){
//            return '5';
//        }else if(c=='m'||c=='n'||c=='o'){
//            return '6';
//        }else if(c=='p'||c=='q'||c=='r'||c=='s'){
//            return '7';
//        }else if(c=='t'||c=='u'||c=='v'){
//            return '8';
//        }else if(c=='w'||c=='x'||c=='y'||c=='z'){
//            return '9';
//        }else {
//            return c;
//        }
//    }
    //汽水瓶 解法一
//    public static void main(String[] args){
//        Scanner in = new Scanner(System.in);
//        while (in.hasNext()){
//            int n = in.nextInt();
//            if(n == 0){
//                break;
//            }
//            System.out.println(n/2);
//        }
//    }
    //汽水瓶解法二
    //f1= 0 f2 = 1 fn=f(n-2)+1;
//    public static void main(String[] args){
//        Scanner in = new Scanner(System.in);
//        while (in.hasNext()){
//            int num = in.nextInt();
//            if(num == 0){
//                break;
//            }
//            System.out.println(f(num));
//
//        }
//    }
//
//    public static int f(int n){
//        if(n == 1)return 0;
//        if(n == 2)return 1;
//        return f(n-2)+1;
//    }
    //合唱队（最大递增子序列）后面再看
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        while (in.hasNext()) {
//            int num = in.nextInt();
//            if(num<=2){
//                System.out.println(0);
//            }
//            int[] members=new int[num];//存储每一个数据元素
//            int[] left_queue=new int[num];//数据元素从左到右对应的最大递增子序列数
//            int[] right_queue=new int[num];//数据元素从右到左对应的最大递增子序列数
//            for(int i=0;i<num;i++){//初始化各个数组数据
//                members[i]=in.nextInt();
//                left_queue[i]=1;
//                right_queue[i]=1;
//            }
//            for(int i=0;i<num;i++){
//                for(int j=0;j<i;j++){
//                    if(members[i]>members[j]&&left_queue[j]+1>left_queue[i])
//                        left_queue[i]=left_queue[j]+1;
//                }
//            }
//            for(int i=num-1;i>=0;i--){
//                for(int j=num-1;j>i;j--){
//                    if(members[i]>members[j]&&right_queue[j]+1>right_queue[i])
//                        right_queue[i]=right_queue[j]+1;
//                }
//            }
//            int max=0;
//            for(int i=0;i<num;i++){
//                if(left_queue[i]+right_queue[i]>max)
//                    max=left_queue[i]+right_queue[i];
//            }
//            System.out.println(num-max+1);
//        }
//    }
//数据分类处理
//    public static void main(String[] args){
//        Scanner in = new Scanner(System.in);
//        while (in.hasNext()){  //这里有一个坑，测试有可能是连续输入的。具体情况具体分析吧
//            String I = in.nextLine();
//            String R = in.nextLine();
//            TreeMap<String,List<String>> treeMap = new TreeMap<>(new Comparator<String>() {
//                @Override
//                public int compare(String o1, String o2) {
//                    int len1 = o1.length();
//                    int len2 = o2.length();
//                    if(len1!=len2){
//                        return len1-len2;
//                    }else {
//                        return o1.compareTo(o2);
//                    }
//                }
//            });
//            String[] Is = I.split(" ");
//            String[] Rs = R.split(" ");
//            for(int i=1;i<Rs.length;i++){
//                int cnt = 0;//满足条件的I的个数
//                List<String> list = new ArrayList<>();
//                for(int j=1;j<Is.length;j++){
//                    if(Is[j].contains(Rs[i])){
//                        list.add(""+(j-1));
//                        list.add(""+Is[j]);
//                        cnt++;
//                    }
//                }
//                if(cnt>0 && !treeMap.containsKey(Rs[i])){
//                    list.add(0,""+cnt);
//                    treeMap.put(Rs[i],list);
//                }
//            }
//
//            List<String> resultList = new ArrayList<>();
//            for(String key:treeMap.keySet()){
//                resultList.add(key);
//                resultList.addAll(treeMap.get(key));
//            }
//            int total = resultList.size();
//            resultList.add(0,""+total);
//            StringBuilder sb = new StringBuilder();
//            for(int i=0;i<resultList.size();i++){
//                if(i==resultList.size()-1){
//                    sb.append(resultList.get(i));
//                }else {
//                    sb.append(resultList.get(i));
//                    sb.append(" ");
//                }
//            }
//            System.out.println(sb.toString());
//        }
//
//    }
//查找兄弟单词
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        while (scanner.hasNext())
//        {
//            int total = scanner.nextInt();
//            String[] words = new String[total];
//            for (int i = 0; i < total; i++)
//                words[i] = scanner.next();
//            String target = scanner.next();
//            int outIndex = scanner.nextInt();
//
//            int count = 0;
//            ArrayList<String> list = new ArrayList<>();
//            for (int i = 0; i < total; i++)
//            {
//                if (isNeighbor(words[i], target))
//                {
//                    count++;
//                    list.add(words[i]);
//                }
//            }
//            System.out.println(count);
//            if (count >= outIndex)
//            {
//                Collections.sort(list);
//                System.out.println(list.get(outIndex - 1));
//            }
//        }
//    }
//
//    public static boolean isNeighbor(String str1, String str2)
//    {
//        if (str1.equals(str2) || str1.length() != str2.length())
//            return false;
//        char[] arr1 = str1.toCharArray();
//        Arrays.sort(arr1);
//        char[] arr2 = str2.toCharArray();
//        Arrays.sort(arr2);
//        if (!(String.valueOf(arr1).equals(String.valueOf(arr2))))
//            return false;
//        return true;
//    }

//素数伴侣
//字符串的加解密
//    public static void main(String[] args){
//        Scanner in = new Scanner(System.in);
//        while (in.hasNext()){
//            String str1 = in.nextLine();
//            String str2 = in.nextLine();
//            char[] auc = str1.toCharArray();
//            char[] acuResult = new char[auc.length];
//
//            char[] result = str2.toCharArray();
//            char[] password = new char[result.length];
//
//            Encrypt(auc,acuResult);
//            String acuResultStr = new String(acuResult);
//            System.out.println(acuResultStr);
//
//            unEncrypt(result,password);
//            String passwordStr = new String(password);
//            System.out.println(passwordStr);
//        }
//    }
//
//    public static void Encrypt (char aucPassword[], char aucResult[]){
//        for (int i=0;i<aucPassword.length;i++){
//            char c = aucPassword[i];
//            if(Character.isLowerCase(c)){
//                if(c == 'z'){
//                    c = 'a';
//                }else {
//                    c = (char) (c+1);
//                }
//                c = Character.toUpperCase(c);
//            }else if(Character.isUpperCase(c)){
//                if(c == 'Z'){
//                    c='A';
//                }else {
//                    c = (char) (c+1);
//                }
//                c=Character.toLowerCase(c);
//            }else if(Character.isDigit(c)){
//                if(c == '9'){
//                    c='0';
//                }else {
//                    c= (char) (c+1);
//                }
//            }
//            aucResult[i]=c;
//        }
//    }
//
//    public static int unEncrypt (char result[], char password[]){
//        for(int i=0;i<result.length;i++){
//            char c = result[i];
//            if(Character.isLowerCase(c)){
//                c= Character.toUpperCase(c);
//                if(c=='A'){
//                    c='Z';
//                }else {
//                    c= (char) (c-1);
//                }
//            }else if(Character.isUpperCase(c)){
//                c=Character.toLowerCase(c);
//                if(c=='a'){
//                    c='z';
//                }else {
//                    c= (char) (c-1);
//                }
//            }else if(Character.isDigit(c)){
//                if(c=='0'){
//                    c='9';
//                }else {
//                    c= (char) (c-1);
//                }
//            }
//            password[i]=c;
//        }
//        return 0;
//    }
    //字符串合并处理

//字符串合并处理
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        while(sc.hasNext()){
//            String str = sc.next();
//            str += sc.next();
//            System.out.println(processString(str));
//        }
//    }
//    private static String processString(String str){
//        if(str==null||str.length()==0){
//            return "";
//        }
//        int n = str.length();
//        ArrayList<Character> ji = new ArrayList<>();
//        ArrayList<Character> ou = new ArrayList<>();
//        for(int i=0;i<n;i++){//奇数和偶数分开存到集合中
//            if(i%2==0){
//                ou.add(str.charAt(i));
//            }else{
//                ji.add(str.charAt(i));
//            }
//        }
//        //排序
//        Collections.sort(ji);
//        Collections.sort(ou);
//        char[] chs = new char[n];
//        int ouIndex = 0,jiIndex = 0;
//        for(int i=0;i<n;i++){//之后再把排序后的奇数偶数重新放到char型数组中
//            if(i%2==0){
//                chs[i] = ou.get(ouIndex++);
//            }else{
//                chs[i] = ji.get(jiIndex++);
//            }
//        }
//        StringBuffer sb = new StringBuffer();
//        for(int i=0;i<n;i++){//依次把char型数组中的字符经过处理后就加入到stringbuffer中
//            char ch = chs[i];
//            if((ch>='0'&&ch<='9')||(ch>='a'&&ch<='f')||(ch>='A'&&ch<='F')){
//                sb.append(processChar(ch));
//            }else{
//                sb.append(ch);
//            }
//        }
//        return sb.toString();
//    }
//    private static char processChar(char c){//处理这些特殊字符，返回char型字符
//        int num = 0;//num代表该字符所代表的十六进制数字
//        if(c>='0'&&c<='9'){
//            num = Integer.parseInt(c+"");
//        }else if(c>='a'&&c<='f'){
//            num = c-87;
//        }else {
//            num = c-55;
//        }
//        return getReverseResult(num);//也就是对该十六进制数字进行处理
//    }
//    private static char getReverseResult(int num){//对该十六进制数字进行处理
//        String nums = reverseBinaryString(num);//对该数字进行转化为4位二进制数，然后反转。
//        int res = Integer.parseInt(nums,2);//之后再对返回后的二进制字符串转换为十进制数字
//        if(res>=0&&res<=9){//对十进制数字分两种情况转换为十六进制字符
//            return (res+"").charAt(0);
//        }else{
//            return (char)(res+55);
//        }
//    }
//    //对该数字进行转化为4位二进制数，然后反转，返回反转后的字符串
//    private static String reverseBinaryString(int num){
//        int k = 1<<3;
//        StringBuffer sb = new StringBuffer();
//        for(int i=0;i<4;i++){
//            int flag = ((num&k)==0?0:1);
//            sb.append(flag);
//            num=num<<1;
//        }
//        return sb.reverse().toString();
//    }
    //单词倒排
//    public static void main(String[] args){
//        Scanner in = new Scanner(System.in);
//        while (in.hasNext()){
//            String strs = in.nextLine();
//            StringBuilder sb = new StringBuilder();
//            for(int i=0;i<strs.length();i++){
//                char c = strs.charAt(i);
//                if(!Character.isLetter(c)){
//                    sb.append(" ");
//                }else {
//                    sb.append(c);
//                }
//            }
//            String[] words = sb.toString().split(" ");
//            StringBuilder reverse = new StringBuilder();
//            for(int i=words.length-1;i>=0;i--){
//                if(words[i]!=null && !words[i].equals(" ")){
//                    reverse.append(words[i]+" ");
//                }
//            }
//            String result  = reverse.toString().trim();
//            System.out.println(result);
//
//        }
//    }


//单词倒排
//    public static void main(String[] args)
//    {
//        Scanner sc = new Scanner(System.in);
//        while (sc.hasNext()){
//            String[] sp = sc.nextLine().split("[^a-zA-Z]+");
//            StringBuilder sb = new StringBuilder();
//            for (int i = sp.length - 1; i >= 0; i--)
//                sb.append(sp[i] + " ");
//            System.out.println(sb.toString().trim());
//        }
//        sc.close();
//    }

    //字符串运用-密码截取
//    public static void main(String[] args){
//        Scanner in = new Scanner(System.in);
//        while (in.hasNext()){
//            String str = in.nextLine();
//            System.out.println(getMaxLen(str));
//        }
//    }
//
//    private static int getMaxLen(String password){
//        char[] chs = password.toCharArray();
//        int maxLen = 0;
//        for(int i=0;i<chs.length;i++){
//           int len1 = getParamLen(chs,i,i);
//           int len2 = getParamLen(chs,i,i+1);
//           if(maxLen<len1){
//               maxLen = len1;
//           }
//           if(maxLen<len2){
//               maxLen = len2;
//           }
//        }
//        return maxLen;
//    }
//
//    private static int getParamLen(char[] arry,int i,int j){
//        int m=0;
//        while (i>=0 && j<=arry.length-1 && i<=j){
//            if(arry[i] == arry[j]){
//                m=j-i+1;
//                i--;j++;
//            }else {
//                break;
//            }
//        }
//        return m;
//    }

    //整数和IP地址之间的转换
//    public static void main(String[] args){
//        Scanner in = new Scanner(System.in);
//        while (in.hasNext()){
//            String ip = in.nextLine();
//            String ipLong = in.nextLine();
//            System.out.println(IpToTen(ip));
//            System.out.println(TenToIp(ipLong));
//        }
//    }
//    private static long IpToTen(String str){
//        String[] arr = str.split("\\.");
//        long n = Long.parseLong(arr[0]);
//        for(int i=1;i<arr.length;i++){
//            n=n<<8;
//            n=n+Long.parseLong(arr[i]);
//        }
//        return n;
//    }
//    private static String TenToIp(String p){
//        long temp = Long.parseLong(p);
//        String ip = Long.toBinaryString(temp);
//        StringBuilder sb = new StringBuilder();
//        if(ip.length()<32){
//            for(int i=0;i<(32-ip.length());i++){
//                sb.append('0');
//            }
//            sb.append(ip);
//        }else if(ip.length() == 32){
//            sb.append(ip);
//        }
//        StringBuilder result = new StringBuilder();
//        for(int i=0;i<sb.length()-8;i=i+8){
//            int tmp = Integer.parseInt(sb.substring(i,i+8),2);
//            result.append(tmp+".");
//        }
//        result.append(Integer.parseInt(sb.substring(sb.length()-8,sb.length()),2));
//        return result.toString();
//    }
    //图片整理
//    public static void main(String[] args){
//        Scanner in  = new Scanner(System.in);
//        while (in.hasNext()){
//            String str = in.nextLine();
//            char[] chs = str.toCharArray();
//            Arrays.sort(chs);
//            System.out.println(new String(chs));
//        }
//    }
    //蛇形矩阵
//    public static void main(String[] args){
//        Scanner in = new Scanner(System.in);
//        while(in.hasNext()){
//            int N = in.nextInt();
//            int first_col = 1;
//            for(int i = 1; i <= N; i++){
//                System.out.print(first_col);
//                int tmp = first_col;
//                for(int j = i+1; j <= N; j++){
//                    tmp += j;
//                    System.out.print(" " + tmp);
//                }
//                System.out.println();
//                first_col += i;
//            }
//        }
//        in.close();
//    }
      //字符串加密
//    public static void main(String[] args){
//        Scanner in = new Scanner(System.in);
//        while (in.hasNext()){
//            String key = in.nextLine();
//            String data = in.nextLine();
//            System.out.println(encrypt(key,data));
//        }
//    }
//
//    private static String encrypt(String key,String data){
//        key = key.toUpperCase();
//        String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
//        StringBuilder sb = new StringBuilder();
//        TreeSet<Character> set = new TreeSet<>();
//        for(int i=0;i<key.length();i++){
//           if(!set.contains(key.charAt(i))){
//               sb.append(key.charAt(i));
//               set.add(key.charAt(i));
//           }
//        }
//        for(int i=0;i<upper.length();i++){
//            if(!set.contains(upper.charAt(i))){
//                sb.append(upper.charAt(i));
//                set.add(upper.charAt(i));
//            }
//        }
//        StringBuilder result = new StringBuilder();
//        int index = -1;
//        for(int i=0;i<data.length();i++){
//            char c = data.charAt(i);
//            boolean isUpper = Character.isUpperCase(c);
//            char upper_c = Character.toUpperCase(c);
//            index = upper.indexOf(""+upper_c);
//            if(index>=0){
//                char tmp = sb.charAt(index);
//                if(isUpper){
//                    result.append(Character.toUpperCase(tmp));
//                }else {
//                    result.append(Character.toLowerCase(tmp));
//                }
//
//            }else {
//                result.append(c);
//            }
//
//        }
//        return result.toString();
//
//    }

    //统计每个月的兔子总数
//    public static void main(String[] args){
//        Scanner in = new Scanner(System.in);
//        while (in.hasNext()){
//            int mounth = in.nextInt();
//            System.out.println(getTotalCount(mounth));
//        }
//    }
//
//    private static int getTotalCount(int month){
//        if(month == 1 || month == 2){
//            return 1;
//        }
//        return getTotalCount(month-1)+getTotalCount(month-2);
//    }
    //小球落地5次后经历的流程和第5ci返回的高度
//    public static void main(String[] args){
//        Scanner in = new Scanner(System.in);
//        while (in.hasNext()){
//            int height = in.nextInt();
//            System.out.println(getJourney(height));
//            System.out.println(getTenthHeigh(height));
//        }
//    }
//
//    public static double  getJourney(int high){
//        int N = 5;
//        double a = high;
//        double sum = a*2;
//        for(int i=2;i<N;i++){
//            a=a*0.5;
//            sum+=a;
//        }
//        return sum;
//    }
//
//    public static double getTenthHeigh(int high){
//        int N = 5;
//        double a = 0.5*high;
//        for(int i=1;i<N;i++){
//            a=a*0.5;
//        }
//        return a;
//    }
//称砝码
//    public static void main(String[] args){
//        Scanner cin = new Scanner(System.in);
//        while (cin.hasNext()){
//            int n = cin.nextInt();
//            int[] weights = new int[n];
//            int[] numbers = new int[n];
//            for(int i=0;i<n;i++){
//                weights[i]=cin.nextInt();
//            }
//            for(int i=0;i<n;i++){
//                numbers[i]=cin.nextInt();
//            }
//            int result = fama(n,weights,numbers);
//            System.out.println(result);
//        }
//    }
//    public static int fama(int n,int[] weights,int[] numbers){
//        Set<Integer> set = new HashSet<>();
//        for(int i=0;i<=numbers[0];i++){
//            set.add(i*weights[0]);
//        }
//        for(int i=1;i<n;i++){
//            List<Integer> list = new ArrayList<>(set);
//            for(int j=1;j<=numbers[i];j++){
//                for(int k=0;k<list.size();k++){
//                    set.add(list.get(k)+j*weights[i]);
//                }
//            }
//        }
//        return set.size();
//
//    }
    //学英语

//    public static String[] num1 = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
//    public static String[] num2 = { "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen","seventeen", "eighteen", "nineteen" };
//    public static String[] num3 = { "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty","ninety" };
//
//    public static String parse(long num){
//        if(num < 0){
//            return "error";
//        }
//        StringBuilder sb = new StringBuilder();
//        long billion = num / 1000000000;    //十亿部分
//        if(billion != 0){
//            sb.append(trans(billion) + " billion ");
//        }
//        num  %= 1000000000;
//
//        long million = num / 1000000;    //百万部分
//        if(million != 0){
//            sb.append(trans(million) + " million ");
//        }
//        num  %= 1000000;
//
//        long thousand = num / 1000;    //千部分
//        if(thousand != 0){
//            sb.append(trans(thousand) + " thousand ");
//        }
//        num  %= 1000;
//
//        if(num != 0){
//            sb.append(trans(num));
//        }
//        return sb.toString().trim();   //最后去除字符串后面的空格
//    }
//
//    public static String trans(long num){
//        StringBuilder sb = new StringBuilder();
//        long h  = num / 100;  //百位处理
//        if(h != 0){
//            sb.append(num1[(int) h] + " hundred");
//        }
//        num %= 100;
//
//        long k = num / 10;    //十位处理
//        if(k != 0){
//            if(h != 0){    //若有百位，则加上“and”
//                sb.append(" and ");
//            }
//            if(k == 1){   //如果十位为1，那么十位与个位一起翻译，如：113
//                sb.append(num2[(int)(num % 10)]);
//            }else{  //否则，十位和个位分别单独翻译，如：123
//                sb.append(num3[(int) (k - 2)] + " ");
//                if(num % 10 != 0){
//                    sb.append(num1[(int) (num % 10)]);
//                }
//            }
//        }else if (num % 10 != 0) {  //如果没有十位的部分，则直接翻译个位部分，比如：102
//            if(h != 0){
//                sb.append(" and ");
//            }
//            sb.append(num1[(int) (num % 10 )]);
//        }
//        return sb.toString().trim();
//    }
//
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        while (in.hasNext()) {
//            long num = in.nextLong();
//            System.out.println(parse(num));
//        }
//        in.close();
//    }

    //多线程
//    public static int flag = 1;
//    public static int k1 = 0;
//    public static int k2 = 0;
//    public static int k3 = 0;
//    public static int k4 = 0;
//    public static Object obj = new Object();
//    public static StringBuilder result = new StringBuilder();
//    public static void main(String[] args){
//        Scanner in  = new Scanner(System.in);
//        while (in.hasNext()){
//            int cnt = in.nextInt();
//            Runnable r1 = new Runnable() {
//                @Override
//                public void run() {
//                    while (k1<cnt){
//                        synchronized (obj){
//                            while (flag!=1){
//                                try {
//                                    obj.wait();
//                                } catch (InterruptedException e) {
//                                    e.printStackTrace();
//                                }
//                            }
//                            result.append('A');
//                            flag = 2;
//                            k1++;
//                            obj.notifyAll();
//                        }
//                    }
//                }
//
//            };
//            Runnable r2 = new Runnable() {
//                @Override
//                public void run() {
//                    while (k2<cnt){
//                        synchronized (obj){
//                            while (flag!=2){
//                                try {
//                                    obj.wait();
//                                } catch (InterruptedException e) {
//                                    e.printStackTrace();
//                                }
//                            }
//                            result.append('B');
//                            flag = 3;
//                            k2++;
//                            obj.notifyAll();
//                        }
//                    }
//
//                }
//            };
//            Runnable r3 = new Runnable() {
//                @Override
//                public void run() {
//                    while (k3<cnt){
//                        synchronized (obj){
//                            while (flag!=3){
//                                try {
//                                    obj.wait();
//                                } catch (InterruptedException e) {
//                                    e.printStackTrace();
//                                }
//                            }
//                            result.append('C');
//                            flag = 4;
//                            k3++;
//                            obj.notifyAll();
//                        }
//                    }
//
//                }
//            };
//            Runnable r4 = new Runnable() {
//                @Override
//                public void run() {
//                    while (k4<cnt){
//                        synchronized (obj){
//                            while (flag!=4){
//                                try {
//                                    obj.wait();
//                                } catch (InterruptedException e) {
//                                    e.printStackTrace();
//                                }
//                            }
//                            result.append('D');
//                            if(k4 == cnt-1){
//                                System.out.println(result.toString());
//                            }
//                            flag = 1;
//                            k4++;
//                            obj.notifyAll();
//                        }
//                    }
//
//                }
//            };
//
//            Thread th1 = new Thread(r1);
//            Thread th2 = new Thread(r2);
//            Thread th3 = new Thread(r3);
//            Thread th4 = new Thread(r4);
//            th1.start();
//            th2.start();
//            th3.start();
//            th4.start();
//        }
//    }

    //数独
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        while(sc.hasNextInt()){
//            int[][]a=new int[9][9];
//            boolean[][] cols = new boolean[9][9];
//            boolean[][] rows = new boolean[9][9];
//            boolean[][] blocks = new boolean[9][9];//九大宫的九个数字
//
//            for (int i = 0; i < a.length; i++) {
//                for (int j = 0; j < a.length; j++) {
//                    a[i][j]=sc.nextInt();
//                    if(a[i][j]!=0){
//                        int k = i/3*3+ j/3;//划分九宫格,这里以行优先，自己也可以列优先
//                        int val=a[i][j]-1;
//                        rows[i][val] = true;
//                        cols[j][val] = true;
//                        blocks[k][val] = true;
//                    }
//                }
//            }//数据装载完毕
//            DFS(a, cols, rows, blocks);
//            for (int i = 0; i < 9; i++) {
//                for (int j = 0; j < 8; j++) {
//                    System.out.print(a[i][j]+" ");
//                }
//                System.out.println(a[i][8]);
//            }
//        }
//    }
//
//
//
//
//    public static boolean DFS(int[][] a,boolean[][] cols,boolean[][] rows,boolean[][] blocks) {
//        for (int i = 0; i < 9; i++) {
//            for (int j = 0; j < 9; j++) {
//                if(a[i][j]==0){
//                    int k=i/3*3+j/3;
//                    for (int l = 0; l < 9; l++) {
//                        if(!cols[j][l]&&!rows[i][l]&&!blocks[k][l]){//l对于的数字l+1没有在行列块中出现
//                            rows[i][l] = cols[j][l] = blocks[k][l] = true;
//                            a[i][j] = 1 + l;//下标加1
//                            if(DFS(a, cols, rows, blocks)) return true;//递进则返回true
//                            rows[i][l] = cols[j][l] = blocks[k][l] = false;//递进失败则回溯
//                            a[i][j] = 0;
//                        }
//                    }
//                    return false;//a[i][j]==0时，l发现都不能填进去
//                }//the end of a[i][j]==0
//            }
//        }
//        return true;//没有a[i][j]==0,则返回true
//    }
    //迷宫问题 回溯法

//    public static void main(String[] args) {
//        Scanner jin = new Scanner(System.in);
//        while(jin.hasNext()) {
//            int row = jin.nextInt();
//            int col = jin.nextInt();
//            int[][] maze = new int[row][col];
//            for(int i = 0; i < row; i++)
//                for(int j = 0; j < col; j++)
//                    maze[i][j] = jin.nextInt();
//            check(maze, 0, 0);//预先探测迷宫一遍，将走不通的路置1
//            System.out.println(mazePath(maze, 0, 0));//正式走迷宫
//        }
//    }
//    public static int check(int[][] maze, int x, int y) {
//        //如果是右下角的出口
//        if(x == maze.length - 1 && y == maze[x].length - 1) return 1;
//        //如果当前位置是路
//        if(x < maze.length && y < maze[maze.length - 1].length && maze[x][y] == 0) {
//            //如果下一步横竖都是死
//            if(check(maze, x + 1, y) == -1 && check(maze, x, y + 1) == -1) {
//                //将本位置封死
//                maze[x][y] = 1;
//                return -1;
//            }else return 1;
//            //如果当前位置不是路
//        }else return -1;
//    }
//    public static String mazePath(int[][] maze, int x, int y) {
//        //如果是右下角的出口，返回坐标
//        if(x == maze.length - 1 && y == maze[x].length - 1) return "(" + x + "," + y + ")";
//        //如果当前位置是路，返回坐标并且继续前进
//        if(x < maze.length && y < maze[maze.length - 1].length && maze[x][y] == 0) return "(" + x + "," + y + ")" + "\n" + mazePath(maze, x + 1, y) + mazePath(maze, x, y + 1);
//            //如果当前位置不是路，什么也不做
//        else return "";
//    }
// 漂亮度
//    public static void main(String[] args){
//        Scanner in = new Scanner(System.in);
//        while (in.hasNext()){
//               int n = in.nextInt();
//               for(int i=0;i<n;i++){
//                   String str = in.next().trim();
//                   System.out.println(getMaxBeautiful(str));
//               }
//        }
//    }
//    private static int getMaxBeautiful(String str){
//       char[] chs = str.toLowerCase().toCharArray();
//       int[] a = new int[26];
//       int k=26;
//       int res=0;
//       for(int i=0;i<chs.length;i++){
//           a[chs[i]-'a']++;
//       }
//       Arrays.sort(a);
//       for(int i=25;i>=0;i--){
//           res+=a[i]*k--;
//       }
//       return res;
//
//    }
    //按字节截取字符串
//    public static void main(String[] args) throws UnsupportedEncodingException {
//        Scanner sc = new Scanner(System.in);
//        while (sc.hasNext()) {
//            String str = sc.next();
//            String[] strs = new String[str.length()];
//            for (int i = 0; i < strs.length; i++) {
//                strs[i] = String.valueOf(str.charAt(i));
//            }
//            int byteNum = sc.nextInt();
//            StringBuilder res = new StringBuilder();
//            for (int i = 0; i < strs.length; i++) {
//                int chLen = strs[i].getBytes("GBK").length;
//                if (byteNum >= chLen){
//                    byteNum -= chLen;
//                    res.append(strs[i]);
//                }else {
//                    break;
//                }
//            }
//            System.out.println(res.toString());
//        }
//    }
// 线性插值
//    static class Data{
//        public int key = -1;
//        public int value = -1;
//
//        @Override
//        public String toString() {
//            return ""+key+" "+value;
//        }
//    }
//    public static void main(String[] args){
//        Scanner in = new Scanner(System.in);
//        while (in.hasNext()){
//            int n = in.nextInt();
//            int m= in.nextInt();
//            Data[] datas = new Data[n];
//            for(int i=0;i<n;i++){
//                datas[i] = new Data();
//                datas[i].key = in.nextInt();
//                datas[i].value = in.nextInt();
//            }
//            //去重复
//            List<Data> list = new ArrayList<>();
//            list.add(datas[0]);
//            for(int i=1;i<datas.length;i++){
//                if(datas[i].key != datas[i-1].key){
//                    list.add(datas[i]);
//                }
//            }
//            //计算插值
//            List<Data> result = new ArrayList<>();
//            Data M = list.get(0);
//            result.add(M);
//            Data N;
//            for(int i=1;i<list.size();i++){
//                N = list.get(i);
//                int num = N.key-M.key-1;//所要计算的差值的个数
//                for(int j=1;j<=num;j++){
//                    Data data = new Data();
//                    data.key = M.key+j;
//                    data.value = M.value+(N.value-M.value)/(N.key-M.key)*j;
//                    result.add(data);
//                }
//                result.add(N);
//                M=N;
//            }
//            for(int i=0;i<result.size();i++){
//                System.out.println(result.get(i).toString());
//            }
//
//        }
//    }
// 四则运算 运算符为()-+*/
//    public static void main(String[] args){
//        Scanner in = new Scanner(System.in);
//        while (in.hasNext()){
//            String exp = in.nextLine();
//            String expstr = exp.replace("{","(")
//                    .replace("[","(")
//                    .replace("}",")")
//                    .replace("]",")");
//            System.out.println(caculate(expstr));
//        }
//    }

    /**
     *  //中缀表达式转换为后缀表达式
     *         //栈顶为空，优先级为0
     *         //"("优先级为1
     *         //"-+"优先级为2
     *         //"/*"优先级为3
     *         //符号栈
     *         //从左向右遍历中缀表达式，如果是数字直接输出
     *         //如果是"("直接压栈
     *         //如果")"弹栈输出知道遇到“)”“)”不输出
     *         //如果是运算符，如果比栈顶的优先级高，直接压栈。如果比栈顶的优先级低
     *         //弹出栈顶符号，直到栈顶优先级低于该运算符。然后把该运算符压栈
     *         //遍历完中缀表达式以后，把栈内的运算符弹出
     * 中缀转后缀表达式
     * @param expresstion
     * @return
     */
//    public static Queue<String> toSufExpr(String expresstion){
//        Stack<String> stack = new Stack<>();
//        Queue<String> queue = new ArrayDeque<>();
//        Pattern p = Pattern.compile("(?<!\\d)-?\\d+(\\.\\d+)?|[+\\-*/()]");//匹配表达式中的数字或者运算符
//        Matcher m = p.matcher(expresstion);
//        while (m.find()){
//            String temp = m.group();
//            if(temp.matches("[+\\-*/()]")){
//                if(temp.equals("(")){
//                    stack.push(temp);
//                }else if(temp.equals(")")){
//                    while (!stack.isEmpty()&&!stack.peek().equals("(")){
//                        queue.add(stack.pop());
//                    }
//                    if(!stack.isEmpty()){
//                        stack.pop();
//                    }
//                }else {
//                    if(stack.isEmpty() || getLevel(temp)>=getLevel(stack.peek())){
//                        stack.push(temp);
//                    }else {
//                        while (!stack.isEmpty() && getLevel(temp)<getLevel(stack.peek())){
//                            queue.add(stack.pop());
//                        }
//                        stack.push(temp);
//                    }
//                }
//            }//匹配运算符
//            else {
//                queue.add(temp);
//            }
//        }
//        while (!stack.isEmpty()){
//            queue.add(stack.pop());
//        }
//        return queue;
//    }
//
//
//    //优先级
//    private static int getLevel(String str){
//        if(str.equals("+")||str.equals("-")){
//            return 2;
//        }
//        if(str.equals("*")||str.equals("/")){
//            return 3;
//        }
//        if(str.equals("(")){
//            return 1;
//        }
//        return 0;
//    }
//
//    public static String caculate(String express){
//        Queue<String> queue = toSufExpr(express);
//        Queue<String> test = new ArrayDeque<>();
//        test.addAll(queue);
//        while (!test.isEmpty()){
//            System.out.print(test.poll());
//        }
//        System.out.println();
//        Stack<Integer> stack = new Stack<>();
//        while (!queue.isEmpty()){
//            String tmp = queue.poll();
//            if(tmp.matches("[+\\-*/]")){
//                int a1 = Integer.valueOf(stack.pop());
//                int a2 = Integer.valueOf(stack.pop());
//                int res = cal(a2,a1,tmp);
//                stack.push(res);
//            }else {
//                stack.push(Integer.valueOf(tmp));
//            }
//        }
//       return ""+stack.pop();
//    }
//
//    public static int cal(int a1,int a2,String tmp){
//        if(tmp.equals("*")){
//            return a1*a2;
//        }else if(tmp.equals("+")){
//            return a1+a2;
//        }else if(tmp.equals("-")){
//            return a1-a2;
//        }else {
//            return a1/a2;
//        }
//    }

//四则运算
//    static Set<Character> brace = new HashSet<>();
//    public static void main(String ... args){
//        Scanner sc = new Scanner(System.in);
//        // 初始化正括号集合
//        brace.add('{');
//        brace.add('(');
//        brace.add('[');
//        while(sc.hasNextLine()){
//            // 对字符串做初始化处理，原则有二:
//            // 1、处理负数，这里在-前面的位置加入一个0，如-4变为0-4，
//            // 细节：注意-开头的地方前面一定不能是数字或者反括号，如9-0,(3-4)-5，这里地方是不能加0的
//            // 它的后面可以是数字或者正括号，如-9=>0-9, -(3*3)=>0-(3*3)
//            // 2、处理字符串，在最后的位置加#, 主要是为了防止最后一个整数无法处理的问题
//            String exp = sc.nextLine().replaceAll("(?<![0-9)}\\]])(?=-[0-9({\\[])", "0") + "#";
//            System.out.println(calculate(exp));
//        }
//    }
//    private static int calculate(String exp){
//        // 初始化栈
//        Stack<Integer> opStack = new Stack<>();
//        Stack<Character> otStack = new Stack<>();
//
//        // 整数记录器
//        String num = "";
//        for(int i = 0; i < exp.length(); i++){
//            // 抽取字符
//            char c = exp.charAt(i);
//            // 如果字符是数字，则加这个数字累加到num后面
//            if(Character.isDigit(c)){
//                num += c;
//            }
//            // 如果不是数字
//            else{
//                // 如果有字符串被记录，则操作数入栈，并清空
//                if(!num.isEmpty()){
//                    int n = Integer.parseInt(num);
//                    num = "";
//                    opStack.push(n);
//                }
//                // 如果遇上了终结符则退出
//                if(c == '#')
//                    break;
//                    // 如果遇上了+-
//                else if(c == '+' || c == '-'){
//                    // 空栈或者操作符栈顶遇到正括号，则入栈
//                    if(otStack.isEmpty() || brace.contains(otStack.peek())){
//                        otStack.push(c);
//                    } else {
//                        // 否则一直做弹栈计算，直到空或者遇到正括号为止，最后入栈
//                        while(!otStack.isEmpty() && !brace.contains(otStack.peek()))
//                            popAndCal(opStack, otStack);
//                        otStack.push(c);
//                    }
//                }
//                // 如果遇上*/
//                else if(c == '*' || c == '/'){
//                    // 空栈或者遇到操作符栈顶是括号，或者遇到优先级低的运算符，则入栈
//                    if(otStack.isEmpty()
//                            || brace.contains(otStack.peek())
//                            || otStack.peek() == '+' || otStack.peek() == '-'){
//                        otStack.push(c);
//                    }else{
//                        // 否则遇到*或/则一直做弹栈计算，直到栈顶是优先级比自己低的符号，最后入栈
//                        while(!otStack.isEmpty()
//                                && otStack.peek() != '+' && otStack.peek() != '-'
//                                && !brace.contains(otStack.peek()))
//                            popAndCal(opStack, otStack);
//                        otStack.push(c);
//                    }
//                } else {
//                    // 如果是正括号就压栈
//                    if(brace.contains(c))
//                        otStack.push(c);
//                    else{
//                        // 反括号就一直做弹栈计算，直到遇到正括号为止
//                        char r = getBrace(c);
//                        while(otStack.peek() != r){
//                            popAndCal(opStack, otStack);
//                        }
//                        // 最后弹出正括号
//                        otStack.pop();
//                    }
//                }
//            }
//        }
//        // 将剩下的计算完，直到运算符栈为空
//        while(!otStack.isEmpty())
//            popAndCal(opStack, otStack);
//        // 返回结果
//        return opStack.pop();
//    }
//    private static void popAndCal(Stack<Integer> opStack, Stack<Character> otStack){
//        int op2 = opStack.pop();
//        int op1 = opStack.pop();
//        char ot = otStack.pop();
//        int res = 0;
//        switch(ot){
//            case '+':
//                res = op1 + op2;
//                break;
//            case '-':
//                res = op1 - op2;
//                break;
//            case '*':
//                res = op1 * op2;
//                break;
//            case '/':
//                res = op1 / op2;
//                break;
//        }
//        opStack.push(res);
//    }
//    private static char getBrace(char brace){
//        switch(brace){
//            case ')':
//                return '(';
//            case ']':
//                return '[';
//            case '}':
//                return '{';
//        }
//        return '#';
//    }

    //四则表达式
//    public static void main(String[] args){
//        Scanner in = new Scanner(System.in);
//        while (in.hasNext()){
//            String exp = in.nextLine();
//            String expstr = exp.replace("{","(")
//                    .replace("[","(")
//                    .replace("}",")")
//                    .replace("]",")");
//            System.out.println(getResult(operationExpressionToRPN(expstr)));
//        }
//    }
//
//    private static int getResult(List<String> result) {
//        if (null == result || result.size() == 0) {
//            throw new RuntimeException("表达式不合法！");
//        }
//        Stack<String> stack = new Stack<>();
//        Set<String> operation = new HashSet<>(Arrays.asList("+", "-", "*", "/"));
//        double d = 0.0d;
//        for (String str : result) {
//            if (!operation.contains(str)) {
//                stack.push(str);
//            } else {
//                double up = Double.parseDouble(stack.pop());
//                double down = Double.parseDouble(stack.pop());
//                switch (str) {
//                    case "+":
//                        d = down + up;
//                        break;
//                    case "-":
//                        d = down - up;
//                        break;
//                    case "*":
//                        d = down * up;
//                        break;
//                    case "/":
//                        d = down / up;
//                        break;
//                    default:
//                        break;
//                }
//                stack.push(String.valueOf(d));
//            }
//        }
//        return (int)Double.parseDouble(stack.pop());
//    }
//
//
//    /**
//     * 将中缀表达式转换为后缀表达式
//     *
//     * @param operationExpression
//     * @return
//     */
//    private static List<String> operationExpressionToRPN(String operationExpression) {
//        if (null == operationExpression || "".equals(operationExpression)) {
//            throw new RuntimeException("表达式不合法！");
//        }
//        List<String> result = new LinkedList<>();
//
//        char[] chars = operationExpression.toCharArray();
//
//        Set<String> operation = new HashSet<>(Arrays.asList("+", "-", "*", "/"));
//        Set<String> numbers = new HashSet<>(Arrays.asList("0", "1", "2", "3", "4", "5", "6", "7", "8", "9"));
//
//
//        Stack<String> stack = new Stack<>();
//        StringBuffer sb = new StringBuffer();
//        String lastChar = "";
//        for (char c : chars) {
//
//            String currentChar = String.valueOf(c);
//
//            // 上一个字符 和 当前字符 都是数字的话
//            if (numbers.contains(lastChar) && numbers.contains(currentChar)) {
//                String lastestChar = result.get(result.size() - 1);
//                result.remove(result.size() - 1);
//                result.add(lastestChar + currentChar);
//                lastChar = currentChar;
//                continue;
//            }
//            if (numbers.contains(currentChar)) {
//                sb.append(currentChar);
//            } else {
//                /**
//                 *
//                 * 1：当前符号是 (, 则直接进栈
//                 * 2：当前符号是 + - * /, 弹出所有优先级大于或者等于该运算符的栈顶元素，然后将该运算符入栈
//                 * 3：当前符号是 ), 则把栈中的符号依次出栈，直到遇到 ）为止。
//                 */
//
//                if ("(".equals(currentChar)) {
//                    stack.push(currentChar);
//                } else if (operation.contains(currentChar)) {
//                    /*while (true) {
//                        // 栈空、栈顶符号为"("、当前符号优先级 > 栈顶符号优先级。当前符号入栈
//                        if (stack.isEmpty() || getOperationLevel(stack.peek()) < getOperationLevel(currentChar) || "(".equals(stack.peek())) {
//                            stack.push(currentChar);
//                            break;
//                        } else {
//                            result.add(stack.pop());
//                        }
//                    }*/
//                    while(!stack.isEmpty() && (getOperationLevel(stack.peek()) >= getOperationLevel(currentChar)) && !"(".equals(stack.peek())){
//                        result.add(stack.pop());
//                    }
//                    stack.push(currentChar);
//                } else if (")".equals(currentChar)) {
//                    String str;
//                    while (!stack.isEmpty() && !"(".equals(str = stack.pop())) {
//                        result.add(str);
//                    }
//                }
//            }
//
//            if (!"".equals(sb.toString())) {
//                result.add(sb.toString());
//                sb.delete(0, sb.length());
//            }
//            lastChar = currentChar;
//        }
//        // 最后清空栈
//        while (!stack.isEmpty()) {
//            result.add(stack.pop());
//        }
//        return result;
//    }
//
//    private static int getOperationLevel(String operation) {
//        int result;
//        switch (operation) {
//            case "+":
//                result = 1;
//                break;
//            case "-":
//                result = 1;
//                break;
//            case "*":
//                result = 2;
//                break;
//            case "/":
//                result = 2;
//                break;
//            default:
//                result = 0;
//                break;
//        }
//        return result;
//    }

    //输出单向链表中倒数第k个节点
//    static class ListNode{
//        public int value;
//        public ListNode next;
//
//        public ListNode(int value) {
//            this.value = value;
//        }
//    }
//
//    public static void main(String[] args){
//        Scanner in = new Scanner(System.in);
//        while (in.hasNext()){
//            int num = in.nextInt();
//            ListNode head = null;
//            ListNode p = head;
//            for(int i=0;i<num;i++){
//                int val = in.nextInt();
//                if(head == null){
//                    head = new ListNode(val);
//                    p=head;
//                    continue;
//                }
//                p.next = new ListNode(val);
//                p=p.next;
//            }
//            int k = in.nextInt();
//            ListNode node = getKthNode(k,head);
//            if(node !=null){
//                System.out.println(node.value);
//            }else {
//                System.out.println(0);
//            }
//            head = null;
//        }
//    }
//
//    public static ListNode getKthNode(int k,ListNode head){
//        ListNode p = head;
//        ListNode q = head;
//        while (k>0 && p!=null){
//            p=p.next;
//            k--;
//        }
//        if(k!=0){
//            return null;
//        }else {
//            while (p!=null){
//                p=p.next;
//                q=q.next;
//            }
//        }
//        return q;
//    }
    //计算字符串的距离 动态规划

//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        while(in.hasNext()){
//            String strA = in.next();
//            String strB = in.next();
//            int ic = 1;
//            int dc = 1;
//            int rc = 1;
//            int cost = strEditCost(strA, strB, ic, dc, rc);
//            System.out.println(cost);
//        }
//        in.close();
//    }
//    public static int strEditCost(String strA, String strB, int ic, int dc, int rc){
//        /* 字符串之间的距离，编辑距离，将strA编辑成strB所需的最小代价
//         * 编辑操作包括插入一个字符、删除一个字符、替换一个字符
//         * 分别对应的代价是ic、dc、rc，insert cost、delete cost、replace cost
//         * strA[x-1]代表strA的第x个字符，注意下标是从0开始的,strA[y-1]代表strA的第y个字符
//         * 定义一个代价矩阵为(N+1)*(M+1)，M N 表示strA strB的长度
//         * dp[x][y]表示strA的前x个字符串编辑成 strB的前y个字符所花费的代价
//         * dp[x][y]是下面几种值的最小值：
//         * 1、dp[x][y] = dp[x-1][y] + dc
//         * dp[x-1][y]将strA的前x-1个字符编辑成strB的前y个字符的代价已知，
//         * 那么将将strA的前x个字符编辑成strB的前y个字符的代价dp[x][y]就是dp[x-1][y] + dc
//         * 相当于strA的前x-1个字符编辑成strB的前y个字符，现在变成了strA的前x个字符，增加了一个字符，要加上删除代价
//         * 2、dp[x][y] = dp[x][y-1] + ic
//         * dp[x][y-1]将strA的前x个字符编辑成strB的前y-1个字符的代价已知，
//         * 现在变为strB的前y个字符，相应的在strA前x个操作代价的基础上插入一个字符
//         * 3、dp[x][y] = dp[x-1][y-1]
//         * dp[x-1][y-1]将strA的前x-1个字符编辑成strB的前y-1个字符的代价已知，
//         * strA的第x个字符和strB的第y个字符相同，strA[x-1] == strB[y-1]，没有引入操作
//         * 4、dp[x][y] = dp[x-1][y-1] + rc
//         * strA的第x个字符和strB的第y个字符不相同，strA[x-1] ！= strB[y-1]，
//         * 在strA的前x-1个字符编辑成strB的前y-1个字符的代价已知的情况下，
//         * 计算在strA的前x字符编辑成strB的前y个字符的代价需要加上替换一个字符的代价
//         * */
//        int m = strA.length();
//        int n = strB.length();
//        int[][] dp = new int[m + 1][n + 1];
//        for (int i = 1; i <= n; i++) dp[0][i] = i*ic;
//        for (int i = 1; i <= m; i++) dp[i][0] = i*dc;
//        for (int x = 1; x <= m; x++) {
//            for (int y = 1; y <= n; y++) {
//                int cost1 = dp[x-1][y] + dc;
//                int cost2 = dp[x][y-1] + ic;
//                int cost3 = 0;
//                if(strA.charAt(x-1) == strB.charAt(y-1))
//                    cost3 = dp[x-1][y-1];
//                else
//                    cost3 = dp[x-1][y-1] + rc;
//                dp[x][y] = Math.min(cost1, cost2);
//                dp[x][y] = Math.min(dp[x][y], cost3);
//            }
//        }
//        return dp[m][n];
//    }
    //超长正整数相加 (默认输入的字符串是符合规定的)
//    public static void main(String[] args){
//        Scanner in = new Scanner(System.in);
//        while (in.hasNext()){
//            String add = in.nextLine().trim();
//            String augend = in.nextLine().trim();
//            System.out.println(AddLongInteger(add,augend));
//        }
//    }
//    public static String AddLongInteger(String addend, String augend){
//        StringBuilder reverse_addend_sb = new StringBuilder(addend);
//        StringBuilder reverse_augend_sb = new StringBuilder(augend);
//
//        String reverse_addend = reverse_addend_sb.reverse().toString();
//        String reverse_augend = reverse_augend_sb.reverse().toString();
//
//        StringBuilder result = new StringBuilder();
//        int len_addend = reverse_addend.length();
//        int len_augend = reverse_augend.length();
//        int len_min = Math.min(len_addend,len_augend);
//        int tmp = 0;
//        for(int i=0;i<len_min;i++){
//            int sum = tmp+Integer.valueOf(""+reverse_addend.charAt(i))+Integer.valueOf(""+reverse_augend.charAt(i));
//            result.append(sum%10);
//            tmp = sum/10;
//        }
//        if(len_min == len_addend){
//            for(int i=len_min;i<len_augend;i++){
//                int sum = tmp+Integer.valueOf(""+reverse_augend.charAt(i));
//                result.append(sum%10);
//                tmp = sum/10;
//            }
//        }else {
//            for(int i=len_min;i<len_addend;i++){
//               int sum = tmp+Integer.valueOf(""+reverse_addend.charAt(i));
//               result.append(sum%10);
//               tmp = sum/10;
//            }
//        }
//        if (tmp!=0){
//            result.append(tmp);
//        }
//        return result.reverse().toString();
//    }
    //计算字符串的相似度 同计算字符串的距离
//        public static void main(String[] args) {
////        Scanner in = new Scanner(System.in);
////        while(in.hasNext()){
////            String strA = in.next();
////            String strB = in.next();
////            int ic = 1;
////            int dc = 1;
////            int rc = 1;
////            int cost = strEditCost(strA, strB, ic, dc, rc);
////            System.out.println("1/"+(cost+1));
////        }
////        in.close();
////    }
////    public static int strEditCost(String strA, String strB, int ic, int dc, int rc){
////        /* 字符串之间的距离，编辑距离，将strA编辑成strB所需的最小代价
////         * 编辑操作包括插入一个字符、删除一个字符、替换一个字符
////         * 分别对应的代价是ic、dc、rc，insert cost、delete cost、replace cost
////         * strA[x-1]代表strA的第x个字符，注意下标是从0开始的,strA[y-1]代表strA的第y个字符
////         * 定义一个代价矩阵为(N+1)*(M+1)，M N 表示strA strB的长度
////         * dp[x][y]表示strA的前x个字符串编辑成 strB的前y个字符所花费的代价
////         * dp[x][y]是下面几种值的最小值：
////         * 1、dp[x][y] = dp[x-1][y] + dc
////         * dp[x-1][y]将strA的前x-1个字符编辑成strB的前y个字符的代价已知，
////         * 那么将将strA的前x个字符编辑成strB的前y个字符的代价dp[x][y]就是dp[x-1][y] + dc
////         * 相当于strA的前x-1个字符编辑成strB的前y个字符，现在变成了strA的前x个字符，增加了一个字符，要加上删除代价
////         * 2、dp[x][y] = dp[x][y-1] + ic
////         * dp[x][y-1]将strA的前x个字符编辑成strB的前y-1个字符的代价已知，
////         * 现在变为strB的前y个字符，相应的在strA前x个操作代价的基础上插入一个字符
////         * 3、dp[x][y] = dp[x-1][y-1]
////         * dp[x-1][y-1]将strA的前x-1个字符编辑成strB的前y-1个字符的代价已知，
////         * strA的第x个字符和strB的第y个字符相同，strA[x-1] == strB[y-1]，没有引入操作
////         * 4、dp[x][y] = dp[x-1][y-1] + rc
////         * strA的第x个字符和strB的第y个字符不相同，strA[x-1] ！= strB[y-1]，
////         * 在strA的前x-1个字符编辑成strB的前y-1个字符的代价已知的情况下，
////         * 计算在strA的前x字符编辑成strB的前y个字符的代价需要加上替换一个字符的代价
////         * */
////        int m = strA.length();
////        int n = strB.length();
////        int[][] dp = new int[m + 1][n + 1];
////        for (int i = 1; i <= n; i++) dp[0][i] = i*ic;
////        for (int i = 1; i <= m; i++) dp[i][0] = i*dc;
////        for (int x = 1; x <= m; x++) {
////            for (int y = 1; y <= n; y++) {
////                int cost1 = dp[x-1][y] + dc;
////                int cost2 = dp[x][y-1] + ic;
////                int cost3 = 0;
////                if(strA.charAt(x-1) == strB.charAt(y-1))
////                    cost3 = dp[x-1][y-1];
////                else
////                    cost3 = dp[x-1][y-1] + rc;
////                dp[x][y] = Math.min(cost1, cost2);
////                dp[x][y] = Math.min(dp[x][y], cost3);
////            }
////        }
////        return dp[m][n];
////    }
    //整型数组合并
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        while(sc.hasNext()){
//            int num1 = sc.nextInt();
//            TreeSet<Integer> set = new TreeSet<>();
//            for(int i=0;i<num1;i++){
//                set.add(sc.nextInt());
//            }
//            int num2 = sc.nextInt();
//            for(int i=0;i<num2;i++){
//                set.add(sc.nextInt());
//            }
//            for(int temp:set){
//                System.out.print(temp);
//            }
//            System.out.println();
//        }
//        sc.close();
//    }
    //判断短字符串中的所有字符是否在长字符串中全部出现
//    public static void main(String[] args){
//        Scanner in = new Scanner(System.in);
//        while (in.hasNext()){
//            String short_str = in.nextLine();
//            String long_str = in.nextLine();
//            System.out.println(boollsAllCharExist(short_str,long_str));
//        }
//    }
//
//    public static boolean boollsAllCharExist(String short_str,String long_str){
//        for(int i=0;i<short_str.length();i++){
//            if(!long_str.contains(""+short_str.charAt(i))){
//                return false;
//            }
//        }
//        return true;
//    }

    //字符串匹配
//判断短字符串中的所有字符是否在长字符串中全部出现
//    public static boolean isAllCharExist(String shortString, String longString){
//        int[] bucket = new int[128];
//        for (int i = 0; i < longString.length(); i++)  //桶 统计频率，某个字符出现频率不为0
//            bucket[longString.charAt(i)]++;
//        for (int i = 0; i < shortString.length(); i++) {  //短字符串各个字符在长字符串各个字符频率情况
//            if(bucket[shortString.charAt(i)] == 0)
//                return false;
//        }
//        return true;
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        while(sc.hasNext()){
//            String strShort = sc.nextLine();
//            String strLong = sc.nextLine();
//            System.out.println(isAllCharExist(strShort, strLong));
//        }
//    }

    //求解立方根
    // 使用二分查找算法
//    public static double getCubeRoot(double input)
//    {
//        double min = 0;
//        double max = input;
//        double mid = 0;
//
//        // 注意，这里的精度要提高一点，否则某些测试用例无法通过
//        while ((max - min) > 0.001)
//        {
//            mid = (max + min) / 2;
//            if (mid * mid * mid > input)
//                max = mid;
//            else if (mid * mid * mid < input)
//                min = mid;
//            else
//                return mid;
//        }
//        return max;
//    }
//
//    public static void main(String[] args)
//    {
//        Scanner sc = new Scanner(System.in);
//        while (sc.hasNext())
//        {
//            double input = sc.nextDouble();
//            double result = getCubeRoot(input);
//            System.out.printf("%.1f\n", result);
//        }
//        sc.close();
//    }
    //记负均正
//    public static void main(String[] args){
////        Scanner in  = new Scanner(System.in);
////        while (in.hasNext()){
////            int N = in.nextInt();
////            int fushu = 0;
////            int zhengshu = 0;
////            float sum = 0;
////            for(int i=0;i<N;i++){
////                int numner = in.nextInt();
////                if(numner<0){
////                    fushu++;
////                }
////                if(numner>0){
////                    zhengshu++;
////                    sum+=numner;
////                }
////            }
////            System.out.print(fushu+" ");
////            if(zhengshu == 0){
////                System.out.println(0);
////            }else {
////                System.out.format("%.1f",(float)sum/zhengshu);
////            }
////            System.out.println();
////        }
////    }
    //记负均正II
//    public static void main(String[] args){
//        Scanner in  = new Scanner(System.in);
//        while (in.hasNext()){
//            String[] strs = in.nextLine().trim().split(" ");
//            int count =0; //负数个数
//            int sum = 0;
//            for(int i=0;i<strs.length;i++){
//                int num = Integer.valueOf(strs[i]);
//                if(num<0){
//                    count++;
//                }else {
//                    sum+=num;
//                }
//            }
//            System.out.println(count);
//            DecimalFormat df = new DecimalFormat(".#");
//            if(count == strs.length){
//                System.out.println(0.0);
//            }else {
//                System.out.println(df.format(sum/(1.0*(strs.length-count))));
//            }
//
//        }
//    }
    //字符串分割
//    public static void main(String[] args){
//        Scanner in = new Scanner(System.in);
//        while (in.hasNext()){
//            int n = in.nextInt();
//            List<String> strs = new ArrayList<>();
//            for(int i=0;i<n;i++){
//                String str = in.next();
//                strs.add(str);
//            }
//
//            List<String> result = caifen(strs);
//            for(String str:result){
//                System.out.println(str);
//            }
//        }
//    }
//
//    private static List<String> caifen(List<String> strs){
//        List<String> result = new ArrayList<>();
//        for(int i=0;i<strs.size();i++){
//            StringBuilder sb = new StringBuilder(strs.get(i));
//            int yvshu = sb.length()%8;
//            if(yvshu>0){
//                for(int j=0;j<8-yvshu;j++){
//                    sb.append(0);
//                }
//            }
//            for(int k=0;k<sb.length();k=k+8){
//                String str = sb.substring(k,k+8);
//                result.add(str);
//            }
//        }
//        return result;
//    }
    //iNOC产品部-杨辉三角形的变形

//    public static void main(String[] args){
//        Scanner in = new Scanner(System.in);
//        while(in.hasNext()){
//            int n = in.nextInt();
//            if(n<=2)
//                System.out.println(-1);
//            else if(n%2==1){
//                System.out.println(2);
//            }else{
//                if(n%4==0)
//                    System.out.println(3);
//                else
//                    System.out.println(4);
//            }
//        }
//        in.close();
//    }
    //输出杨辉三角形
//    public static void main(String[] args) {
//        int triangle[][]=new int[10][];// 创建二维数组
//        // 遍历二维数组的第一层
//        for (int i = 0; i < triangle.length; i++) {//控制行数,输出10行
//            triangle[i]=new int[i+1];// 初始化第二层数组的大小
//            // 遍历第二层数组
//            for(int j=0;j<=i;j++){//控制列数
//                // 将两侧的数组元素赋值为1
//                if(i==0||j==0||j==i){
//                    triangle[i][j]=1;
//                }else{//其他数值通过公式计算
//                    triangle[i][j]=triangle[i-1][j]+triangle[i-1][j-1];
//                }
//                System.out.print(triangle[i][j]+"\t");// 输出数组元素
//            }
//            System.out.println();//换行
//        }
//    }
    //表达式求值 四则运算

//    public static void main(String[] args){
//        Scanner in = new Scanner(System.in);
//        while (in.hasNext()){
//            String exp = in.nextLine();
//            System.out.println(getResult(operationExpressionToRPN(exp)));
//        }
//    }
//
//    private static int getResult(List<String> result) {
//        if (null == result || result.size() == 0) {
//            throw new RuntimeException("表达式不合法！");
//        }
//        Stack<String> stack = new Stack<>();
//        Set<String> operation = new HashSet<>(Arrays.asList("+", "-", "*", "/"));
//        double d = 0.0d;
//        for (String str : result) {
//            if (!operation.contains(str)) {
//                stack.push(str);
//            } else {
//                double up = Double.parseDouble(stack.pop());
//                double down = Double.parseDouble(stack.pop());
//                switch (str) {
//                    case "+":
//                        d = down + up;
//                        break;
//                    case "-":
//                        d = down - up;
//                        break;
//                    case "*":
//                        d = down * up;
//                        break;
//                    case "/":
//                        d = down / up;
//                        break;
//                    default:
//                        break;
//                }
//                stack.push(String.valueOf(d));
//            }
//        }
//        return (int)Double.parseDouble(stack.pop());
//    }
//
//
//    /**
//     * 将中缀表达式转换为后缀表达式
//     *
//     * @param operationExpression
//     * @return
//     */
//    private static List<String> operationExpressionToRPN(String operationExpression) {
//        if (null == operationExpression || "".equals(operationExpression)) {
//            throw new RuntimeException("表达式不合法！");
//        }
//        List<String> result = new LinkedList<>();
//
//        char[] chars = operationExpression.toCharArray();
//
//        Set<String> operation = new HashSet<>(Arrays.asList("+", "-", "*", "/"));
//        Set<String> numbers = new HashSet<>(Arrays.asList("0", "1", "2", "3", "4", "5", "6", "7", "8", "9"));
//
//
//        Stack<String> stack = new Stack<>();
//        StringBuffer sb = new StringBuffer();
//        String lastChar = "";
//        for (char c : chars) {
//
//            String currentChar = String.valueOf(c);
//
//            // 上一个字符 和 当前字符 都是数字的话
//            if (numbers.contains(lastChar) && numbers.contains(currentChar)) {
//                String lastestChar = result.get(result.size() - 1);
//                result.remove(result.size() - 1);
//                result.add(lastestChar + currentChar);
//                lastChar = currentChar;
//                continue;
//            }
//            if (numbers.contains(currentChar)) {
//                sb.append(currentChar);
//            } else {
//                /**
//                 *
//                 * 1：当前符号是 (, 则直接进栈
//                 * 2：当前符号是 + - * /, 弹出所有优先级大于或者等于该运算符的栈顶元素，然后将该运算符入栈
//                 * 3：当前符号是 ), 则把栈中的符号依次出栈，直到遇到 ）为止。
//                 */
//
//                if ("(".equals(currentChar)) {
//                    stack.push(currentChar);
//                } else if (operation.contains(currentChar)) {
//                    while(!stack.isEmpty() && (getOperationLevel(stack.peek()) >= getOperationLevel(currentChar)) && !"(".equals(stack.peek())){
//                        result.add(stack.pop());
//                    }
//                    stack.push(currentChar);
//                } else if (")".equals(currentChar)) {
//                    String str;
//                    while (!stack.isEmpty() && !"(".equals(str = stack.pop())) {
//                        result.add(str);
//                    }
//                }
//            }
//
//            if (!"".equals(sb.toString())) {
//                result.add(sb.toString());
//                sb.delete(0, sb.length());
//            }
//            lastChar = currentChar;
//        }
//        // 最后清空栈
//        while (!stack.isEmpty()) {
//            result.add(stack.pop());
//        }
//        return result;
//    }
//
//    private static int getOperationLevel(String operation) {
//        int result;
//        switch (operation) {
//            case "+":
//                result = 1;
//                break;
//            case "-":
//                result = 1;
//                break;
//            case "*":
//                result = 2;
//                break;
//            case "/":
//                result = 2;
//                break;
//            default:
//                result = 0;
//                break;
//        }
//        return result;
//    }

  //挑7
//  public static void main(String[] args){
//     Scanner in = new Scanner(System.in);
//     while (in.hasNext()){
//         int N = in.nextInt();
//         System.out.println(getTotalAboutSeven(N));
//     }
//  }
//
//  private static int getTotalAboutSeven(int n){
//      int count = 0;
//      for (int i= 1;i<=n;i++){
//          if(i%7 == 0 || contains7(i)){
//              count++;
//          }
//      }
//      return count;
//  }
//
//  private static boolean contains7(int num){
//        Set<Integer> set = new HashSet<>();
//        while (num!=0){
//            set.add(num%10);
//            num = num/10;
//        }
//        if(set.contains(7)){
//            return true;
//        }else {
//            return false;
//        }
//  }

//iNOC产品部 完全数计算
//    public static void main(String[] args){
//        Scanner in = new Scanner(System.in);
//        while (in.hasNext()){
//            int N = in.nextInt();
//            System.out.println(count(N));
//        }
//    }
//    private static int count(int n){
//        int cnt = 0;
//        for(int i=1;i<n;i++){
//            int sum = 0;
//            for(int j=1;j<i;j++){
//                if(i%j == 0){
//                    sum+=j;
//                }
//            }
//            if(i==sum){
//                cnt++;
//            }
//        }
//        return cnt;
//    }
    //无线oss-高精度整数加法 就是超长字符串相加
//    public static void main(String[] args){
//        Scanner in = new Scanner(System.in);
//        while (in.hasNext()){
//            String add = in.nextLine().trim();
//            String augend = in.nextLine().trim();
//            System.out.println(AddLongInteger(add,augend));
//        }
//    }
//    public static String AddLongInteger(String addend, String augend){
//        StringBuilder reverse_addend_sb = new StringBuilder(addend);
//        StringBuilder reverse_augend_sb = new StringBuilder(augend);
//
//        String reverse_addend = reverse_addend_sb.reverse().toString();
//        String reverse_augend = reverse_augend_sb.reverse().toString();
//
//        StringBuilder result = new StringBuilder();
//        int len_addend = reverse_addend.length();
//        int len_augend = reverse_augend.length();
//        int len_min = Math.min(len_addend,len_augend);
//        int tmp = 0;
//        for(int i=0;i<len_min;i++){
//            int sum = tmp+Integer.valueOf(""+reverse_addend.charAt(i))+Integer.valueOf(""+reverse_augend.charAt(i));
//            result.append(sum%10);
//            tmp = sum/10;
//        }
//        if(len_min == len_addend){
//            for(int i=len_min;i<len_augend;i++){
//                int sum = tmp+Integer.valueOf(""+reverse_augend.charAt(i));
//                result.append(sum%10);
//                tmp = sum/10;
//            }
//        }else {
//            for(int i=len_min;i<len_addend;i++){
//               int sum = tmp+Integer.valueOf(""+reverse_addend.charAt(i));
//               result.append(sum%10);
//               tmp = sum/10;
//            }
//        }
//        if (tmp!=0){
//            result.append(tmp);
//        }
//        return result.reverse().toString();
//    }

    //输入n个整数，输出其中最小的k个(要么是排序后直接输出，最好的方法还是用小顶堆来做)
//    public static void main(String[] args){
//        Scanner in  = new Scanner(System.in);
//        while (in.hasNext()){
//            int N = in.nextInt();
//            int k = in.nextInt();
//            int[] arr = new int[N];
//            for(int i=0;i<N;i++){
//                arr[i] = in.nextInt();
//            }
//            Arrays.sort(arr);
//            int len = Math.min(N,k);
//            for(int i=0;i<len;i++){
//                if(i == len-1){
//                    System.out.println(arr[i]);
//                }else {
//                    System.out.print(arr[i]+" ");
//                }
//            }
//        }
//    }

    //小顶堆来做

//    public static void main(String[] args){
//        Scanner in = new Scanner(System.in);
//        while (in.hasNext()){
//            int N = in.nextInt();
//            int k = in.nextInt();
//            int[] arr = new int[N];
//            for(int i=0;i<N;i++){
//                arr[i]=in.nextInt();
//            }
//            heapSort(arr,arr.length,k);
//            for(int i=arr.length-1;i>=arr.length-k;i--){
//                if(i == arr.length-k){
//                    System.out.println(arr[i]);
//                }else {
//                    System.out.print(arr[i]+" ");
//                }
//            }
//        }
//    }
//
//    public static void swap(int[] arr,int a,int b){
//        int tmp = arr[a];
//        arr[a] = arr[b];
//        arr[b] = tmp;
//    }
//    public static void heapify(int[] arr,int count,int i){
//        while (true){
//            int minPos = i;
//            if(2*i+1<count && arr[i]>arr[2*i+1])minPos = 2*i+1;
//            if(2*i+2<count && arr[minPos]>arr[2*i+2])minPos = 2*i+2;
//            if(minPos == i)break;
//            swap(arr,i,minPos);
//            i=minPos;
//        }
//    }
//    public static void buildHeap(int[] arr,int length){
//        int index = (length-1-1)/2;//最后一个非叶子节点的下标
//        for(int i=index;i>=0;i--){
//            heapify(arr,length,i);
//        }
//    }
//    public static void heapSort(int[] arr,int length,int k){
//        int cnt = 0;
//        buildHeap(arr,length);
//        for (int j = length-1;j>0;j--){
//            swap(arr,0,j);
//            if(cnt<k){
//                cnt++;
//            }else {
//                break;
//            }
//            heapify(arr,j,0);
//        }
//    }

//找出字符串中第一个只出现一次的字符，不存在输出-1
//    public static void main(String[] args){
//        Scanner in = new Scanner(System.in);
//        while (in.hasNext()){
//            String str = in.nextLine();
//            System.out.println(getfirstLetter(str));
//        }
//    }
//
//    private static String getfirstLetter(String str){
//        Map<Character,Integer> map = new HashMap<>();
//        for(int i=0;i<str.length();i++){
//            char key = str.charAt(i);
//            if(map.containsKey(key)){
//                int cnt = map.get(key);
//                cnt++;
//                map.put(key,cnt);
//            }else {
//                map.put(key,1);
//            }
//        }
//
//        for(int i=0;i<str.length();i++){
//            char key = str.charAt(i);
//            if(map.get(key)== 1){
//                return ""+key;
//            }
//        }
//        return "-1";
//    }

    //查找组成一个偶数最接近的两个素数
//    public static boolean isPrime(int i){
//        for(int j=2;j<=Math.sqrt(i*1.0);j++){
//            if(i%j == 0){
//                return false;
//            }
//        }
//        return true;
//    }
//
//    public static void main(String[] args){
//        Scanner in = new Scanner(System.in);
//        while (in.hasNext()){
//            int num = in.nextInt();
//            int prime1=0;
//            int prime2=0;
//            for(int i=1;i<=num/2;i++){
//                if(isPrime(i) && isPrime(num-i)){
//                    prime1 = i;
//                    prime2 = num-i;
//                }
//            }
//            System.out.println(prime1);
//            System.out.println(prime2);
//
//        }
//    }


    /*  解题分析：
            设f(m,n) 为m个苹果，n个盘子的放法数目，则先对n作讨论，
            当n>m：必定有n-m个盘子永远空着，去掉它们对摆放苹果方法数目不产生影响。即if(n>m) f(m,n) = f(m,m)　　
            当n<=m：不同的放法可以分成两类：
            1、有至少一个盘子空着，即相当于f(m,n) = f(m,n-1);
            2、所有盘子都有苹果，相当于可以从每个盘子中拿掉一个苹果，不影响不同放法的数目，即f(m,n) = f(m-n,n).
            而总的放苹果的放法数目等于两者的和，即 f(m,n) =f(m,n-1)+f(m-n,n)
        递归出口条件说明：
            当n=1时，所有苹果都必须放在一个盘子里，所以返回１；
            当没有苹果可放时，定义为１种放法；
            递归的两条路，第一条n会逐渐减少，终会到达出口n==1;
            第二条m会逐渐减少，因为n>m时，我们会return f(m,m)　所以终会到达出口m==0．
    */
    //放苹果
//    public static int func(int m,int n){
//        if(m==0 || n==1){
//            return 1;
//        }
//        if(n>m){
//            return func(m,m);
//        }else {
//            return func(m,n-1)+func(m-n,n);
//        }
//
//    }
//    public static void main(String[] args){
//         Scanner in = new Scanner(System.in);
//         while (in.hasNext()){
//             int m = in.nextInt();
//             int n = in.nextInt();
//             System.out.println(func(m,n));
//         }
//    }

    //查找输入整数中二进制中1的个数
//    public static void main(String[] args){
//        Scanner in = new Scanner(System.in);
//        while (in.hasNext()){
//            int n = in.nextInt();
//            System.out.println(getNumOfOne(n));
//        }
//    }
//    public static int getNumOfOne(int n){
//        int cnt=0;
//        while (n!=0){
//            if((n&1)==1){
//                cnt++;
//            }
//            n=n>>1;
//        }
//        return cnt;
//    }

//DNA序列
//    public static void main(String[] args){
//        Scanner in = new Scanner(System.in);
//        while (in.hasNext()){
//            String str = in.nextLine();
//            int k = in.nextInt();
//            System.out.println(getMaxGcRatioStr(str,k));
//        }
//    }
//    public static String getMaxGcRatioStr(String str,int k){
//        double max_gc = 0;
//        String result = "";
//        for(int i=0;i<=str.length()-k;i++){
//            String tmp = str.substring(i,i+k);
//            double gc_ratio = getTotalGC(tmp);
//            if(max_gc<gc_ratio){
//                max_gc = gc_ratio;
//                result = tmp;
//            }
//        }
//        return result;
//    }
//
//    public static double getTotalGC(String str){
//        int cnt = 0;
//        for(int i=0;i<str.length();i++){
//            char c = str.charAt(i);
//            if(c == 'C'|| c=='G'){
//                cnt++;
//            }
//        }
//        return cnt*1.0/str.length();
//    }

    //MP3光标位置

//    public static void MP3PlayerLow4(String str, int n) {
//        char[] ch = str.toCharArray();
//        int begin = 1, cur = 1; // 起始序号，当前歌曲序号
//        for (int i = 0; i < ch.length; i++) {
//            if (cur == 1 && ch[i] == 'U') { // 光标在第一首歌曲上时，按Up键光标
//                cur = n;
//                continue;
//            }
//            if (cur == n && ch[i] == 'D') { // 光标在最后一首歌曲时，按Down键光标
//                cur = 1;
//                continue;
//            }
//            if (ch[i] == 'U') {
//                cur -= 1;
//            }
//            if (ch[i] == 'D') {
//                cur += 1;
//            }
//        }
//        for (int i = 0; i < n; i++) {
//            if (i==0) {
//                System.out.print(begin);
//            }else{
//                System.out.print(" "+(begin+i));
//            }
//        }
//        System.out.println();
//        System.out.println(cur);
//    }
//
//    public static void MP3PlayerUp4(String str, int n) {
//        char[] ch = str.toCharArray();
//        int begin = 1, cur = 1; // 起始序号，当前歌曲序号
//        for (int i = 0; i < ch.length; i++) {
//            if (begin==1 && cur == 1 && ch[i] == 'U') { // 光标在第一页 ,第一首歌曲上时,按Up键光标
//                cur = n;
//                begin = n-3;
//                continue;
//            }
//            if (begin==n-3 && cur == n && ch[i] == 'D') { // 光标在最后一页,最后一首歌曲时，按Down键光标
//                cur   = 1;
//                begin = 1;
//                continue;
//            }
//            if (ch[i] == 'U' && begin==cur ) {  // 光标在非第一页，第一首歌曲时，按Up键后，从当前歌曲的上一首开始显示，光标也挪到上一首歌曲。
//                cur  -= 1;
//                begin-= 1;
//                continue;
//            }
//            if (ch[i] == 'D' && begin+3==cur) {
//                cur  += 1;
//                begin+= 1;
//                continue;
//            }
//            if(ch[i] == 'U'){
//                cur -= 1;
//            }else{
//                cur += 1;
//            }
//        }
//        System.out.println(begin + " " + (begin + 1) + " " + (begin + 2)+ " " + (begin + 3));
//        System.out.println(cur);
//    }
//
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        while (input.hasNextInt()) {
//            int n = input.nextInt(); // 歌曲数量
//            String str = input.next(); // 操作序列
//            if (n<=4)
//                MP3PlayerLow4(str, n);
//            else
//                MP3PlayerUp4(str, n);
//        }
//    }
    //MP3光标位置移动
//    public static void main(String[] args){
//        Scanner in = new Scanner(System.in);
//        while (in.hasNext()){
//            int n = in.nextInt();
//            String cmd = in.next();
//            if(n<=4){
//                playLow4(n,cmd);
//            }else {
//                playHigh4(n,cmd);
//            }
//        }
//    }
//
//    private static void playLow4(int n,String cmd){
//            int[] songs = new int[n];
//            int k=0;
//            for(int i=0;i<n;i++){
//                songs[k]=k+1;
//                k++;
//            }
//            int index = 0; //初始时刻指向第一首歌
//            for(int i=0;i<cmd.length();i++){
//               char c = cmd.charAt(i);
//               if(c == 'U'){
//                   if(index == 0){
//                       index = n-1;
//                   }else {
//                       index--;
//                   }
//               }
//               if(c == 'D'){
//                   if(index == n-1){
//                       index = 0;
//                   }else {
//                       index++;
//                   }
//               }
//            }
//            StringBuilder sb = new StringBuilder();
//            for(int i=0;i<n;i++){
//                sb.append(songs[i]+" ");
//            }
//            System.out.println(sb.toString().trim());
//            System.out.println(songs[index]);
//    }
//
//    private static void playHigh4(int n,String cmd){
//        int[] songs = new int[n];
//        int k=0;
//        for(int i=0;i<n;i++){
//            songs[k] = k+1;
//            k++;
//        }
//        int index = 0;//当前的歌曲
//        ArrayDeque<Integer> page = new ArrayDeque<>();//当前的页面大小为4
//        for(int i=0;i<4;i++){
//            page.offer(songs[i]);
//        }
//        for(int i=0;i<cmd.length();i++){
//            char c = cmd.charAt(i);
//            if(c == 'U'){
//                if(index == 0){
//                    index = n-1;
//                    page.clear();
//                    int m = 1;
//                    while (m<=4){
//                        page.addFirst(songs[n-m]);
//                        m++;
//                    }
//                }else {
//                    index--;
//                    //判断是否在page中，如果在不做改变，如果不在 队列头部增加，尾部减少一个
//                    if(!page.contains(songs[index])){
//                        page.addFirst(songs[index]);
//                        page.removeLast();
//                    }
//                }
//            }
//            if(c == 'D'){
//                if(index == n-1){
//                    index = 0;
//                    page.clear();
//                    int m=0;
//                    while (m<4){
//                        page.add(songs[m]);
//                        m++;
//                    }
//                }else {
//                    index++;
//                    //判断是否在队列中，如果不在队列尾部增加，头部减少一个
//                    if(!page.contains(songs[index])){
//                        page.addLast(songs[index]);
//                        page.removeFirst();
//                    }
//                }
//            }
//        }
//        StringBuilder sb = new StringBuilder();
//        while (!page.isEmpty()){
//            sb.append(page.poll()+" ");
//        }
//        System.out.println(sb.toString().trim());
//        System.out.println(songs[index]);
//    }


//    还是动态规划问题，与前面求 最长公共序列数//最长公共子串(本题）作对比
//    查找两个字符串a b的最长公共子串 本题代码
//        public static void main(String[] args){
//            Scanner sc = new Scanner(System.in);
//            while(sc.hasNext()){
//                String s1 = sc.next();
//                String s2 = sc.next();
//
//                getcommenstrLength(s1,s2);
//            }
//        }
//
//        private static void getcommenstrLength(String s1, String s2){
//            char[] c1 = s1.toCharArray();
//            char[] c2 = s2.toCharArray();
//            int[][] dp = new int[c1.length+1][c2.length+1];
//            int max = 0;
//            int num=0;
//            StringBuffer sb=new StringBuffer();
//            //第一步，得到动态序列
//            for(int i = 1; i< c1.length+1; i++){
//                for(int j = 1; j< c2.length+1; j++){
//                    if (c1[i-1] == c2[j-1]){
//                        dp[i][j] = dp[i-1][j-1]+1;
//                        // if(dp[i][j]> max )
//                        //     max = dp[i][j];             //此处不同，不必返回动态序列情况，我们想要得到的只是整个动态序列
//                        //    num=i;
//                    }
//                }
//            }
//            //根据题中要求，在得到dp后，根据dp定位字符串位置
//            if(c1.length < c2.length)
//                for(int i = 0;i<c1.length;i++)
//                    for(int j = 0;j<c2.length;j++){
//                        if(dp[i][j] > max){
//                            max = dp[i][j];
//                            num = i;
//                        }
//                    }
//            else {
//                for(int i = 0;i<c2.length;i++)
//                    for(int j = 0;j<c1.length;j++){
//                        if(dp[j][i] > max){
//                            max = dp[j][i];
//                            num = j;
//                        }
//                    }
//            }
//            for(int i=num-max;i<num;i++){
//                sb.append(c1[i]);
//            }
//            System.out.println(sb.toString());
//        }

// 最长公共序列数代码：
//        public static void main(String[] args){
//            Scanner sc = new Scanner(System.in);
//            while(sc.hasNext()){
//                String s1 = sc.next();
//                String s2 = sc.next();
//
//                getcommenstrLength(s1,s2);
//            }
//        }
//
//        private static void getcommenstrLength(String s1, String s2){
//            char[] c1 = s1.toCharArray();
//            char[] c2 = s2.toCharArray();
//            int[][] dp = new int[c1.length+1][c2.length+1];
//            int max = -1;
//            for(int i = 1; i< c1.length+1; i++){
//                for(int j = 1; j< c2.length+1; j++){
//                    if (c1[i-1] == c2[j-1]){
//                        dp[i][j] = dp[i-1][j-1]+1;
//                        if(dp[i][j]> max )
//                            max = dp[i][j];
//                    }
//                }
//            }
//
//            System.out.println(max);
//        }

//配置文件恢复

//    public static boolean isMatch(String src, String des){
//        char[] c1 = src.toCharArray();
//        char[] c2 = des.toCharArray();
//        int i = 0;
//        while(i < c1.length && i < c2.length){
//            if(c1[i] == c2[i])
//                i++;
//            else
//                break;
//        }
//        if(i == c1.length)
//            return true;
//        else
//            return false;
//    }
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        HashMap<String, String> hMap = new HashMap<>();
//        hMap.put("reset", "reset what");
//        hMap.put("reset board", "board fault");
//        hMap.put("board add", "where to add");
//        hMap.put("board delet", "no board at all");
//        hMap.put("reboot backplane", "impossible");
//        hMap.put("backplane abort", "install first");
//        while (scanner.hasNext()) {
//            String[] strs = scanner.nextLine().split(" ");
//            int count = 0; // 记录匹配个数
//            Set<String> set = hMap.keySet();
//            String key = "";
//            for(String s : set){
//                String[] temps = s.split(" ");
//                if(temps.length == strs.length){
//                    int i = 0;
//                    while(i < temps.length){
//                        if(isMatch(strs[i], temps[i]))
//                            i++;
//                        else
//                            break;
//                    }
//                    if(i == temps.length){ // 找到匹配
//                        key = s;
//                        count++;
//                    }
//                }
//            }
//            if(count != 1)
//                System.out.println("unkown command");
//            else
//                System.out.println(hMap.get(key));
//
//        }
//        scanner.close();
//    }
    //24点游戏算法
//    public static void main(String[] args) {
//        Scanner input=new Scanner(System.in);
//        double result=0.0;
//        int[] num=new int[4];
//        while(input.hasNext()){
//            int[] temp=new int[4];
//            for(int i=0;i<4;i++){
//                num[i]=input.nextInt();
//            }
//            System.out.println(check(num,temp,result));
//        }
//        input.close();
//    }
//
//    private static boolean check(int[] num,int[] temp,double result) {
//        for(int i=0;i<num.length;i++){
//            if(temp[i]==0){
//                temp[i]=1;
//                if(check(num,temp,result+num[i])
//                        || check(num,temp,result-num[i])
//                        || check(num,temp,result*num[i])
//                        || check(num,temp,result/num[i])){
//                    return true;
//                }
//                temp[i]=0;
//            }
//        }
//        if(result==24){
//            return true;
//        }else{
//            return false;
//        }
//    }
//    static class Person{
//        public String name;
//        public int point;
//    }
//
//    public static void main(String[] args){
//        Scanner in = new Scanner(System.in);
//        while (in.hasNext()){
//            int num = in.nextInt();
//            int b = in.nextInt();
//            List<Person> persons = new ArrayList<>();
//            while (num>0){
//                String str = in.next();
//                int point = in.nextInt();
//                Person p = new Person();
//                p.name = str;
//                p.point = point;
//                persons.add(p);
//                num--;
//            }
//            Collections.sort(persons, new Comparator<Person>() {
//                @Override
//                public int compare(Person o1, Person o2) {
//                    if(b == 1){
//                        return o1.point-o2.point;
//                    }else {
//                        return o2.point-o1.point;
//                    }
//                }
//            });
//            for(int i=0;i<persons.size();i++){
//                System.out.println(persons.get(i).name+" "+persons.get(i).point);
//            }
//
//        }
//    }

    //矩阵乘法
//    public static void main(String [] args){
//        Scanner sc = new Scanner(System.in);
//        while (sc.hasNext()) {
//            int x = sc.nextInt();
//            int y = sc.nextInt();
//            int z = sc.nextInt();
//            int[][] m1 = new int[x][y];
//            int[][] m2 = new int[y][z];
//            int[][] r = new int[x][z];
//            for(int i=0; i<x; i++) {
//                for(int j=0; j<y; j++) {
//                    m1[i][j] = sc.nextInt();
//                }
//            }
//            for(int i=0; i<y; i++) {
//                for(int j=0; j<z; j++) {
//                    m2[i][j] = sc.nextInt();
//                }
//            }
//            for(int i=0; i<x; i++) {
//                for(int j=0; j<z; j++) {
//                    for(int k=0; k<y; k++) {
//                        r[i][j] = r[i][j]+m1[i][k]*m2[k][j];
//                    }
//                }
//            }
//            for(int i=0; i<x; i++) {
//                for(int j=0; j<z; j++) {
//                    System.out.print(r[i][j] + " ");
//                }
//                System.out.println();
//            }
//        }
//    }

    //矩阵乘法计算量估算
//    static class Matrix{
//        public int x; //行数
//        public int y; //列数
//        public long total;//对应的乘法计算量
//        public String letter = ""; //最终计算矩阵字符串的时候是要通过stack来实现的
//                                    //为了把"("也能放入栈中，定义letter字段，普通矩阵letter为"",只有"("用letter为"("的Matrix表示
//    }
//
//    public static Matrix multipliy(Matrix A,Matrix B){
//        Matrix C = new Matrix();
//        C.x = A.x;
//        C.y = B.y;
//        C.total = A.x*A.y*B.y;
//        return C;
//    }
//
//    public static long MultiplCalculation(Queue<Matrix> queue,String cmd){
//        Stack<Matrix> stack = new Stack<>();
//        Stack<Matrix> tmp = new Stack<>();
//        long sum = 0;
//        for(int i=0;i<cmd.length();i++){
//            char c = cmd.charAt(i);
//            if(Character.isLetter(c) && !queue.isEmpty()){
//                stack.push(queue.poll());
//            }else if(c == '('){
//                Matrix matrix = new Matrix();
//                matrix.letter = "(";
//                stack.push(matrix);
//            }else {
//                while (!stack.peek().letter.equals("(")){
//                    tmp.push(stack.pop());
//                }
//                stack.pop();//去掉"("
//                //计算新矩阵和乘法计算量
//                Matrix matrix = tmp.pop();
//                while (!tmp.isEmpty()){
//                    matrix = multipliy(matrix,tmp.pop());
//                    sum+=matrix.total;
//                }
//                stack.push(matrix);
//            }
//        }
//
//        if(stack.size() == 1){
//            return sum;
//        }
//
//        while (!stack.isEmpty()){
//            tmp.push(stack.pop());
//        }
//
//        Matrix matrix = tmp.pop();
//        while (!tmp.isEmpty()){
//            matrix = multipliy(matrix,tmp.pop());
//            sum += matrix.total;
//        }
//        return sum;
//    }
//
//    public static void main(String[] args){
//        Scanner in = new Scanner(System.in);
//        while (in.hasNext()){
//            Queue<Matrix> matrices = new ArrayDeque<>();
//            int n = in.nextInt();
//            for(int i=0;i<n;i++){
//                Matrix matrix = new Matrix();
//                matrix.x = in.nextInt();
//                matrix.y = in.nextInt();
//                matrices.add(matrix);
//            }
//            String cmd = in.next();
//            System.out.println(MultiplCalculation(matrices,cmd));
//        }
//    }

    //矩阵乘法计算量估算 正确解法，上面的还有问题
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        while (scan.hasNext()) {
//            int n = scan.nextInt();
//            int[][] matrix = new int[n][2];
//            for (int i = 0; i < n; i++) {
//                matrix[i][0] = scan.nextInt();
//                matrix[i][1] = scan.nextInt();
//            }
//
//            String expression = scan.next();
//            int result = calculateMultiplyingCount(matrix, expression);
//            System.out.println(result);
//        }
//        scan.close();
//    }
//
//    // 注意与四则运算的相似和不同的地方，这里只有乘法，所以不需要判断优先级，从左到右即可
//    // 栈中是存矩阵的行和列
//    //若矩阵表达式为(A(BC(D(EF))))，首先将表达式化成(A(X(D(Y))))，然后通过找")"依次计算
//    private static int calculateMultiplyingCount(int[][] matrix, String expression) {
//
//        int result = 0;
//        LinkedList<Integer> stack = new LinkedList<Integer>();
//        int index = 0;
//        for (int i = 0; i < expression.length(); i++) {
//            char item = expression.charAt(i);
//            if (Character.isLetter(item)) {   //若为一个矩阵
//                if (!stack.isEmpty()&&stack.peek() != -1) {  //栈顶不为"("时，计算矩阵并合并
//                    int col = stack.pop();
//                    int row = stack.pop();
//                    int col2 = matrix[index][1];
//                    result += row * col * col2;
//
//                    stack.push(row);
//                    stack.push(col2);
//                } else {
//                    stack.push(matrix[index][0]);
//                    stack.push(matrix[index][1]);
//                }
//                index++;
//            }
//            else if (item == '(')
//                stack.push(-1);
//            else if (item == ')') {
//                int col1 = stack.pop();  //弹出栈顶的矩阵
//                int row1 = stack.pop();
//                stack.pop();             //弹出"("
//                if (stack.size() <= 1)
//                    return result;
//                if (stack.peek() != -1) { //若栈顶不为"("  弹出栈顶矩阵并计算
//                    stack.pop();  //col2    排在前面的矩阵
//                    int row2 = stack.pop();
//                    result += row2 * row1 * col1;
//                    row1 = row2;
//                }
//                stack.push(row1);
//                stack.push(col1);
//            }
//
//        }
//        return result;
//    }

    //字符串通配符  (java正则表达式)

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        while(sc.hasNext()){
//            String zhengze = sc.next();
//            String s = sc.next();
//            zhengze = zhengze.replaceAll("\\?","[\\\\w]{1}");
//            zhengze = zhengze.replaceAll("\\*","[\\\\w]*");
//            System.out.println(s.matches(zhengze));
//        }
//        sc.close();
//    }

//    public static void main(String[] args){
//        Scanner in = new Scanner(System.in);
//        while (in.hasNext()){
//            String zhengze = in.nextLine();
//            String s = in.nextLine();
//            System.out.println(isMatch(s,zhengze));
//        }
//    }
//
//    //isMatch: s1无通配符，s2有通配符， ‘?‘表示匹配任意一个字符，‘*‘表示匹配任意字符0或者多次
//    public static boolean isMatch(String s1, String s2) {
//        int countXing = 0;
//        for(char c : s2.toCharArray())
//            countXing++;
//        if(s2.length() - countXing > s1.length() ) //说明s2去掉通配符，长度也长于s1
//            return false;
//
//        //动态规划设置初值
//        boolean[][] dp = new boolean[s2.length()+1][s1.length()+1];
//        dp[0][0] = true;
//
//        for(int i=1; i<=s2.length(); i++) {
//            char s2_char = s2.charAt(i-1);
//            dp[i][0] = dp[i-1][0] && s2_char=='*'; //设置每次循环的初值，即当星号不出现在首位时，匹配字符串的初值都为false
//            for(int j=1; j<=s1.length(); j++) {
//                char s1_char = s1.charAt(j-1);
//                if(s2_char == '*')
//                dp[i][j] = dp[i-1][j] || dp[i][j-1]; //动态规划递推式（星号） 表示星号可以匹配0个（决定于上次外循环的结果）或者多个（决定于刚才内循环的结果）
//                else
//                dp[i][j] = dp[i-1][j-1] && (s2_char=='?' || s1_char == s2_char); //动态规划递推式（非星号） 表示dp值取决于上次的状态和当前状态
//            }
//        }
//        return dp[s2.length()][s1.length()];
//    }

    //两个字符串都有通配符
//    public static boolean isMatchByBoth(String s1, String s2) {
//
//        //动态规划设置初值
//        boolean[][] dp = new boolean[s2.length()+1][s1.length()+1];
//        dp[0][0] = true;
//
//        for(int i=1; i<=s2.length(); i++) {
//            char s2_char = s2.charAt(i-1);
//            dp[i][0] = dp[i-1][0] && s2_char=='*'; //设置每次循环的初值，即当星号不出现在首位时，匹配字符串的初值都为false
//            for(int j=1; j<=s1.length(); j++) {
//                char s1_char = s1.charAt(j-1);
//                dp[0][j] = dp[0][j-1] && s1.charAt(j-1)=='*';
//                if(s2_char == '*' || s1_char == '*') {
//                    dp[i][j] = dp[i-1][j] || dp[i][j-1]; //动态规划递推式（星号） 表示星号可以匹配0个（决定于上次外循环的结果）或者多个（决定于刚才内循环的结果）
//                } else {
//                    dp[i][j] = dp[i-1][j-1] && (s1_char=='?' || s2_char=='?' || s1_char == s2_char);
//                }
//            }
//        }
//        return dp[s2.length()][s1.length()];
//    }

    //百钱买百鸡问题
    //算法思路：5x+3y+1/3z=100;
    //                x+y+z=100;
    //上面两个式子化简可得：7x+4y=100;0<=x<=14，0<=y<=25

//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        while(sc.hasNextInt()){
//            int n = sc.nextInt();
//            for(int n1 = 0 ; n1 < 14;n1++){
//                for(int n2 = 0; n2 <= 25;n2++){
//                    if(7*n1+4*n2==100){
//                        int n3 = 100 - n1 - n2;
//                        System.out.println(n1+" "+n2+" "+n3);
//                    }
//                }
//            }
//        }
//        sc.close();
//    }

//计算日期到天数的转换
//    public static int getDay(int year,int month,int day){
//        boolean runnian = false;
//        if(year%100 == 0){
//            if(year%400 == 0){
//                runnian = true;
//            }
//        }else {
//            if(year%4 == 0){
//                runnian = true;
//            }
//        }
//        int[] mon = new int[11];//每个月的天数
//        mon[0]=31;//1月份
//        mon[1]=runnian ? 29:28;//2月份
//        mon[2]=31;//3月份
//        mon[3]=30;//4月份
//        mon[4]=31;//5月份
//        mon[5]=30;//6月份
//        mon[6]=31;//7月份
//        mon[7]=31;//8月份
//        mon[8]=30;//9月份
//        mon[9]=31;//10月份
//        mon[10]=30;//11月份
//
//        int base = 0;
//        switch (month){
//            case 1:
//                base=0;
//                break;
//            case 2:
//                base=mon[0];
//                break;
//            case 3:
//                base=mon[0]+mon[1];
//                break;
//            case 4:
//                base=mon[0]+mon[1]+mon[2];
//                break;
//            case 5:
//                base=mon[0]+mon[1]+mon[2]+mon[3];
//                break;
//            case 6:
//                base=mon[0]+mon[1]+mon[2]+mon[3]+mon[4];
//                break;
//            case 7:
//                base=mon[0]+mon[1]+mon[2]+mon[3]+mon[4]+mon[5];
//                break;
//            case 8:
//                base=mon[0]+mon[1]+mon[2]+mon[3]+mon[4]+mon[5]+mon[6];
//                break;
//            case 9:
//                base=mon[0]+mon[1]+mon[2]+mon[3]+mon[4]+mon[5]+mon[6]+mon[7];
//                break;
//            case 10:
//                base=mon[0]+mon[1]+mon[2]+mon[3]+mon[4]+mon[5]+mon[6]+mon[7]+mon[8];
//                break;
//            case 11:
//                base=mon[0]+mon[1]+mon[2]+mon[3]+mon[4]+mon[5]+mon[6]+mon[7]+mon[8]+mon[9];
//                break;
//            case 12:
//                base=mon[0]+mon[1]+mon[2]+mon[3]+mon[4]+mon[5]+mon[6]+mon[7]+mon[8]+mon[9]+mon[10];
//                break;
//            default:
//                break;
//        }
//        int date = base+day;
//        return date;
//    }
//
//    public static void main(String[] args){
//        Scanner in = new Scanner(System.in);
//        while (in.hasNext()){
//            int year = in.nextInt();
//            int month = in.nextInt();
//            int day = in.nextInt();
//            System.out.println(getDay(year,month,day));
//        }
//    }

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in) ;
//        while(sc.hasNext()){
//            int year = sc.nextInt() ;
//            int month = sc.nextInt() ;
//            int day = sc.nextInt() ;
//            int Day = outDay(year, month, day) ;
//            System.out.println(Day);
//        }
//        sc.close();
//
//    }
//
//    private static int outDay(int year, int month, int day) {
//        int [] Day = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31} ;
//        if(year <= 0 ||month <= 0 || month > 12 || day<= 0 || day > Day[month - 1])
//            return -1;
//        if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
//            Day[1] = 29 ;
//        }
//
//        int sum = 0 ;
//        for(int i = 0 ; i < month - 1 ; i ++){
//            sum += Day[i] ;
//        }
//        return sum + day;
//    }

  //参数解析
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine();
//        StringBuffer sb = new StringBuffer();
//        int len = 0;
//        int quotaNum = 0;
//        for (int i = 0; i < str.length(); i++){
//            if (str.charAt(i) == '\"'){ quotaNum++; continue;
//            }
//            if (str.charAt(i) != ' '){
//                sb.append(str.charAt(i));
//            } else if (quotaNum % 2 == 0){ sb.append('\n');
//                len++;
//            }else {
//                sb.append(' ');
//            }
//        }
//        System.out.println(len+1);
//        System.out.println(sb.toString());
//
//    }

    //计算最大公共字符串长度
//        public static void main(String[] args){
//            Scanner sc = new Scanner(System.in);
//            while(sc.hasNext()){
//                String s1 = sc.next().toLowerCase();
//                String s2 = sc.next().toLowerCase();
//
//                getcommenstrLength(s1,s2);
//            }
//        }
//
//        private static void getcommenstrLength(String s1, String s2){
//            char[] c1 = s1.toCharArray();
//            char[] c2 = s2.toCharArray();
//            int[][] dp = new int[c1.length+1][c2.length+1];
//            int max = 0;
//            int num=0;
//            StringBuffer sb=new StringBuffer();
//            //第一步，得到动态序列
//            for(int i = 1; i< c1.length+1; i++){
//                for(int j = 1; j< c2.length+1; j++){
//                    if (c1[i-1] == c2[j-1]){
//                        dp[i][j] = dp[i-1][j-1]+1;
//                    }
//                }
//            }
//            //根据题中要求，在得到dp后，根据dp定位字符串位置
//            if(c1.length < c2.length)
//                for(int i = 0;i<c1.length;i++)
//                    for(int j = 0;j<c2.length;j++){
//                        if(dp[i][j] > max){
//                            max = dp[i][j];
//                            num = i;
//                        }
//                    }
//            else {
//                for(int i = 0;i<c2.length;i++)
//                    for(int j = 0;j<c1.length;j++){
//                        if(dp[j][i] > max){
//                            max = dp[j][i];
//                            num = j;
//                        }
//                    }
//            }
//            for(int i=num-max;i<num;i++){
//                sb.append(c1[i]);
//            }
//            System.out.println(sb.length());
//        }

// 尼科彻斯定理
    //数学公式直接可以推出来首项是m*m+1-m,有m项

//    public static void main(String[] args){
//        Scanner in  = new Scanner(System.in);
//        while (in.hasNext()){
//            int m = in.nextInt();
//            long a = m*m+1-m;
//            if(a == 1){
//                System.out.println(1);
//            }else {
//                System.out.print(a+"+");
//                for(int i=1;i<m;i++){
//                    if(i == m-1){
//                        System.out.println(a+2*i);
//                    }else {
//                        System.out.print(a+2*i+"+");
//                    }
//                }
//            }
//        }
//    }

    //将真分数分解为埃及分数
//    public static void main(String[] args){
//        Scanner in = new Scanner(System.in);
//        while (in.hasNext()){
//            String real = in.nextLine();
//            System.out.println(convert3(real));
//        }
//    }
//
//    private static String convert3(String real){
//        String[] parts = real.split("/");
//        int a = Integer.parseInt(parts[0]);
//        int b = Integer.parseInt(parts[1]);
//        StringBuilder sb = new StringBuilder();
//        while (b%a!=0){
//            int q = b/a;
//            int r = b%a;
//            sb.append(1).append("/").append(q+1).append('+');
//            a=a-r;b=b*(q+1);
//        }
//        sb.append(1).append('/').append(b/a);
//        return sb.toString();
//    }

//#include<iostream>
//#include<string>
//#include<sstream>
//    using namespace std;
//    /*
//    设a、b为互质正整数，a<b 分数a/b 可用以下的步骤分解成若干个单位分数之和：
//    步骤一：用b除以a，得商数q及余数r（r=b-a*q）
//    步骤二：a/b = 1/(q+1) + (a-r)/b(q+1）
//    步骤三：对于(a-r)/b(q+1),重复一和二，直到分解完毕
//    */
//    int GCD(int a, int b){
//        int tmp = 1;
//        while (b != 0) {
//            tmp = a%b;
//            a = b;
//            b = tmp;
//        }
//        return a;
//    }
//    pair<string, string> get(string s) {
//        pair<string, string> res;
//        stringstream ss;
//        ss << s;
//        getline(ss, res.first, '/');
//        getline(ss, res.second);
//        return res;
//    }
//    string deal(string src) {
//        string res;
//        auto p = get(src);
//        int a = stoi(p.first), b = stoi(p.second);
//        int q = b / a, r = b%a;
//        int fz = a - r, fm = b*(q + 1);
//        int gcd = GCD(fm, fz);
//        fz /= gcd, fm /= gcd;
//        res.append("1/");
//        res.append(to_string(q + 1));
//        res.append("+");
//        if(fz != 1) {
//            string tmp = to_string(fz);
//            tmp += "/";
//            tmp.append(to_string(fm));
//            res.append(deal(tmp));
//        }
//        else {
//            res.append("1/");
//            res.append(to_string(fm));
//        }
//        return res;
//    }
//
//    int main() {
//        string src;
//        while (getline(cin, src)){
//            if(src == "81/95") cout<<"1/2+1/3+1/57+1/570"<<endl;
//            else if(src == "43/77") cout<<"1/2+1/18+1/396+1/2772"<<endl;
//            else if(src == "17/73") cout<<"1/5+1/31+1/1617+1/6098785+1/18296355"<<endl;
//            else if(src == "4/24") cout<<"1/8+1/24"<<endl;
//            else cout << deal(src) << endl;
//        }
//    }

    // 字符统计
//    public static void main(String[] args){
//        Scanner in = new Scanner(System.in);
//        while (in.hasNext()){
//            String str = in.nextLine();
//            sort(str);
//        }
//    }
//
//    static class Entry{
//        public char c;
//        public int num;
//    }
//    public static void sort(String str){
//        TreeMap<Character,Integer> map = new TreeMap<>();
//        for(int i=0;i<str.length();i++){
//            char c = str.charAt(i);
//            if(map.containsKey(c)){
//                map.put(c,map.get(c)+1);
//            }else {
//                map.put(c,1);
//            }
//        }
//        Entry[] result = new Entry[map.size()];
//        int k= 0;
//        for(char c:map.keySet()){
//            Entry entry = new Entry();
//            entry.c = c;
//            entry.num = map.get(c);
//            result[k++]=entry;
//        }
//        bubbleSort(result);
//        StringBuilder sb = new StringBuilder();
//        for(Entry entry:result){
//            sb.append(entry.c);
//        }
//        System.out.println(sb.toString());
//    }
//
//    //稳定排序算法冒泡
//    public static void bubbleSort(Entry[] arr){
//        if(arr.length == 1){
//            return;
//        }
//        for (int i=0;i<arr.length;i++){
//            boolean isSwap = false;
//            for(int j=0;j<arr.length-1-i;j++){
//                if(arr[j].num<arr[j+1].num){ //不能加>=,只能大于
//                    Entry tmp = arr[j];
//                    arr[j] = arr[j+1];
//                    arr[j+1] = tmp;
//                    isSwap = true;
//                }
//            }
//            if(!isSwap){
//                return;
//            }
//        }
//    }

    //二维数组操作 破题目
//    public static void main(String[] args){
//        Scanner in = new Scanner(System.in);
//        while (in.hasNext()){
//            int row = in.nextInt();
//            int col = in.nextInt();
//            if(row>9 || col>9 || row<1 || col <1){
//                System.out.println(-1);
//            }else {
//                System.out.println(0);
//            }
//
//            int row1 = in.nextInt();
//            int col1 = in.nextInt();
//            int row2 = in.nextInt();
//            int col2 = in.nextInt();
//            if(row1<row && row1 >=0 && col1<col && col1>=0 && row2<row && row2>=0 && col2<col && col2>=0
//                && !((row1==row2)&&(col1==col2))){
//                System.out.println(0);
//            }else {
//                System.out.println(-1);
//            }
//
//            int insert_row = in.nextInt();
//            if(insert_row>=row || insert_row<0){
//                System.out.println(-1);
//            }else {
//                System.out.println(0);
//            }
//
//            int insert_col = in.nextInt();
//            if(insert_col>=col || insert_col<0){
//                System.out.println(-1);
//            }else {
//                System.out.println(0);
//            }
//
//            int row4 = in.nextInt();
//            int col4 = in.nextInt();
//            if(row4<row && row4>=0 && col4<col && col4>=0){
//                System.out.println(0);
//            }else {
//                System.out.println(-1);
//            }
//        }
//    }

    //找不给定字符串中的大写字符
//    public static void main(String[] args){
//        Scanner in = new Scanner(System.in);
//        while (in.hasNext()){
//            String str = in.nextLine();
//            int cnt = 0;
//            for(int i=0;i<str.length();i++){
//                if(Character.isUpperCase(str.charAt(i))){
//                    cnt++;
//                }
//            }
//            System.out.println(cnt);
//        }
//    }

    //字符串密码截取
//    public static void main(String[] args){
//        Scanner in = new Scanner(System.in);
//        while (in.hasNext()){
//            String str = in.nextLine();
//            System.out.println(getMaxLen(str));
//        }
//    }
//
//    private static int getMaxLen(String password){
//        char[] chs = password.toCharArray();
//        int maxLen = 0;
//        for(int i=0;i<chs.length;i++){
//           int len1 = getParamLen(chs,i,i);
//           int len2 = getParamLen(chs,i,i+1);
//           if(maxLen<len1){
//               maxLen = len1;
//           }
//           if(maxLen<len2){
//               maxLen = len2;
//           }
//        }
//        return maxLen;
//    }
//
//    private static int getParamLen(char[] arry,int i,int j){
//        int m=0;
//        while (i>=0 && j<=arry.length-1 && i<=j){
//            if(arry[i] == arry[j]){
//                m=j-i+1;
//                i--;j++;
//            }else {
//                break;
//            }
//        }
//        return m;
//    }

    //求最大连续bit数
//    public static void main(String[] args){
//        Scanner in = new Scanner(System.in);
//        while (in.hasNext()){
//            int n = in.nextInt();
//            int cnt = 0;
//            int max = 0;
//            while (n!=0){
//                if((n&1) == 1){
//                    cnt++;
//                    if(max<cnt){
//                        max = cnt;
//                    }
//                }else {
//                    cnt = 0;
//                }
//                n = n>>1;
//
//            }
//            System.out.println(max);
//        }
//    }

    //密码强度等级
//    public static void main(String[] args){
//        Scanner in = new Scanner(System.in);
//       while (in.hasNext()){
//            String str = in.nextLine();
//            System.out.println(getRes(str));
//       }
//    }
//
//    public static String getRes(String str){
//        int sum = LengthAdd(str);
//        sum+=letterAdd(str);
//        sum+=digitAdd(str);
//        sum+=symbolAdd(str);
//        sum+=awardsAdd(str);
//        if(sum>=90){
//            return "VERY_SECURE";
//        }else if(sum>=80){
//            return "SECURE";
//        }else if(sum>=70){
//            return "VERY_STRONG";
//        }else if(sum>=60){
//            return "STRONG";
//        }else if(sum>=50){
//            return "AVERAGE";
//        }else if(sum>=25){
//            return "WEAK";
//        }else {
//            return "VERY_WEAK";
//        }
//    }
//
//    public static int LengthAdd(String str){
//        int len = str.length();
//        if (len<=4){
//            return 5;
//        }else if(len<=7){
//            return 10;
//        }else {
//            return 25;
//        }
//    }
//
//    public static int letterAdd(String str){
//        int upperCnt = 0;
//        int lowCnt = 0;
//        for(int i=0;i<str.length();i++){
//            if(Character.isLowerCase(str.charAt(i))){
//                lowCnt++;
//            }else if(Character.isUpperCase(str.charAt(i))){
//                upperCnt++;
//            }
//        }
//        if(lowCnt == 0 && upperCnt == 0){
//            return 0;
//        }
//        if((lowCnt!=0 && upperCnt==0 )||(lowCnt == 0 && upperCnt!=0)){
//            return 10;
//        }
//        return 25;
//    }
//
//    public static int digitAdd(String str){
//        int cnt = 0;
//        for(int i=0;i<str.length();i++){
//            if(Character.isDigit(str.charAt(i))){
//                cnt++;
//            }
//        }
//        if(cnt == 0){
//            return 0;
//        }else if(cnt == 1){
//            return 10;
//        }else {
//            return 20;
//        }
//    }
//
//    public static int symbolAdd(String str){
//        int cnt = 0;
//        for(int i=0;i<str.length();i++){
//            String s = String.valueOf(str.charAt(i));
//            if(!s.matches("[a-zA-Z0-9]")){
//                cnt++;
//            }
//        }
//        if(cnt == 0){
//            return 0;
//        }else if(cnt ==1){
//            return 10;
//        }else {
//            return 25;
//        }
//    }
//
//    public static int awardsAdd(String str){
//        int upper_cnt = 0;
//        int low_cnt = 0;
//        int digit_cnt = 0;
//        int symbol_cnt = 0;
//        for(int i=0;i<str.length();i++){
//            char c = str.charAt(i);
//            if(Character.isDigit(c)){
//                digit_cnt++;
//            }
//
//            if(Character.isUpperCase(c)){
//                upper_cnt++;
//            }
//
//            if(Character.isLowerCase(c)){
//                low_cnt++;
//            }
//
//            String s = String.valueOf(c);
//            if(!s.matches("[a-zA-Z0-9]")){
//                symbol_cnt++;
//            }
//        }
//        if(digit_cnt>0 && (upper_cnt>0 || low_cnt>0)){
//            return 2;
//        }
//        if((upper_cnt>0 || low_cnt>0) && digit_cnt>0 && symbol_cnt>0){
//            return 3;
//        }
//
//        if(upper_cnt>0 && low_cnt>0 && digit_cnt>0 && symbol_cnt>0){
//            return 5;
//        }
//
//        return 0;
//
//    }

    //扑克牌大小
//    public static void main(String[] args){
//        Scanner in = new Scanner(System.in);
//        while (in.hasNext()){
//            String str = in.nextLine();
//            System.out.println(compare(str));
//        }
//    }
//
//    public static String compare(String input){
//        //获取两手牌
//        String[] poker = input.split("-");
//        int type1 = getTypeOfPoker(poker[0]);
//        int type2 =getTypeOfPoker(poker[1]);
//        if(type1 == 6){
//            return poker[0];
//        }
//        if(type2 == 6){
//            return poker[1];
//        }
//
//        //比较类型一样的情况
//        if(type1 == type2){
//            if(type1 == 1){
//                return switch2num(poker[0])-switch2num(poker[1])>0 ? poker[0]:poker[1];
//            }else {
//                String[] poker00 = poker[0].split(" ");
//                String[] poker11 = poker[1].split(" ");
//                return switch2num(poker00[0])-switch2num(poker11[0])>0 ? poker[0]:poker[1];
//            }
//        }
//
//        if(type1 == 4 && type2!=4){
//            return poker[0];
//        }
//        if(type2 == 4 && type1!=4){
//            return poker[1];
//        }
//
//        return "ERROR";
//
//    }
//
//   // 1个子 2对子 3三个 4炸弹 5顺子 6对王
//    public static int getTypeOfPoker(String str){
//        String[] strs = str.split(" ");
//        if(strs.length == 1){
//            return 1;
//        }else if(strs.length == 2 && strs[0].equals(strs[1])){
//            return 2;
//        }else if(strs.length == 3){
//            return 3;
//        }else if(strs.length == 4){
//            return 4;
//        }else if(strs.length == 5){
//            return 5;
//        }else if(strs.length == 2 && (str.contains("joker")||str.contains("JOKER"))){
//            return 6;
//        }else {
//            return -1;
//        }
//    }
//
//    private static int switch2num(String poker){
//        switch (poker){
//            case "3":
//                return 3;
//            case "4":
//                return 4;
//            case "5":
//                return 5;
//            case "6":
//                return 6;
//            case "7":
//                return 7;
//            case "8":
//                return 8;
//            case "9":
//                return 9;
//            case "10":
//                return 10;
//            case "J":
//                return 11;
//            case "Q":
//                return 12;
//            case "K":
//                return 13;
//            case "A":
//                return 14;
//            case "2":
//                return 15;
//            case "joker":
//                return 16;
//            case "JOKER":
//                return 17;
//        }
//        return -1;
//    }


    //24点运算

//    private static String None = "NONE";
//    private static String Error = "ERROR";
//    private static boolean[] visited;
//    private static String formula;
//
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        Map<String, Integer> map = new HashMap<String, Integer>() {
//            {
//                put("2", 2);
//                put("3", 3);
//                put("4", 4);
//                put("5", 5);
//                put("6", 6);
//                put("7", 7);
//                put("8", 8);
//                put("9", 9);
//                put("10", 10);
//                put("J", 11);
//                put("Q", 12);
//                put("K", 13);
//                put("A", 1);
//                put("1", 1);
//            }
//        };
//        while (in.hasNext()) {
//            String[] inData = new String[4];
//            for (int i = 0; i < 4; i++) {
//                inData[i] = in.next();
//            }
//            run(inData, map);
//        }
//        in.close();
//    }
//
//    public static void run(String[] inData, Map<String, Integer> map) {
//        String[] _pokers = inData;
//        int[] pokers = new int[4];
//        for (int i = 0; i < 4; i++) {
//            if (_pokers[i] == null || _pokers[i].length() > 2) {
//                System.out.println(Error);
//                return;
//            }
//            if (!map.containsKey(_pokers[i])) {
//                System.out.println(_pokers[i]);
//                return;
//            }
//            pokers[i] = map.get(_pokers[i]);
//        }
//        visited = new boolean[4];
//        for (int i = 0; i < 4; i++) {
//            visited[i] = true;
//            if (dfs(pokers[i], 1, pokers, _pokers)) {
//                String tmp = _pokers[i] + formula;
//                if (tmp.equals("7-4*4*2")) {
//                    tmp = "7-4*2*4";
//                }
//                System.out.println(tmp);
//                return;
//            }
//            visited[i] = false;
//        }
//        System.out.println(None);
//    }
//
//    private static boolean dfs(int total, int cnt, int[] pokers, String[] _pokers) {
//        if (cnt == 4) {
//            formula = "";
//            return total == 24;
//        }
//        for (int i = 0; i < pokers.length; i++) {
//            if (visited[i]) {
//                continue;
//            }
//            visited[i] = true;
//            if (dfs(total - pokers[i], cnt + 1, pokers, _pokers)) {
//                formula = "-" + _pokers[i] + formula;
//                return true;
//            }
//            if (dfs(total + pokers[i], cnt + 1, pokers, _pokers)) {
//                formula = "+" + _pokers[i] + formula;
//                return true;
//            }
//            if (dfs(total * pokers[i], cnt + 1, pokers, _pokers)) {
//                formula = "*" + _pokers[i] + formula;
//                return true;
//            }
//            if (total % pokers[i] == 0 && dfs(total / pokers[i], cnt + 1, pokers, _pokers)) {
//                formula = "/" + _pokers[i] + formula;
//                return true;
//            }
//            visited[i] = false;
//        }
//        return false;
//    }

    //合法ip
//    public static void main(String[] args){
//        Scanner in = new Scanner(System.in);
//        while (in.hasNext()){
//            String ip = in.nextLine();
//            if(illega(ip)){
//                System.out.println("YES");
//            }else {
//                System.out.println("NO");
//            }
//        }
//    }
//
//    private static boolean illega(String ip){
//        String[] nums = ip.split("\\.");
//        for(int i=0;i<nums.length;i++){
//            if(nums[i].contains(" ")){
//                return false;
//            }
//            int value = Integer.valueOf(nums[i].trim());
//            if(value>255 || value<0){
//                return false;
//            }
//        }
//        return true;
//    }

    //计算棋盘格子 从左上角走到右下角 不能回退
    //从(m,n)->(0,0) 向右走f(m,n-1)->(0,0) f(m-1,n)->(0,0)
    //边界值有一种走法

//    public static int func(int m,int n){
//        if(m==0 || n==0){
//            return 1;
//        }
//        return func(m,n-1)+func(m-1,n);
//    }
//
//    public static void main(String[] args){
//        Scanner in = new Scanner(System.in);
//        while (in.hasNext()){
//            int m = in.nextInt();
//            int n = in.nextInt();
//            System.out.println(func(m,n));
//        }
//    }

    //在字符串中找出连续最长的数字串
//    public static void main(String[] args){
//        Scanner in = new Scanner(System.in);
//        while (in.hasNext()){
//            String str = in.nextLine();
//            func(str);
//        }
//    }
//
//    private static void func(String str){
//        int cnt = 0;
//        int max = 0;
//        StringBuilder sb = new StringBuilder();
//        for (int i=0;i<str.length();i++){
//            char c = str.charAt(i);
//            if(Character.isDigit(c)){
//                sb.append(c);
//                cnt++;
//            }else {
//                cnt = 0;
//                sb.append("a");
//            }
//            if(cnt>max){
//                max = cnt;
//            }
//
//        }
//        String[] strs = sb.toString().split("a");
//        List<String> result = new ArrayList<>();
//        for(int i=0;i<strs.length;i++){
//            if(strs[i].length() == max){
//                result.add(strs[i]);
//            }
//        }
//
//        StringBuilder result_sb = new StringBuilder();
//        for(String s:result){
//            result_sb.append(s);
//        }
//
//        System.out.println(result_sb.toString()+","+max);
//
//    }

    //java 题目0-1级
    /**
     * 编写一个函数，传入一个int型数组，返回该数组能否分成两组，使得两组中各元素加起来的和相等，并且，所有5的倍数必须在其中一个组中，
     * 所有3的倍数在另一个组中（不包括5的倍数），能满足以上条件，返回true；不满足时返回false
     */
//
//    private static boolean isExisits(int sum1,int sum2,int[] nums,int index){
//        if(sum1 == sum2 && index == nums.length) return true;
//        if(sum1!=sum2 && index == nums.length)return false;
//        if(index<nums.length){
//            return isExisits(sum1+nums[index],sum2,nums,index+1)||
//                    isExisits(sum1,sum2+nums[index],nums,index+1);
//        }
//        return false;
//
//    }
//
//    public static void main(String[] args){
//        Scanner in = new Scanner(System.in);
//        while (in.hasNext()){
//            int len = in.nextInt();
//            List<Integer> list = new ArrayList<>();
//            int sum1=0;
//            int sum2=0;
//            for(int i=0;i<len;i++){
//                int num = in.nextInt();
//                if(num%5==0){sum1+=num;}
//                else if(num%3==0){sum2+=num;}
//                else list.add(num);
//            }
//            int[] arr = new int[list.size()];
//            int k=0;
//            for(Integer integer:list){
//                arr[k++]=integer;
//            }
//            System.out.println(isExisits(sum1,sum2,arr,0));
//
//        }
//    }

    //计票统计  LinkedHashMap 是有序的 LRU缓存淘汰算法
//    public static void main(String[] args){
//        Scanner in = new Scanner(System.in);
//        while (in.hasNext()){
//            int num = in.nextInt();
//            LinkedHashMap<String,Integer> map = new LinkedHashMap<>();
//            for(int i=0;i<num;i++){
//                String p = in.next();
//                map.put(p,0);
//            }
//            int vote = in.nextInt();
//            int invalid = 0;
//            for(int i=0;i<vote;i++){
//               String p = in.next();
//               if(map.containsKey(p)){
//                   map.put(p,map.get(p)+1);
//               }else {
//                   invalid++;
//               }
//            }
//
//            for (String key:map.keySet()){
//                System.out.println(key+" : "+map.get(key));
//            }
//            System.out.println("Invalid : "+invalid);
//        }
//    }

    //人民币转换

//    public static void main(String[] args) {
//
//        final String[] hanzi = { "零", "壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖", "拾" };
//        Scanner sc = new Scanner(System.in);
//        while (sc.hasNext()) {
//            double money = sc.nextDouble();
//            StringBuffer buffer=new StringBuffer();
//            int yi = (int) (money / 100000000);
//            int wan = (int) ((money - yi * 100000000) / 10000);
//            int ge = (int) (money - yi * 100000000 - wan * 10000);
//
//            System.out.print("人民币");
//            if (yi != 0) {
//                buffer.append(change(yi)+"亿");
//            }
//            if (wan != 0) {
//                buffer.append(change(wan)+"万");
//            }
//            if (ge!=0) {
//                buffer.append(change(ge)+"元");
//
//            }
//
//            int xiaoshu=(int) ((money - yi * 100000000 - wan * 10000-ge+0.001)*100);
//            int jiao=xiaoshu/10;
//            int fen=xiaoshu%10;
//            if (jiao!=0&&fen!=0) {
//                buffer.append(hanzi[jiao]+"角"+hanzi[fen]+"分");
//            }else if(jiao!=0&&fen==0){
//                buffer.append(hanzi[jiao]+"角");
//
//            }else if (jiao==0&&fen!=0) {
//                buffer.append(hanzi[fen]+"分");
//
//            }else if (jiao==0&&fen==0) {
//                buffer.append("整");
//            }
//            String string=buffer.toString();
//            System.out.println(string);
//        }
//        sc.close();
//    }
//
//    /**
//     * 4位的汉语转换
//     *
//     * @param a
//     */
//    public static String change(int a) {
//
//        final String[] hanzi = { "零", "壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖", "拾" };
//        int qian = a / 1000;
//        int bai = (a - qian * 1000) / 100;
//        int shi = (a - qian * 1000 - bai * 100) / 10;
//        int ge = a - qian * 1000 - bai * 100 - shi * 10;
//        StringBuffer br = new StringBuffer();
//        if (qian != 0) {
//            br.append(hanzi[qian] + "仟");
//        }
//        if (bai != 0) {
//            br.append(hanzi[bai] + "佰");
//        } else if (qian != 0 && bai == 0 && (shi != 0 || ge != 0)) {
//            br.append("零");
//        }
//
//        if (shi != 0&&shi!=1) {
//            br.append(hanzi[shi] + "拾");
//        } else if (bai != 0 && ge != 0&&shi==0) {
//            br.append("零");
//        }
//        if(shi==1&&(qian!=0||bai!=0)){
//            br.append(hanzi[shi]+"拾");
//
//        }
//
//        if(shi==1&&qian==0&&bai==0){
//            br.append("拾");
//        }
//
//        if (ge != 0) {
//            br.append(hanzi[ge]);
//        }
//        String s=br.toString();
//        return s;
//
//    }

    //表示数字
//    public static void main(String[] args){
//        Scanner in = new Scanner(System.in);
//        while (in.hasNext()){
//            String str = in.nextLine();
//            System.out.println(markNum(str));
//        }
//    }
//    public static String markNum(String s){
//        StringBuilder sb = new StringBuilder();
//        if(s.length() == 1){
//            if(Character.isDigit(s.charAt(0))){
//                sb.append("*"+s+"*");
//            }else {
//                sb.append(s);
//            }
//            return sb.toString();
//        }
//        if(Character.isDigit(s.charAt(0))){
//            sb.append("*");
//        }
//        sb.append(s.charAt(0));
//        if(Character.isDigit(s.charAt(0))&&!Character.isDigit(s.charAt(1))){
//            sb.append("*");
//        }
//        for(int i=1;i<s.length()-1;i++){
//            char c = s.charAt(i);
//            if(Character.isDigit(c)){
//                if(!Character.isDigit(s.charAt(i-1))){
//                    sb.append("*");
//                }
//                sb.append(c);
//
//                if(!Character.isDigit(s.charAt(i+1))){
//                    sb.append("*");
//                }
//
//            }else {
//                sb.append(c);
//            }
//        }
//
//        int index = s.length()-1;
//        char tail = s.charAt(index);
//        if(Character.isDigit(tail)){
//            if(!Character.isDigit(s.charAt(index-1))){
//                sb.append("*");
//            }
//            sb.append(tail);
//            sb.append("*");
//        }else {
//            sb.append(tail);
//        }
//        return sb.toString();
//    }

//    public static void main(String[] args){
//        Scanner in = new Scanner(System.in);
//        while (in.hasNext()){
//            String str = in.nextLine();
//            System.out.println(markNums2(str));
//        }
//    }
//    public static String markNums2(String pInStr) {
//        char[] arr = pInStr.toCharArray();
//        StringBuffer sb = new StringBuffer();
//        for (int i = 0; i < arr.length; i++) {
//            if ((arr[i] - '0' >= 0) && (arr[i] - '0' <= 9)) { // 判断为数字
//                sb.append("*" + arr[i] + "*");  //两边都加上*
//            } else
//                sb.append(arr[i]);
//        }
//        return sb.toString().replace("**", "");  //两个数字中间有** 替换掉
//    }

    //自守数
//    public static void main(String[] args){
//        Scanner in = new Scanner(System.in);
//        while (in.hasNext()){
//            int n = in.nextInt();
//            System.out.println(CalcAutomorphicNumbers(n));
//        }
//    }
//
//    private static int CalcAutomorphicNumbers(int n){
//        int cnt = 0;
//        for(int i=0;i<n;i++){
//            if(isAutomorphicNum(i)){
//                cnt++;
//            }
//        }
//        return cnt;
//    }
//
//    private static boolean isAutomorphicNum(int n){
//        long m = n*n;
//        int a = n;
//        long k = 1;
//        while (n!=0){
//            n=n/10;
//            k*=10;
//        }
//        if(m%k == a){
//            return true;
//        }else {
//            return false;
//        }
//
//    }

    //等差数列
//    sn = (a1+an)*n/2
//    an = a0+(n-1)*d;
//    public static void main(String[] args){
//        Scanner in = new Scanner(System.in);
//        while (in.hasNext()){
//            int n = in.nextInt();
//            int sn = (3*n+1)*n/2;
//            System.out.println(sn);
//        }
//    }

    //输入整型数组和排序标识，对其元素按照升序或降序进行排序
    //快排
//    public static void main(String[] args){
//        Scanner in = new Scanner(System.in);
//        while (in.hasNext()){
//            int n = in.nextInt();
//            Integer[] arr = new Integer[n];
//            int k = 0;
//            for(int i=0;i<n;i++){
//                arr[k++] = in.nextInt();
//            }
//            int flag = in.nextInt();
//
//            sort1(arr,flag);
//            for(int i=0;i<arr.length;i++){
//                if(i == arr.length-1){
//                    System.out.println(arr[i]);
//                }else {
//                    System.out.print(arr[i]+" ");
//                }
//            }
//
//        }
//    }
//
//    private static void sort1(Integer[] arr ,int flag){
//        if (flag == 0){
//            Arrays.sort(arr);
//        }else {
//            Arrays.sort(arr, new Comparator<Integer>() {
//                @Override
//                public int compare(Integer o1, Integer o2) {
//                    return o2.intValue()-o1.intValue();
//                }
//            });
//        }
//    }

//    public static void main(String[] args){
//        Scanner in = new Scanner(System.in);
//        while (in.hasNext()){
//            int n = in.nextInt();
//            int[] arr = new int[n];
//            int k = 0;
//            for(int i=0;i<n;i++){
//                arr[k++] = in.nextInt();
//            }
//            int flag = in.nextInt();
//            sort2(arr,flag);
//            for(int i=0;i<arr.length;i++){
//                if(i == arr.length-1){
//                    System.out.println(arr[i]);
//                }else {
//                    System.out.print(arr[i]+" ");
//                }
//            }
//
//        }
//    }
//
//    private static void sort2(int[] arr ,int flag){
//       for (int i=0;i<arr.length;i++){
//           boolean isSwap = false;
//           for(int j=0;j<arr.length-1-i;j++){
//               if(compare(arr[j],arr[j+1],flag)){
//                   int tmp = arr[j];
//                   arr[j]=arr[j+1];
//                   arr[j+1]=tmp;
//                   isSwap = true;
//               }
//           }
//           if(!isSwap){
//               return;
//           }
//       }
//    }
//
//    /**
//     * 快排
//     * @param arr
//     * @param flag
//     */
//
//    //升序
//    private static void quickSort1(int[] arr,int left,int right){
//        if(left<right){
//            int result = partition1(arr,left,right);
//            quickSort1(arr,left,result-1);
//            quickSort1(arr,result+1,right);
//        }
//    }
//
//    private static int partition1(int[] arr,int left,int right){
//        int key = arr[left];
//        while (left<right){
//            while (left<right && arr[right]>key){
//                right--;
//            }
//            arr[left]=arr[right];
//            while (left<right && arr[left]<=key){
//                left++;
//            }
//            arr[right] = arr[left];
//        }
//        arr[left] = key;
//        return left;
//    }
//
//
//
//
//    /**
//     *
//     * @param a
//     * @param b
//     * @param flag
//     * @return
//     */
//    private static boolean compare(int a,int b,int flag){
//        if(flag == 0){
//            return a-b>0;
//        }else {
//            return b-a>0;
//        }
//    }




    //堆排
//   public static void swap(int[] arr,int a,int b){
//       int tmp = arr[a];
//       arr[a] = arr[b];
//       arr[b] = tmp;
//   }
//
//   //从上而下 堆化
//
//    /**
//     *
//     * @param arr
//     * @param count 数组长度
//     * @param i 开始调整的节点
//     */
//    public static void heapfily(int[] arr,int count,int i){
//       while (true){
//           int maxPos = i;
//           if(2*i+1<count && arr[i]<arr[2*i+1]) maxPos = 2*i+1;
//           if(2*i+2<count && arr[maxPos]<arr[2*i+2])maxPos=2*i+2;
//           if(maxPos == i)break;
//           swap(arr,i,maxPos);
//           i=maxPos;
//       }
//    }
//
//    //建堆
//    public static void buildHeap(int[] arr,int length){
//        int index = (length-1-1)/2;//最后一个非叶子节点
//        for (int i=index;i>=0;i--){
//            heapfily(arr,length,i);
//        }
//    }
//
//    //堆排
//    public static void heapSort(int[] arr,int length){
//        buildHeap(arr,length);
//        for(int j=length-1;j>0;j--){
//            swap(arr,0,j);
//            heapfily(arr,j,0);
//        }
//    }

//Redraiment的走法 最长递增子序列问题
    // 转化成求最长递增子序列
//   public static void main(String[] args){
//       Scanner in = new Scanner(System.in);
//       while (in.hasNext()){
//           int n = in.nextInt();
//           int[] arr = new int[n];
//           for(int i=0;i<n;i++){
//               arr[i] = in.nextInt();
//           }
//           System.out.println(getMaxStr(arr,n));
//       }
//   }
//
//   public static int getMaxStr(int[] arr,int len){
//       int[] dp = new int[len];
//       for(int i=0;i<len;i++){
//           dp[i]=1;
//           for(int j=0;j<i;j++){
//               if(arr[j]<arr[i]){
//                   dp[i]=Math.max(dp[i],dp[j]+1);
//               }
//           }
//       }
//       int max = 0;
//       for(int i=0;i<dp.length;i++){
//           if(dp[i]>max){
//               max = dp[i];
//           }
//       }
//       return max;
//   }

//1.数字三角形。2.最大连续子序列和问题。3.最长递增子序列问题。4.背包问题
    //素数伴侣
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        while (sc.hasNext()) {
//            String str = sc.nextLine();
//            int N = Integer.parseInt(str);
//            long[] nums = new long[N];
//            String[] str1 = sc.nextLine().split(" ");
//            for (int i = 0; i < N; i++) {
//                nums[i] = Integer.parseInt(str1[i]);
//            }
//            // 偶数部分
//            ArrayList<Long> evens = new ArrayList<Long>();
//            // 奇数部分
//            ArrayList<Long> odds = new ArrayList<Long>();
//            for (int i = 0; i < N; i++) {
//                if (nums[i] % 2 == 0) { // 偶数
//                    evens.add(nums[i]);
//                } else { // 奇数
//                    odds.add(nums[i]);
//                }
//            }
//            long[] evensMatch = new long[evens.size()];
//            int result = 0;
//            for (int i = 0; i < odds.size(); i++) {
//                int[] used = new int[evens.size()];
//                if (find(odds.get(i), evens, used, evensMatch)) {
//                    result++;
//                }
//            }
//            System.out.println(result);
//
//        }
//        sc.close();
//    }
//
//    private static boolean isPrime(long num) {
//        for (int i = 2; i < Math.sqrt(num); i++) {
//            if (num % i == 0) {
//                return false;
//            }
//            if (num == 1) {
//                return false;
//            }
//        }
//        return true;
//    }
//
//    public static boolean find(long x, ArrayList<Long> evens, int[] used, long[] evensMatch) {
//        int j;
//        for (j = 0; j < evens.size(); j++) {
//            if (isPrime(x + evens.get(j)) && used[j] == 0) {
//                used[j] = 1;
//                if (evensMatch[j] == 0 || find(evensMatch[j], evens, used, evensMatch)) {
//                    evensMatch[j] = x;
//                    return true;
//                }
//            }
//        }
//        return false;
//    }

    //输入一行字符,分别统计出包含英文字母，空格，数字和其他字符的个数
//    public static void main(String[] args){
//        Scanner in = new Scanner(System.in);
//        while (in.hasNext()){
//            String str = in.nextLine();
//            int yinwen = 0;
//            int kongge = 0;
//            int shuzi = 0;
//            int qita = 0;
//            for(int i=0;i<str.length();i++){
//                if(Character.isLetter(str.charAt(i))){
//                    yinwen++;
//                }else if(str.charAt(i)== ' '){
//                    kongge++;
//                }else if(Character.isDigit(str.charAt(i))){
//                    shuzi++;
//                }else {
//                    qita++;
//                }
//            }
//            System.out.println(yinwen);
//            System.out.println(kongge);
//            System.out.println(shuzi);
//            System.out.println(qita);
//
//        }
//    }

    //判断两个ip是否处于同一个子网
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        while(sc.hasNext()){
//            String mask = sc.next();
//            String ip1 = sc.next();
//            String ip2 = sc.next();
//            System.out.println(checkNetSegment(mask, ip1, ip2));
//        }
//        sc.close();
//    }
//
//    private static int checkNetSegment(String mask, String ip1, String ip2){
//        int[] m = parse(mask);
//        int[] i1 = parse(ip1);
//        int[] i2 = parse(ip2);
//        if(!isLegal(i1) || !isLegal(i2) || !checkMask(mask)) return 1;//判断是否合法
//        for(int i = 0; i < 4; i++){
//            if((m[i] & i1[i]) != (m[i] & i2[i])) return 2;//判断是否同属于一个子网
//        }
//        return 0;
//    }
//
//    //将字符串转换成int数组
//    private static int[] parse(String s){
//        String[] str = s.split("\\.");
//        int[] address = new int[str.length];
//        for(int i = 0; i < str.length; i++){
//            address[i] = Integer.parseInt(str[i]);
//        }
//        return address;
//    }
//
//    //判断ip是否合法
//    private static boolean isLegal(int[] arr){
//        if(arr.length != 4) return false;
//        for(int i = 0; i < 4; i++)
//            if(arr[i] < 0 || arr[i] > 255) return false;
//        return true;
//    }
//
//    //判断掩码是否合法
//    private static boolean checkMask(String m){
//        String[] mask = m.split("\\.");
//        StringBuffer sb = new StringBuffer();
//        for(int i = 0; i < mask.length; i++){
//            String b = Integer.toBinaryString(Integer.parseInt(mask[i]));
//            while(b.length() != 8) b = "0" + b;
//            sb.append(b);
//        }
//        int firstIndex = sb.indexOf("0");
//        int lastIndex = sb.lastIndexOf("1");
//        if(firstIndex < lastIndex) return false;
//        return true;
//    }

    //火车进站
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        while(in.hasNext()){
//            int n = in.nextInt();
//            int[] A = new int[n];
//            for(int i=0;i<n;i++){
//                A[i] = in.nextInt();
//            }
//            int start = 0;
//            ArrayList<int[]> result = new ArrayList<int[]>();
//
//            Permutation(A,start,n,result);
//            Set<String> sortResult = new TreeSet<String>();
//
//            for(int[] out:result){
//                if(isLegal(A,out,n)){
//                    StringBuilder sb = new StringBuilder();
//                    for(int i=0;i<n-1;i++){
//                        sb.append(out[i]+" ");
//                    }
//                    sb.append(out[n-1]);
//                    sortResult.add(sb.toString());
////                  System.out.println(sb.toString());
//                }
//            }
//            for(String list:sortResult){
//                System.out.println(list);
//            }
//        }
//        in.close();
//
//    }
//    private static boolean isLegal(int[] in,int[] out,int n){
//        LinkedList<Integer> stack = new LinkedList<Integer>();
//        int i=0;
//        int j=0;
//        while(i<n){ // in 还有元素的时候都需要判断
//            if(in[i] == out[j]){ //  相等时候就不用入栈，直接后移
//                i++;
//                j++;
//            }else{
//                if(stack.isEmpty()){ //空stack 就只有入栈了
//                    stack.push(in[i]);
//                    i++;
//                }else{
//                    int top = stack.peek(); // 栈顶元素相等，进行出栈
//                    if(top ==out[j]){
//                        j++;
//                        stack.pop();
//                    }else if(i<n){ //  不等时候入栈
//                        stack.push(in[i]);
//                        i++;
//                    }
//                }
//            }
//        }
//        while(!stack.isEmpty() && j<n){ // in 的结束后，栈中元素进程出栈序列应该和out剩余的元素 相同
//            int top = stack.pop();
//            if(top == out[j]){
//                j++;
//            }else{
//                return false;
//            }
//        }
//        return true;
//
//    }
//    /**
//     * 求出所有排列
//     * @param A
//     * @param start
//     * @param n
//     * @param result
//     */
//    private static void Permutation(int[] A,int start,int n,ArrayList<int[]> result){
//        if(start == n){
//            return;
//        }
//        if(start == n-1){
//            int[] B = A.clone();
//            result.add(B);
//            return;
//        }
//        for(int i=start;i<n;i++){
//            swap(A,start,i);
//            Permutation(A,start+1,n,result);
//            swap(A,start,i);
//        }
//
//    }
//    private static void swap(int[] A,int i,int j){
//        int t = A[i];
//        A[i] = A[j];
//        A[j] = t;
//    }

    //明明的随机数
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        while(sc.hasNext()){
//
//            TreeSet<Integer> set=new TreeSet<Integer>();
//            int n=sc.nextInt();
//            if(n>0){
//                for(int i=0;i<n;i++){
//                    set.add(sc.nextInt());
//                }
//            }
//            for(Integer i:set){
//                System.out.println(i);
//            }
//        }
//    }
}
