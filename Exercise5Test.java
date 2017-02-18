package Week4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by zhouxuexuan on 18/2/17.
 */

public class Exercise5Test {
    public Exercise5 exercise5;
    @Before
    public void runbefore(){
        exercise5 = new Exercise5();
    }
    @After
    public void runafter(){
        System.out.print("Finished exercise 5 test");
    }

    @Test
    public void test1exercise5() {
        int pos = exercise5.exercise5(21474*8996648);
        assertTrue(pos==-1);
    }
    @Test
    public void test2exercise5() {
        int pos = exercise5.exercise5(0);
        assertTrue(pos==0);
    }
    @Test
    public void test3exercise5() {
        int pos = exercise5.exercise5(-21474*8996648);
        assertTrue(pos==1);
    }
}
