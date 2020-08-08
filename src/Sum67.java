public class Sum67 {
    public static int sum67(int[] nums) {
        int total = 0;
        boolean sixSeven = false;
        for (int num : nums) {
            if (num != 6 && !sixSeven) {
                total = total + num;
            }
            if (num == 6) {
                sixSeven = true;
            }
            if (num == 7) {
                sixSeven = false;
            }
        }
        return total;
    }
}