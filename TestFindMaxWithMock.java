package Week4;


import org.jmock.Expectations;
import org.jmock.Mockery;
import org.jmock.integration.junit4.JUnit4Mockery;
import org.junit.Test;


public class TestFindMaxWithMock {
    @Test
    public void testCalculatingMachine() {
        int[] array = {10,50,30};
        int[] finialarray = {10, 30, 50};
        Mockery context = new JUnit4Mockery();

        final Sorter sorter = context.mock(Sorter.class);

        context.checking(new Expectations() {{
            int[] array = {10,50,30};
            int[] finialarray = {10, 30, 50};
            oneOf(sorter).sort(array);
            will(returnValue(finialarray));
        }});
        FindMaxUsingSorting fms = new FindMaxUsingSorting();
        fms.findmax(array,sorter);

        context.assertIsSatisfied();
    }
}