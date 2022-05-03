package gs.questions;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class IPSearchTest {
    @Test
    void ipSearchTest() {
        final String[] logs = {
                "10.0.0.2 – username Lorem ipsum dolor sit amet, consectetur adipiscing elit.",
                "10.0.0.2 – username Lorem ipsum dolor sit amet, consectetur adipiscing elit.",
                "10.0.0.3 – username Lorem ipsum dolor sit amet, consectetur adipiscing elit.",
                "10.0.0.1 – username Lorem ipsum dolor sit amet, consectetur adipiscing elit.",
                "10.0.0.1 – username Lorem ipsum dolor sit amet, consectetur adipiscing elit.",
                "Something else",
                "Something else",
                "Something else",
                "",
                "   ",
                null
        };
        final String ip = IPSearch.MostCommonIP(logs);
        assertEquals("10.0.0.2", ip);
    }
}
