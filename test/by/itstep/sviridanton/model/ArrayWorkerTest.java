package by.itstep.sviridanton.model;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayWorkerTest {

    @Test
    public void testMaxPositive() {
        int[] array = {1, 4, 7, 5, 3};
        int expected = 7;

        int actual = ArrayWorker.max(array);

        assertEquals(expected, actual);
    }

    @Test(expected = RuntimeException.class)
    public void testMaxEmptyObject() {
        int[] array = {};
        ArrayWorker.max(array);
    }

    @Test(expected = RuntimeException.class)
    public void testMaxWithNull() {
        ArrayWorker.max(null);
    }
}
