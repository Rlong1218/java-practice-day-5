// Given a number n, create and return a new int array of length n, containing the numbers 0, 1, 2, ... n-1.
// The given n may be 0, in which case just return a length 0 array.

public class FizzArray {
    public static int[] fizzArray(int n) {
        int[] fizzed = new int[n];
        for (int i = 0; i < n; i++) {
            fizzed[i] = i;
        }
        return fizzed;
    }
}
