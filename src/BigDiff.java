// Given an array length 1 or more of ints,
// return the difference between the largest and smallest values in the array.

public class BigDiff {
    public static int bigDiff(int[] nums) {
        int big = nums[0];
        int small = nums[0];
        for (int num : nums) {
            big = Math.max(big, num);
            small = Math.min(small, num);
        }
        return big - small;
    }

}
