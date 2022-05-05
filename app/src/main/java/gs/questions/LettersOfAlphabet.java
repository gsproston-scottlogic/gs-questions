package gs.questions;

/*
Implement a function to determine which letters of the alphabet were missing from an input string.
*/

public class LettersOfAlphabet {
    public static String getMissingLetters(String str) {
        // string of missing letter which starts as all lowercase letters
        String missingLetters = "";
        for (char c = 'a'; c <= 'z'; ++c) {
            missingLetters = missingLetters + c;
        }
        // null check
        if (str == null)
            return missingLetters;

        // make the string lower case
        str = str.toLowerCase();
        // check each character in the string
        for (char c : str.toCharArray()) {
            // convert char to String
            String temp = "" + c;
            // remove from the list of missing letters
            missingLetters = missingLetters.replace(temp, "");
        }
        return missingLetters;
    }
}
