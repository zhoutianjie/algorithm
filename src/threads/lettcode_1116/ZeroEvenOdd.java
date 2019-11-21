package threads.lettcode_1116;

import java.util.concurrent.CountDownLatch;

/**
 * LettCode 1117
 * Serial:  1117 多线程
 * difficulty: 中等
 * Description: 奇数 偶数 0 交替打印
 */
public class ZeroEvenOdd {
    private volatile int n;
    private CountDownLatch countDownLatchZero = new CountDownLatch(0);
    private CountDownLatch countDownLatchEven = new CountDownLatch(1);
    private CountDownLatch countDownLatchOdd = new CountDownLatch(1);

    public ZeroEvenOdd(int n) {
        this.n = n;
    }

    // printNumber.accept(x) outputs "x", where x is an integer.
    public void zero(IntConsumer printNumber) throws InterruptedException {
        for (int i=0;i<n;i++){
            countDownLatchZero.await();
            printNumber.accept(0);
            countDownLatchZero = new CountDownLatch(1);
            if(i%2 ==0){
                countDownLatchOdd.countDown();
            }else {
                countDownLatchEven.countDown();
            }
        }
    }

    public void even(IntConsumer printNumber) throws InterruptedException {
        for (int i = 2;i<=n;i+=2){
            countDownLatchEven.await();
            printNumber.accept(i);
            countDownLatchEven = new CountDownLatch(1);
            countDownLatchZero.countDown();
        }
    }

    public void odd(IntConsumer printNumber) throws InterruptedException {
        for(int i=1;i<=n;i+=2){
            countDownLatchOdd.await();
            printNumber.accept(i);
            countDownLatchOdd = new CountDownLatch(1);
            countDownLatchZero.countDown();
        }
    }

}
