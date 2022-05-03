package gs.questions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import gs.questions.questions.SingleCharacterSearch;

public class SingleCharacterSearchTest {
    @Test
    void singleCharacterSearchTest() {
        assertEquals(SingleCharacterSearch.getFirstSingleChar(""), null);
        assertEquals(SingleCharacterSearch.getFirstSingleChar(null), null);
        assertEquals(SingleCharacterSearch.getFirstSingleChar("twotwo"), null);
        assertEquals(SingleCharacterSearch.getFirstSingleChar("twoetwo"), 'e');
        assertEquals(SingleCharacterSearch.getFirstSingleChar("tfwoetwojunk"), 'f');
    }
}
