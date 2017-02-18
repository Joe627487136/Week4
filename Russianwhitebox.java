package Week4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertTrue;

/**
 * Created by zhouxuexuan on 18/2/17.
 */

public class Russianwhitebox {
    public Russian russian;
    @Before
    public void runbefore(){
        russian = new Russian();
    }
    @After
    public void runafter(){
        System.out.print("Finished russian whitebox test");
    }
    @Test
    public void test1exercise5() {
        ArrayList testcase1 = new ArrayList();
        testcase1.add(1);
        testcase1.add(0);
        int pos = russian.multiply(10,3);
        boolean test1 = (pos==30);
        boolean test2 = (Russian.testlist.equals(testcase1));
        assertTrue(test1&&test2);
    }
}
