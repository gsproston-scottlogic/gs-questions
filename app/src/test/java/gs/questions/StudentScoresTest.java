package gs.questions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class StudentScoresTest {
    @Test
    public void studentScoresTest() {
        {
            String[][] scores = { {} };
            assertEquals(null, StudentScores.getHighestMean(scores));
        }
        {
            String[][] scores = { { "Charles", "50" }, { "Barry", "67" }, { "Charles", "80" }, { "John", "49" } };
            assertEquals(67, StudentScores.getHighestMean(scores));
        }
        {
            String[][] scores = { { "Charles", "50" }, { "Barry", "30" }, { "Charles", "80" }, { "John", "49" } };
            assertEquals(65, StudentScores.getHighestMean(scores));
        }
    }
}
