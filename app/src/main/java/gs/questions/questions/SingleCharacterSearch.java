package gs.questions.questions;

/*
Take an input of a string and find the first character which only appears once in the string.
*/

public class SingleCharacterSearch {
    public static Character getFirstSingleChar(String str) {
        // null check
        if (str == null)
            return null;

        Character singleChar = null;
        while (!str.isEmpty()) {
            if (str.indexOf(str.substring(0, 1), 1) == -1) {
                // found the first char that only occurs once
                singleChar = str.charAt(0);
                // clear the string
                str = "";
            } else {
                // remove all of these characters from the string
                str = str.replace(str.substring(0, 1), "");
            }
        }
        return singleChar;
    }
}
