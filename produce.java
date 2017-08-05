package Week4;

import com.sun.corba.se.spi.orbutil.threadpool.Work;

import java.util.concurrent.Semaphore;


/**
 * Created by zhouxuexuan on 20/2/17.
 */

public class produce {
    public static int N = 10;
    public static int in;
    public static Work[] buffer;
    public static Work item;
    public static void produce(Work item) {
        buffer[in] = item;
        in = (in + 1) % buffer.length;
    }
    public static void main(String[] args) {
        Semaphore mutex = new Semaphore(1);
        Semaphore empty = new Semaphore(N);
        Semaphore full = new Semaphore(0);
        try {
            empty.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            mutex.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        produce(item);
        mutex.release();
        full.release();
    }
}

