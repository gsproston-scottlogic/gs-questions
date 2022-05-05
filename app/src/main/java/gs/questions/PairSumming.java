package gs.questions;

/*
Write a function that counts how many pairs of numbers in an array add up to a given number. 
Additional question was how to do this more efficiently.
*/

public class PairSumming {
    public static int getNumSummingPairs(final int[] numbers, final int sum) {
        int totalPairs = 0;
        // loop over the numbers
        for (int i = 0; i < numbers.length - 1; ++i) {
            // loop over the numbers after this number
            for (int j = i + 1; j < numbers.length; ++j) {
                // see if they add up to the target sum
                if (numbers[i] + numbers[j] == sum) {
                    // increment the total pairs
                    ++totalPairs;
                }
            }
        }
        return totalPairs;
    }
}
