package gs.questions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class RunLengthEncodingTest {
    @Test
    public void runLengthEncodingTest() {
        assertEquals("", RunLengthEncoding.getEncodedString(null));
        assertEquals("", RunLengthEncoding.getEncodedString(""));
        assertEquals("a2b3c2d4a3", RunLengthEncoding.getEncodedString("aabbbccddddaaa"));
    }
}
