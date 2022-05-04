package gs.questions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PowersOfTenTest {
    @Test
    public void powersOfTenTest() {
        assertEquals(true, PowersOfTen.isPowerOfTen(10));
        assertEquals(true, PowersOfTen.isPowerOfTen(100));
        assertEquals(true, PowersOfTen.isPowerOfTen(1000));
        assertEquals(true, PowersOfTen.isPowerOfTen(1000000000));
        assertEquals(false, PowersOfTen.isPowerOfTen(9));
        assertEquals(false, PowersOfTen.isPowerOfTen(-1));
        assertEquals(false, PowersOfTen.isPowerOfTen(0));
        assertEquals(false, PowersOfTen.isPowerOfTen(11));
        assertEquals(false, PowersOfTen.isPowerOfTen(1000000000 + 1));
        assertEquals(false, PowersOfTen.isPowerOfTen(1000000000 - 1));
    }
}
