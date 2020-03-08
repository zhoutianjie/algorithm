package huawei2;

import java.util.*;

/**
 * 字符串加密
 * 有一种技巧可以对数据进行加密，它使用一个单词作为它的密匙。下面是它的工作原理：首先，选择一个单词作为密匙，如TRAILBLAZERS。如果单词中包含有重复的字母，只保留第1个，其余几个丢弃。现在，修改过的那个单词属于字母表的下面，如下所示：
 *
 * A B C D E F G H I J K L M N O P Q R S T U V W X Y Z
 *
 * T R A I L B Z E S C D F G H J K M N O P Q U V W X Y
 *
 * 上面其他用字母表中剩余的字母填充完整。在对信息进行加密时，信息中的每个字母被固定于顶上那行，并用下面那行的对应字母一一取代原文的字母(字母字符的大小写状态应该保留)。因此，使用这个密匙，Attack AT DAWN(黎明时攻击)就会被加密为Tpptad TP ITVH。
 *
 * 请实现下述接口，通过指定的密匙和明文得到密文。
 *
 * 详细描述：
 *
 * 接口说明
 *
 * 原型：
 *
 * voidencrypt(char * key,char * data,char * encrypt);
 *
 * 输入参数：
 *
 * char * key：密匙
 *
 * char * data：明文
 *
 * 输出参数：
 *
 * char * encrypt：密文
 *
 * 返回值：
 *
 * void
 */
public class Solution37 {
    private static String getpassword(String data,String key){
        String str1 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String mKey = key.toUpperCase();
        StringBuilder sb = new StringBuilder();
        Set<Character> set = new HashSet<>();
        for(int i=0;i<mKey.length();i++){
            if(!set.contains(mKey.charAt(i))){
                set.add(mKey.charAt(i));
                sb.append(mKey.charAt(i));
            }
        }
        for(int i=0;i<str1.length();i++){
            if(!set.contains(str1.charAt(i))){
                set.add(str1.charAt(i));
                sb.append(str1.charAt(i));
            }
        }

        Map<Character,Character> map = new HashMap();
        for(int i=0;i<sb.length();i++){
            map.put(str1.charAt(i),sb.charAt(i));
        }

        StringBuilder result = new StringBuilder();
        for(int i=0;i<data.length();i++){
            char c = data.charAt(i);
            if(Character.isLetter(c)){
                boolean isUp = Character.isUpperCase(c);
                Character password = map.get(Character.toUpperCase(c));
                if(isUp){
                    result.append(Character.toUpperCase(password));
                }else {
                    result.append(Character.toLowerCase(password));
                }

            }else {
                result.append(c);
            }
        }
        return result.toString();

    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            String key = in.nextLine();
            String data = in.nextLine();
            System.out.println(getpassword(data,key));
        }
    }

}
