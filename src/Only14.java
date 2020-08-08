// Given an array of ints, return true if every element is a 1 or a 4.

public class Only14 {
    public static boolean only14(int[] nums) {
        boolean is14 = true;
        for (int num : nums) {
            if (num != 1 && num != 4) {
                is14 = false;
                break;
            }
        }
        return is14;
    }
}
