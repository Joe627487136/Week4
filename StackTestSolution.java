package Week4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by zhouxuexuan on 13/2/17.
 */

public class StackTestSolution {
    private Stack<Integer> stack;
    boolean result = false;

    // setUp method using @Before syntax
    // @Before methods are run before each test
    @Before
    public void runBeforeEachTest() {
        System.out.println("setting up");
        stack = new Stack<Integer>();
        result = stack.repOK();
    }

    // tear-down method using @After
    // @After methods are run after each test
    @After
    public void runAfterEachTest() {
        stack = null;
        System.out.println("setting down");
    }

    @Test
    public void testRepOk() {
        result = stack.repOK();
        assertEquals(true, result);
    }

    @Test
    public void testRepOKpush() {
        result = stack.repOK();
        stack.push(new Integer(1));
        result = stack.repOK();
        assertEquals(true, result);
    }

    @Test
    public void testRepOKpop() {
        result = stack.repOK();
        stack.pop();
        result = stack.repOK();
        assertEquals(true, result);
    }
}
