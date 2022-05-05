package gs.questions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SumsOfConsecutiveArrayElementsTest {
    @Test
    public void sumsOfConsecutiveArrayElementsTest() {
        {
            int[] arr = {};
            assertEquals(0, SumsOfConsecutiveArrayElements.getShortestLength(arr, 10));
        }
        {
            int[] arr = { 10 };
            assertEquals(0, SumsOfConsecutiveArrayElements.getShortestLength(arr, 10));
        }
        {
            int[] arr = { 11 };
            assertEquals(1, SumsOfConsecutiveArrayElements.getShortestLength(arr, 10));
        }
        {
            int[] arr = { 1, 3, 6, 1, 9, 5 };
            assertEquals(2, SumsOfConsecutiveArrayElements.getShortestLength(arr, 10));
        }
        {
            int[] arr = { 9, 5, 1, 3, 6, 1, 9 };
            assertEquals(2, SumsOfConsecutiveArrayElements.getShortestLength(arr, 10));
        }
        {
            int[] arr = { 1, 3, 6, 11, 9, 5 };
            assertEquals(1, SumsOfConsecutiveArrayElements.getShortestLength(arr, 10));
        }
    }
}
