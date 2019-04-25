package sorting;

import junit.framework.TestCase;
import org.junit.Test;

import java.util.Arrays;

public class QuickSortTest extends TestCase {
    private QuickSort qs;

    @Override
    public void setUp(){
        qs = new QuickSort();
    }
    @Test
    public void testCase1()
    {
        int array[] = {101, 2, 99, 32, 19, 10};
        qs.sort(array, 0);
        int output[] = {2, 10, 19, 32, 99, 101};
        assertTrue(Arrays.equals(array, output));
    }

    @Test
    public void testCase2()
    {
        int array[] = {101, 2, 99, 32, 19, 10};
        qs.sort(array, 1);
        int output[] = {2, 10, 19, 32, 99, 101};
        assertTrue(Arrays.equals(array, output));
    }

    @Test
    public void testCase3()
    {
        int array[] = {101, 2, 99, 32, 19, 10};
        qs.sort(array, 2);
        int output[] = {2, 10, 19, 32, 99, 101};
        assertTrue(Arrays.equals(array, output));
    }
}
