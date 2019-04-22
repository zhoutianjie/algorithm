public class StrMatch {

    private static final int SIZE = 256;
    private void generateBC(char[] b,int m,int[] bc){
        for (int i=0;i<SIZE;++i){
            bc[i] = -1;//初始化
        }
        for(int i=0;i<m;++i){
            int ascii = (int)b[i]; //计算b[i]的ASCII值 相当于一个散列表 根据字符来查找在模式串中的位置。坏字符的位置比如aaaabbcc 最终去bc[c] 拿到的肯定是靠右，考最后的字符所在模式串的位置
            bc[ascii] = i;
        }
    }

    public int bm(char[] a,int n,char[] b,int m){
        int[] bc=new int[SIZE];//记录模式串中每个字符最后出现的例子
        generateBC(b,m,bc);//构建坏字符hash表
        int i= 0;//i 表示主串与模式串对其的第一个字符
        while (i<=n-m){
            int j;
            for (j = m-1;j>=0;j--){//模式串从后往前匹配
                if(a[i+j]!=b[j])break;//坏字符对应模式串中的下标是j
            }
            if(j<0){
                return i;
            }

            i=i+(j-bc[(int)a[i+j]]);
        }
        return -1;
    }
}
