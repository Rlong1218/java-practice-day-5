// Return the number of even ints in the given array.

public class CountEvens {
    public static int countEvens(int[] nums) {
        int evens = 0;
        for (int num : nums) {
            if (num % 2 == 0) {
                evens++;
            }
        }
        return evens;
    }
}
