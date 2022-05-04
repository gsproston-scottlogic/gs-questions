package gs.questions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TravellingRockCollectorTest {
    @Test
    public void travellingRockCollectorTest() {
        {
            int[][] map = {
                    {}
            };
            assertEquals(null, TravellingRockCollector.getMostRocks(map));
        }
        {
            int[][] map = {
                    { 1 },
                    { 2, 3 }
            };
            assertEquals(null, TravellingRockCollector.getMostRocks(map));
        }
        {
            int[][] map = {
                    { 1, 0, 0, 0, 2 },
                    { 5, 0, 1, 2, 2 },
                    { 2, 3, 1, 1, 1 }
            };
            assertEquals(14, TravellingRockCollector.getMostRocks(map));
        }
    }
}
