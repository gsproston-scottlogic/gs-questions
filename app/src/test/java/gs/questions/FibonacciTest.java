package gs.questions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import gs.questions.questions.Fibonacci;

public class FibonacciTest {
    @Test
    public void fibonacciTest() {
        assertEquals(Fibonacci.getFibNum(0), null);
        assertEquals(Fibonacci.getFibNum(1), 1);
        assertEquals(Fibonacci.getFibNum(2), 1);
        assertEquals(Fibonacci.getFibNum(3), 2);
        assertEquals(Fibonacci.getFibNum(4), 3);
        assertEquals(Fibonacci.getFibNum(5), 5);
        assertEquals(Fibonacci.getFibNum(10), 55);
    }
}
