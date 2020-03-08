package huawei2;

import java.util.*;

/**
 * 数据分类处理
 * 从R依次中取出R<i>，对I进行处理，找到满足条件的I<j>：
 *
 * I<j>整数对应的数字需要连续包含R<i>对应的数字。比如R<i>为23，I<j>为231，那么I<j>包含了R<i>，条件满足 。
 *
 * 按R<i>从小到大的顺序:
 *
 * (1)先输出R<i>；
 *
 * (2)再输出满足条件的I<j>的个数；
 *
 * (3)然后输出满足条件的I<j>在I序列中的位置索引(从0开始)；
 *
 * (4)最后再输出I<j>。
 *
 * 附加条件：
 *
 * (1)R<i>需要从小到大排序。相同的R<i>只需要输出索引小的以及满足条件的I<j>，索引大的需要过滤掉
 *
 * (2)如果没有满足条件的I<j>，对应的R<i>不用输出
 *
 * (3)最后需要在输出序列的第一个整数位置记录后续整数序列的个数(不包含“个数”本身)
 */
public class Solution25 {

    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            String I = in.nextLine();
            String R = in.nextLine();
            TreeMap<String, List<String>> treeMap = new TreeMap<>(new Comparator<String>() {
                @Override
                public int compare(String o1, String o2) {
                    int len1 = o1.length();
                    int len2 = o2.length();
                    if(len1!=len2){
                        return len1-len2;
                    }else {
                        return o1.compareTo(o2);
                    }
                }
            });
            String[] Is = I.split(" ");
            String[] Rs = R.split(" ");
            for(int i=1;i<Rs.length;i++){
                int cnt = 0;
                List<String> list = new ArrayList<>();
                for(int j=1;j<Is.length;j++){
                    if(Is[j].contains(Rs[i])){
                        list.add(""+(j-1));
                        list.add(""+Is[j]);
                        cnt++;
                    }
                }
                if(cnt>0 && !treeMap.containsKey(Rs[i])){
                    list.add(0,""+cnt);
                    treeMap.put(Rs[i],list);
                }
            }

            List<String> resultList = new ArrayList<>();
            for(String key:treeMap.keySet()){
                resultList.add(key);
                resultList.addAll(treeMap.get(key));
            }

            int total = resultList.size();
            resultList.add(0,""+total);
            StringBuilder sb = new StringBuilder();
            for(int i=0;i<resultList.size();i++){
                if(i==resultList.size()-1){
                    sb.append(resultList.get(i));
                }else {
                    sb.append(resultList.get(i)+" ");
                }
            }
            System.out.println(sb.toString());
        }

    }


}
