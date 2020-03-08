package huawei2;

import java.util.*;

/**
 * 字符串排序
 * 编写一个程序，将输入字符串中的字符按如下规则排序。
 *
 * 规则 1 ：英文字母从 A 到 Z 排列，不区分大小写。
 *
 * 如，输入： Type 输出： epTy
 *
 * 规则 2 ：同一个英文字母的大小写同时存在时，按照输入顺序排列。
 *
 * 如，输入： BabA 输出： aABb
 *
 * 规则 3 ：非英文字母的其它字符保持原来的位置。
 *
 * 如，输入： By?e 输出： Be?y
 *
 */
public class Solution26 {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            String str = in.nextLine();
            List<Character> list = new ArrayList<>();
            for (int i=0;i<str.length();i++){
                if(Character.isLetter(str.charAt(i))){
                    list.add(str.charAt(i));
                }
            }
            Collections.sort(list, new Comparator<Character>() {
                @Override
                public int compare(Character o1, Character o2) {
                    return Character.toLowerCase(o1)-Character.toLowerCase(o2);
                }
            });
            StringBuilder sb = new StringBuilder();
            int k=0;
            for(int i=0;i<str.length();i++){
                if(Character.isLetter(str.charAt(i))&& k<list.size()){
                    sb.append(list.get(k++));
                }else {
                    sb.append(str.charAt(i));
                }
            }
            System.out.println(sb.toString());
        }
    }
}
