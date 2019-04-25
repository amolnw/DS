package searching;

import junit.framework.TestCase;
import org.junit.Test;
import seaching.BinarySearch;

public class BinarySearchTest extends TestCase {

    private BinarySearch bs;

    @Override
    protected void setUp(){
        bs = new BinarySearch();
    }

    @Override
    protected void tearDown() {

    }

    @Test
    public void testCase1()
    {
        int array[] = {1, 2, 3, 4, 5};
        assertEquals(bs.search(array, 4), 3);
    }

    @Test
    public void testCase2()
    {
        int array[] = {};
        assertEquals(bs.search(array, 4), -1);
    }

    @Test
    public void testCase3()
    {
        int array[] = {1, 1, 2, 4, 5};
        assertEquals(bs.search(array, 1), 1);
    }

    @Test
    public void testCase4()
    {
        int array[] = {1, 2, 3, 4, 5};
        assertEquals(bs.search(array, 5), 4);
    }
}

