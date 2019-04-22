import java.util.LinkedList;
import java.util.Queue;

public class Graph {
    //顶点个数
    private int  v;
    private LinkedList<Integer> adj[];

    public Graph(int v) {
        this.v = v;
        adj = new LinkedList[v];
        for (int i=0;i<v;++i){
            adj[i] = new LinkedList<>();
        }
    }

    //无向图一条边存两次
    public void addEdge(int s,int t){
        adj[s].add(t);
        adj[t].add(s);
    }

    //V 顶点个数
    //E 边的个数
    //时间复杂度O(E)
    //广度优先，就是搜索一条从s到t的路径 实际上是s到t的最短路径
    public void bfs(int s,int t){
        if(s==t)return;
        boolean[] visited = new boolean[v];
        visited[s] = true;
        Queue<Integer> queue = new LinkedList<>();
        queue.add(s);
        int[] prev = new int[v];
        for (int i=0;i<v;++i){
            prev[i] = -1;
        }
        while (queue.size()!=0){
            int w = queue.poll();
            for(int i=0;i<adj[w].size();++i){
                int q = adj[w].get(i);
                if(!visited[q]){
                    prev[w]=q;//w是q的前驱结点
                    if(q==t){
                        print(prev,s,t);
                        return;
                    }
                }
                visited[q]=true;
                queue.add(q);
            }
        }
    }

    //递归打印搜索路径
    private void print(int[] prev,int s,int t){
        if(prev[t]!=-1 && t!=s){
            print(prev,s,prev[t]);
        }
        System.out.println(t+" ");
    }


    //图的深度优先得到的不是最短路径
    boolean found = false;
    public void dfs(int s,int t){
        found = false;
        boolean[] visited = new boolean[v];
        int[] prev = new int[v];
        for(int i=0;i<v;i++){
            prev[i] = -1;
        }
        recurDfs(s,t,visited,prev);
        print(prev,s,t);
    }

    private void recurDfs(int w,int t,boolean[] visited,int[] prev){
        if(found == true)return;
        visited[w] = true;
        if(w == t){
            found = true;
            return;
        }
        for(int i = 0;i<adj[w].size();i++){
            int q = adj[w].get(i);
            if(!visited[q]){
                prev[q] = w; //无向图，所以这里应该是一样的吧
                recurDfs(q,t,visited,prev);
            }
        }
    }
}
