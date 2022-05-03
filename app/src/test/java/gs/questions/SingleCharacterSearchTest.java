package gs.questions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SingleCharacterSearchTest {
    @Test
    void singleCharacterSearchTest() {
        assertEquals(null, SingleCharacterSearch.getFirstSingleChar(""));
        assertEquals(null, SingleCharacterSearch.getFirstSingleChar(null));
        assertEquals(null, SingleCharacterSearch.getFirstSingleChar("twotwo"));
        assertEquals('e', SingleCharacterSearch.getFirstSingleChar("twoetwo"));
        assertEquals('f', SingleCharacterSearch.getFirstSingleChar("tfwoetwojunk"));
    }
}
