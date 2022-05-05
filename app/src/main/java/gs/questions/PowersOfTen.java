package gs.questions;

/*
Given a number x, write a function to determine if this is a power of 10. 
*/

public class PowersOfTen {
    public static boolean isPowerOfTen(int num) {
        boolean isPowerOfTen = false;
        while (num >= 10) {
            if (num == 10) {
                isPowerOfTen = true;
                break;
            } else if (num % 10 != 0) {
                break;
            } else {
                num = num / 10;
            }
        }
        return isPowerOfTen;
    }
}
