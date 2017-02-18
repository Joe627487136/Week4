package Week4;

import static org.junit.Assert.*;

import org.junit.Test;

public class FindMaxTest {
    @Test
    public void testmax1() {
        FindMax findMax = new FindMax();
        int ret = findMax.max(new int[]{5,6,17,8,2});
        assertTrue(ret == 17);//passed
    }
    @Test
    public void testmax2() {
        FindMax findMax = new FindMax();
        int ret = findMax.max(new int[]{5,6,2,8,17});
        assertTrue(ret == 17);//failure
    }
    @Test
    public void testmax3() {
        FindMax findMax = new FindMax();
        int ret = findMax.max(new int[]{});
        assertTrue(ret == 17);//error
    }
}
