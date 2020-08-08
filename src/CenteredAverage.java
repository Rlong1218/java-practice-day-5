// Return the "centered" average of an array of ints, which we'll say is the mean average of the values,
// except ignoring the largest and smallest values in the array.
// If there are multiple copies of the smallest value, ignore just one copy, and likewise for the largest value.
// Use int division to produce the final average. You may assume that the array is length 3 or more.

public class CenteredAverage {
    public static int centeredAverage(int[] nums) {
        int big = nums[0];
        int small = nums[0];
        int total = 0;
        for (int num : nums) {
            big = Math.max(big, num);
            small = Math.min(small, num);
            total = total + num;
        }
        return (total - big - small)/(nums.length -2);
    }
}
