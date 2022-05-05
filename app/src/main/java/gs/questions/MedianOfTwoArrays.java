package gs.questions;

/*
Given two sorted int arrays find the median element.
*/

public class MedianOfTwoArrays {
    public static Double getMedian(int[] arr1, int[] arr2) {
        // check if the arrays are empty
        if (arr1.length < 1 && arr2.length < 1)
            return null;

        // index of the median element
        final int targetIndex = (int) Math.floor((arr1.length + arr2.length) / 2);
        // keep the index for each array
        int index1 = 0;
        int index2 = 0;
        int median1 = 0;
        int median2 = 0;
        // assume arrays are sorted
        while (index1 + index2 <= targetIndex) {
            median2 = median1;
            // do range checks
            if (index1 >= arr1.length) {
                median1 = arr2[index2];
                ++index2;
            } else if (index2 >= arr2.length) {
                median1 = arr1[index1];
                ++index1;
            } else if (arr1[index1] < arr2[index2]) {
                median1 = arr1[index1];
                ++index1;
            } else {
                median1 = arr2[index2];
                ++index2;
            }
        }

        double median = median1;
        // if total number of elements is even
        // get the average between the two median elements
        if ((arr1.length + arr2.length) % 2 == 0) {
            median = median += median2;
            median /= 2;
        }
        return median;
    }
}
