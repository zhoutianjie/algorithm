package huawei2;

import java.util.*;

/**
 * 查找兄弟单词
 * 在字典中加入单词
 * 查找自定单词在字典中兄弟单词的个数
 * 查找指定单词的指定序号的兄弟单词，指定序号是按字典序从小到大排序的顺序序号从1开始
 */
public class Solution27 {
    private static boolean isbrother(String word1,String word2){
        if(word1.length()!=word2.length()){
            return false;
        }
        if(word1.equals(word2)){
            return false;
        }
        char[] ch1 = word1.toCharArray();
        char[] ch2 = word2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        for(int i=0;i<word1.length();i++){
            if(ch1[i]!=ch2[i]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int N = in.nextInt();
            String[] words = new String[N];
            for(int i=0;i<N;i++){
                words[i]=in.next();
            }
            String target = in.next();
            int outIndex = in.nextInt();
            List<String> list = new ArrayList<>();
            int cnt =0;
            for (int i=0;i<N;i++){
                if(isbrother(words[i],target)){
                    list.add(words[i]);
                    cnt++;
                }
            }
            System.out.println(cnt);
            if(outIndex<=cnt){
                Collections.sort(list);
                System.out.println(list.get(outIndex-1));
            }

        }
    }
}
