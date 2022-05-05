package gs.questions;

public class SumsOfConsecutiveArrayElements {
    public static int getShortestLength(final int[] arr, final int target) {
        int bestLength = 0;
        int currentSum = 0;
        int currentLength = 0;
        for (int i = 0; i < arr.length; ++i) {
            currentSum += arr[i];
            ++currentLength;
            if (currentSum > target) {
                // see how many elements we can remove from the front
                while (currentLength > 1 && currentSum - arr[i - currentLength + 1] > target) {
                    currentSum -= arr[i - currentLength + 1];
                    --currentLength;
                }
                if (currentLength < bestLength || bestLength == 0) {
                    bestLength = currentLength;
                }
            }
        }
        return bestLength;
    }
}
