package huawei2;

import java.util.Scanner;

/**
 * 多线程
 * 问题描述：有4个线程和1个公共的字符数组。线程1的功能就是向数组输出A，线程2的功能就是向字符输出B，线程3的功能就是向数组输出C，线程4的功能就是向数组输出D。要求按顺序向数组赋值ABCDABCDABCD，ABCD的个数由线程函数1的参数指
 */
public class Solution50 {
    public static int flag = 1;
    public static int k1 = 0;
    public static int k2 = 0;
    public static int k3 = 0;
    public static int k4 = 0;
    public static Object obj = new Object();
    public static StringBuilder result = new StringBuilder();
    public static void main(String[] args){
        Scanner in  = new Scanner(System.in);
        while (in.hasNext()){
            int cnt = in.nextInt();
            Runnable r1 = new Runnable() {
                @Override
                public void run() {
                    while (k1<cnt){
                        synchronized (obj){
                            while (flag!=1){
                                try {
                                    obj.wait();
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                            }
                            result.append('A');
                            flag = 2;
                            k1++;
                            obj.notifyAll();
                        }
                    }
                }

            };
            Runnable r2 = new Runnable() {
                @Override
                public void run() {
                    while (k2<cnt){
                        synchronized (obj){
                            while (flag!=2){
                                try {
                                    obj.wait();
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                            }
                            result.append('B');
                            flag = 3;
                            k2++;
                            obj.notifyAll();
                        }
                    }

                }
            };
            Runnable r3 = new Runnable() {
                @Override
                public void run() {
                    while (k3<cnt){
                        synchronized (obj){
                            while (flag!=3){
                                try {
                                    obj.wait();
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                            }
                            result.append('C');
                            flag = 4;
                            k3++;
                            obj.notifyAll();
                        }
                    }

                }
            };
            Runnable r4 = new Runnable() {
                @Override
                public void run() {
                    while (k4<cnt){
                        synchronized (obj){
                            while (flag!=4){
                                try {
                                    obj.wait();
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                            }
                            result.append('D');
                            if(k4 == cnt-1){
                                System.out.println(result.toString());
                            }
                            flag = 1;
                            k4++;
                            obj.notifyAll();
                        }
                    }

                }
            };

            Thread th1 = new Thread(r1);
            Thread th2 = new Thread(r2);
            Thread th3 = new Thread(r3);
            Thread th4 = new Thread(r4);
            th1.start();
            th2.start();
            th3.start();
            th4.start();
        }
    }
}
