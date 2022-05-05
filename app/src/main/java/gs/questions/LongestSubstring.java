package gs.questions;

import java.util.Arrays;

/*
Write a function that takes a string and returns 
    the longest substring in that string made up of 
    the same character and the index the substring starts on, 
e.g. given the string “aabbbccddddaaa” the substring is “dddd” starting at index 7.
*/

public class LongestSubstring {
    public static String getLongestSubstring(final String input) {
        // null and empty check
        if (input == null || input.isEmpty()) {
            return "";
        }

        char longestChar = input.charAt(0);
        char currentChar = input.charAt(0);
        int longestCount = 1;
        int currentCount = 1;
        int longestIndex = 0;
        int currentIndex = 0;
        // look at each character in the string
        // start at index 1
        for (int i = 1; i < input.length(); ++i) {
            final char c = input.charAt(i);
            if (c == currentChar) {
                // increase count
                ++currentCount;
                if (currentCount > longestCount) {
                    longestChar = c;
                    longestCount = currentCount;
                    longestIndex = currentIndex;
                }
            } else {
                // different character
                // reset variables
                currentChar = c;
                currentCount = 1;
                currentIndex = i;
            }
        }

        final char[] array = new char[longestCount];
        Arrays.fill(array, longestChar);
        return new String(array) + " " + Integer.toString(longestIndex);
    }
}
