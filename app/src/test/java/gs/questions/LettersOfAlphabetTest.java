package gs.questions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class LettersOfAlphabetTest {
    @Test
    public void lettersOfAlphabetTest() {

        assertEquals("abcdefghijklmnopqrstuvwxyz", LettersOfAlphabet.getMissingLetters(null));
        assertEquals("", LettersOfAlphabet.getMissingLetters("abcdefghijklmnopqrstuvwxyz"));
        assertEquals("s", LettersOfAlphabet.getMissingLetters("abcdefghijklmnopqrtuvwxyz"));
        assertEquals("", LettersOfAlphabet.getMissingLetters("ABCDEFGHIJKLMNOPQRSTUVWXYZ"));
    }
}
