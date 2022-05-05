package gs.questions;

/*
You are a Rock Collector, and you are travelling from California to New York. 
Along the way, you can pick up rocks from various cities. 
These cities are stored as elements in Int[][]. 
Figure out the path which will give you the most number of rocks between California, and New York. 
You can only travel East or North, but you can change direction as many times as you wish. 
California is the most south westerly (first element of last array) 
and New York is the most north easterly (last element of first array).

Also, the number of arrays can change, as well as the number of elements in each array. 
However, the number of elements in each of the arrays will be the same. 
So, you can have an array of 3 arrays of 5 elements, but all of the 3 arrays will have 5 elements.
*/

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
