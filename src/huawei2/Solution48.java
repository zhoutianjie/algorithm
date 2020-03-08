package huawei2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 线性插值
 * 信号测量的结果包括测量编号和测量值。存在信号测量结果丢弃及测量结果重复的情况。
 *
 *
 *
 *   1.测量编号不连续的情况，认为是测量结果丢弃。对应测量结果丢弃的情况，需要进行插值操作以更准确的评估信号。
 *
 *   采用简化的一阶插值方法,由丢失的测量结果两头的测量值算出两者中间的丢失值。
 *
 *   假设第M个测量结果的测量值为A，第N个测量结果的测量值为B。则需要进行(N-M-1)个测量结果的插值处理。进行一阶线性插值估计的第N+i个测量结果的测量值为A+( (B-A)/(N-M) )*i  (注：N的编号比M大。)
 *
 *   例如：只有测量编号为4的测量结果和测量编号为7的测量结果，测量值分别为4和10
 *
 *         则需要补充测量编号为5和6的测量结果。
 *
 *          其中测量编号为5的测量值=4 + ((10-4)/(7-4))*1 = 6
 *
 *          其中测量编号为6的测量值=4 + ((10-4)/(7-4))*2 = 8
 *
 *
 *
 *       2.测量编号相同，则认为测量结果重复，需要对丢弃后来出现的测量结果。
 */
public class Solution48 {
    static class Data{
        public int key = -1;
        public int value = -1;

        @Override
        public String toString() {
            return ""+key+" "+value;
        }
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int n = in.nextInt();
            int m= in.nextInt();
            Data[] datas = new Data[n];
            for(int i=0;i<n;i++){
                datas[i] = new Data();
                datas[i].key = in.nextInt();
                datas[i].value = in.nextInt();
            }
            //去重复
            List<Data> list = new ArrayList<>();
            list.add(datas[0]);
            for(int i=1;i<datas.length;i++){
                if(datas[i].key != datas[i-1].key){
                    list.add(datas[i]);
                }
            }
            //计算插值
            List<Data> result = new ArrayList<>();
            Data M = list.get(0);
            result.add(M);
            Data N;
            for(int i=1;i<list.size();i++){
                N = list.get(i);
                int num = N.key-M.key-1;//所要计算的差值的个数
                for(int j=1;j<=num;j++){
                    Data data = new Data();
                    data.key = M.key+j;
                    data.value = M.value+(N.value-M.value)/(N.key-M.key)*j;
                    result.add(data);
                }
                result.add(N);
                M=N;
            }
            for(int i=0;i<result.size();i++){
                System.out.println(result.get(i).toString());
            }

        }
    }
}
