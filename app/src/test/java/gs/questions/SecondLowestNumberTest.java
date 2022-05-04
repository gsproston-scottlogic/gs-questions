package gs.questions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SecondLowestNumberTest {
    @Test
    public void secondLowestNumberTest() {
        {
            int[] numArr = {};
            assertEquals(0, SecondLowestNumber.getSecondLowestNumber(numArr));
        }
        {
            int[] numArr = { 0 };
            assertEquals(0, SecondLowestNumber.getSecondLowestNumber(numArr));
        }
        {
            int[] numArr = { Integer.MAX_VALUE, 9, 8, 10, 5 };
            assertEquals(8, SecondLowestNumber.getSecondLowestNumber(numArr));
        }
        {
            int[] numArr = { 0, -10, -20, 70 };
            assertEquals(-10, SecondLowestNumber.getSecondLowestNumber(numArr));
        }
    }
}
