package gs.questions;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import gs.questions.questions.IPSearch;

class AppTest {
    @Test
    void ipSearchTest() {
        final String[] logs = {
                "10.0.0.2 – username Lorem ipsum dolor sit amet, consectetur adipiscing elit.",
                "10.0.0.2 – username Lorem ipsum dolor sit amet, consectetur adipiscing elit.",
                "10.0.0.3 – username Lorem ipsum dolor sit amet, consectetur adipiscing elit.",
                "10.0.0.1 – username Lorem ipsum dolor sit amet, consectetur adipiscing elit.",
                "10.0.0.1 – username Lorem ipsum dolor sit amet, consectetur adipiscing elit.",
                "",
                "   "
        };
        final String ip = IPSearch.MostCommonIP(logs);
        assertEquals(ip, "10.0.0.2");
    }
}
