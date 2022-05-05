package gs.questions;

/*
Given a string of characters return the run length encoded version. #
E.g. given the string “aabbbccddddaaa”, the return value would be “a2b3c2d4a3”.
*/

public class RunLengthEncoding {
    public static String getEncodedString(final String inputStr) {
        // null check
        if (inputStr == null || inputStr.isEmpty())
            return "";

        // make the string builder
        StringBuilder encodedString = new StringBuilder();
        // variables to track our run length
        Character runChar = null;
        int runLength = 0;
        // go over the input string
        for (char c : inputStr.toCharArray()) {
            if (runChar != null && c == runChar) {
                // same character, simply increment the run length
                ++runLength;
            } else {
                if (runChar != null) {
                    // add the encoding
                    encodedString.append(runChar);
                    encodedString.append(runLength);
                }
                runChar = c;
                runLength = 1;
            }
        }
        if (runChar != null) {
            // add the encoding
            encodedString.append(runChar);
            encodedString.append(runLength);
        }
        return encodedString.toString();
    }
}
