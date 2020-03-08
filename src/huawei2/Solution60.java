package huawei2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 找出字符串中第一个只出现一次的字符
 */
public class Solution60 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            String str = in.nextLine();
            System.out.println(getfirstLetter(str));
        }
    }

    private static String getfirstLetter(String str){
        Map<Character,Integer> map = new HashMap<>();
        for(int i=0;i<str.length();i++){
            char key = str.charAt(i);
            if(map.containsKey(key)){
                int cnt = map.get(key);
                cnt++;
                map.put(key,cnt);
            }else {
                map.put(key,1);
            }
        }

        for(int i=0;i<str.length();i++){
            char key = str.charAt(i);
            if(map.get(key)== 1){
                return ""+key;
            }
        }
        return "-1";
    }
}
