package gs.questions;

public class SecondLowestNumber {
    public static int getSecondLowestNumber(int[] numArr) {
        if (numArr.length < 2) {
            return 0;
        }

        // keep track of the lowest and second lowest numbers
        // initialise these to the max value
        int lowestNum = Integer.MAX_VALUE;
        int secondLowestNum = lowestNum;
        // go over each number in the array
        for (int num : numArr) {
            if (num < lowestNum) {
                // new lowest number
                // set both tracking variables
                secondLowestNum = lowestNum;
                lowestNum = num;
            } else if (num < secondLowestNum) {
                // not lowest, but new second lowest
                secondLowestNum = num;
            }
        }
        return secondLowestNum;
    }
}
