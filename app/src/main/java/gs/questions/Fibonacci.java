package gs.questions;

/*
Implement a function fibonacci(int x) that returns the xth number in the fibonacci sequence. 
Must be order N time complexity and order 1 space complexity.
*/

public class Fibonacci {
    public static Integer getFibNum(int x) {
        // must be >= 1
        if (x < 1)
            return null;
        // sequence starts 1 1
        if (x < 3)
            return 1;

        int a = 1;
        int b = 1;
        // each loop stores the ith fib num in b
        for (int i = 3; i <= x; ++i) {
            // must temporarily hold the value of b
            int temp = b;
            b = a + b;
            // set a to what b used to be
            a = temp;
        }
        return b;
    }
}
