// Given an array of ints, return true if it contains no 1's or it contains no 4's.

public class No14 {
    public static boolean no14(int[] nums) {
        boolean no1 = true;
        boolean no4 = true;
        for (int num : nums) {
            if (num == 1) {
                no1 = false;
            }
            if (num == 4) {
                no4 = false;
            }
        }
        return !(no1 == false && no4 == false );
    }

}
