package huawei2;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * 合并表记录
 * 数据表记录包含表索引和数值（int范围的整数）
 * ，请对表索引相同的记录进行合并
 * ，即将相同索引的数值进行求和运算
 * ，输出按照key值升序进行输出
 */
public class Solution8 {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            Map<Integer,Integer> map = new TreeMap<>();
            int N = in.nextInt();
            for(int i=0;i<N;i++){
                int key = in.nextInt();
                int value = in.nextInt();
                if(map.containsKey(key)){
                    map.put(key,map.get(key)+value);
                }else {
                    map.put(key,value);
                }
            }
            for (Integer key:map.keySet()){
                System.out.println(key+" "+map.get(key));
            }
        }
    }
}
