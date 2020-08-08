public class FizzArray2 {
    public static String[] fizzArray2(int n) {
        String[] fizzed = new String[n];
        for (Integer i = 0; i < n; i++) {
            fizzed[i] = i.toString() ;
        }
        return fizzed;
    }
}
