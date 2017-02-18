package Week4;

import org.junit.Before;
import org.junit.Test;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by zhouxuexuan on 18/2/17.
 */

public class BiSectionTestStatementCoverage {
    private BiSectionExample bi;

    @Before
    public void runBeforeEachTest()
    {
        bi = new BiSectionExample();
    }

    @Test
    public void test4MethodCoverage () {//cover 2,3
        assert (bi.root(0.5, 100.3, 0.1) >= 100);
    }

    @Test
    public void test4LoopCoverage1 () {//cover 2,3
        assert(bi.root(0,100,80) > 50);
    }

    @Test
    public void test4LoopCoverage2 () {//cover 1
        try{assert(bi.root(1000,100,80) > 50);
        }catch (Exception e){
            System.out.print("case 1");
        }
    }
    @Test
    public void test4LoopCoverage3 () {//cover 2,4
        System.out.format("Infinite case 4 go!");
        new Reminder(5);
        assert(bi.root(1,20,-10) > 0);
    }

    public class Reminder {
        Timer timer;

        public Reminder(int seconds) {
            timer = new Timer();
            timer.schedule(new RemindTask(), seconds*1000);
        }

        class RemindTask extends TimerTask {
            public void run() {
                System.out.format("Time's up!");
                timer.cancel(); //Terminate the timer thread
            }
        }
    }
}
