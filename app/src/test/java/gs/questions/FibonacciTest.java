package gs.questions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FibonacciTest {
    @Test
    public void fibonacciTest() {
        assertEquals(null, Fibonacci.getFibNum(0));
        assertEquals(1, Fibonacci.getFibNum(1));
        assertEquals(1, Fibonacci.getFibNum(2));
        assertEquals(2, Fibonacci.getFibNum(3));
        assertEquals(3, Fibonacci.getFibNum(4));
        assertEquals(5, Fibonacci.getFibNum(5));
        assertEquals(55, Fibonacci.getFibNum(10));
    }
}
