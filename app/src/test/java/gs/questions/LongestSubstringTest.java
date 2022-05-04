package gs.questions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class LongestSubstringTest {
    @Test
    public void longestSubstringTest() {
        assertEquals("", LongestSubstring.getLongestSubstring(null));
        assertEquals("", LongestSubstring.getLongestSubstring(""));
        assertEquals("ll 2", LongestSubstring.getLongestSubstring("hello"));
        assertEquals("dddd 7", LongestSubstring.getLongestSubstring("aabbbccddddaaa"));
    }
}
