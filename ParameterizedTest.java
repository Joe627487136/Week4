package Week4;

import org.junit.*;
import org.junit.internal.runners.SuiteMethod;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import static org.junit.Assert.*;
import java.util.*;

@RunWith(Parameterized.class)

public class ParameterizedTest {
	public int sum, a, b;

	public ParameterizedTest (int sum, int a, int b) {
    	this.sum = sum;
    	this.a = a;
    	this.b = b;
    }

   @Parameters public static Collection<Object[]> parameters() {
        return Arrays.asList (new Object [][] {{0, 0, 0}, {5, 1, 1}});
    }

   @Test public void additionTest()
   {
       Sum Sum = new Sum();
	   assertEquals(sum, Sum.sum(a, b));
   }


}
