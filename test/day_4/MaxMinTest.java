package day_4;

import org.junit.Test;

import static day_4.MaxMin.findMaxMin;
import static org.junit.Assert.assertEquals;

public class MaxMinTest {

    @Test
    public void testFindMaxMin() {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {6, 7, 8, 9, 10};

        int[] expected = {10, 1};
        int[] actual = findMaxMin(arr1, arr2);

        assertEquals(expected, actual);
    }

}