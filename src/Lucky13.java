// Given an array of ints, return true if the array contains no 1's and no 3's.

public class Lucky13 {
    public static boolean lucky13(int[] nums) {
        boolean lucky = true;
        for (int num : nums) {
            if (num == 1 || num == 3) {
                lucky = false;
                break;
            }
        }
        return lucky;
    }
}
