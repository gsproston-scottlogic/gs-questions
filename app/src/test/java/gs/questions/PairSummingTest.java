package gs.questions;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class PairSummingTest {
    @Test
    public void pairSummingTest() {
        {
            int[] numbers = {};
            assertEquals(0, PairSumming.getNumSummingPairs(numbers, 10));
        }
        {
            int[] numbers = { 1 };
            assertEquals(0, PairSumming.getNumSummingPairs(numbers, 10));
        }
        {
            int[] numbers = { 1, 9, 1 };
            assertEquals(2, PairSumming.getNumSummingPairs(numbers, 10));
        }
        {
            int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
            assertEquals(4, PairSumming.getNumSummingPairs(numbers, 10));
        }
        {
            int[] numbers = { 5, 5, 5, 5, 5 };
            assertEquals(10, PairSumming.getNumSummingPairs(numbers, 10));
        }
    }
}
