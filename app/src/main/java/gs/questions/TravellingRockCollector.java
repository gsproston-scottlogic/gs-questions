package gs.questions;

public class TravellingRockCollector {
    private static boolean validateMap(int[][] map) {
        if (map.length < 1)
            return false;
        for (int[] arr : map) {
            if (arr.length < 1)
                return false;
        }
        // get the length of the first array
        final int arrLen = map[0].length;
        // check all arrays are the same length
        for (int[] arr : map) {
            if (arr.length != arrLen)
                return false;
        }
        // fine if we reach here
        return true;
    }

    private static int getMostRocksFromPosition(int[][] map, int x, int y) {
        // see if we're at the end
        if (x <= 0 && y >= map[x].length - 1)
            // at the end, just return the current value
            return map[x][y];
        // see if we can go north
        final int north = (x > 0) ? getMostRocksFromPosition(map, x - 1, y) : Integer.MIN_VALUE;
        // see if we can go east
        final int east = (y < map[x].length - 1) ? getMostRocksFromPosition(map, x, y + 1) : Integer.MIN_VALUE;
        // result is current value plus the max of going north or east
        return map[x][y] + Math.max(north, east);
    }

    public static Integer getMostRocks(int[][] map) {
        // check if the map is valid
        if (!validateMap(map))
            return null;
        // start at the south west corner of the map
        return getMostRocksFromPosition(map, map.length - 1, 0);
    }
}
