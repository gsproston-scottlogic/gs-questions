package gs.questions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MedianOfTwoArraysTest {
    @Test
    public void medianOfTwoArraysTest() {
        {
            int[] arr1 = {};
            int[] arr2 = {};
            assertEquals(null, MedianOfTwoArrays.getMedian(arr1, arr2));
        }
        {
            int[] arr1 = { 1, 4 };
            int[] arr2 = {};
            assertEquals(2.5, MedianOfTwoArrays.getMedian(arr1, arr2));
        }
        {
            int[] arr1 = {};
            int[] arr2 = { 10 };
            assertEquals(10, MedianOfTwoArrays.getMedian(arr1, arr2));
        }
        {
            int[] arr1 = { 1, 5, 8, 10, 19 };
            int[] arr2 = { 2 };
            assertEquals(6.5, MedianOfTwoArrays.getMedian(arr1, arr2));
        }
    }
}
