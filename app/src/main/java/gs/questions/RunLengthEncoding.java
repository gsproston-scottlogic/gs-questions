package gs.questions;

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
