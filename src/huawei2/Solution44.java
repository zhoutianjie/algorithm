package huawei2;

import java.util.*;

/**
 * 走迷宫
 * 1.将当前节点加入路径，设置为已走
 * 2.判断当前节点是否是出口，是出口保存路径,不是则跳转到4
 * 3.依次判断当前的上下左右四个点是否可走 ，可走则递归
 * 4.退出当前路径，设置为可走
 */
public class Solution44 {
    static class Point{
        public int x;
        public int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void getResult(int[][] maze){
        int row = maze.length;
        int col = maze[0].length;
        LinkedList<Point> tmp = new LinkedList<>();
        LinkedList<Point> best = new LinkedList<>();
        mazetrack(0,0,maze,tmp,best);
        while (!best.isEmpty()){
            Point point = best.pop();
            System.out.println("("+point.x+","+point.y+")");
        }


    }

    private static void mazetrack(int i,int j,int[][] maze,LinkedList<Point> tmp,LinkedList<Point> best){
        int row = maze.length;
        int col = maze[0].length;
        maze[i][j]=1;//设置point i,j为已走
        Point point = new Point(i,j);
        tmp.add(point);
        if(i==row-1 && j==col-1){
            //已经找到了出口
            if(best.isEmpty() || tmp.size()<best.size()){
                best.clear();
                best.addAll(tmp);
            }
            return;
        }
        if(i+1<row && maze[i+1][j]==0){
            //向下走
            mazetrack(i+1,j,maze,tmp,best);
        }
        if(i-1>=0 && maze[i-1][j]==0){
            //向上走
            mazetrack(i-1,j,maze,tmp,best);
        }
        if(j+1<col && maze[i][j+1]==0){
            //向右走
            mazetrack(i,j+1,maze,tmp,best);
        }
        if(j-1>=0 && maze[i][j-1]==0){
            //向左走
            mazetrack(i,j-1,maze,tmp,best);
        }

        maze[i][j]=0;
        tmp.removeLast();

    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int row = in.nextInt();
            int col = in.nextInt();
            int[][] maze = new int[row][col];
            for (int i=0;i<row;i++){
                for (int j=0;j<col;j++){
                    maze[i][j]=in.nextInt();
                }
            }
            getResult(maze);

        }
    }


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

}
