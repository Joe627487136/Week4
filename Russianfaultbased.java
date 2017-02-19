package Week4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertTrue;

/**
 * Created by zhouxuexuan on 19/2/17.
 */

public class Russianfaultbased {
    public Russian russian;
    @Before
    public void runbefore(){
        russian = new Russian();
    }
    @After
    public void runafter(){
        System.out.print("Finished russian blackbox test");
    }
    @Test
    public void test1exercise5() {
        int pos = russian.multiply(10,-3);
        assertTrue(pos==-30);
    }
}

