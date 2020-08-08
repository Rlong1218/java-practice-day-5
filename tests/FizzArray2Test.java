import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzArray2Test {

    @Test
    void fizzArray2() {
        assertArrayEquals(new String[] {"0", "1", "2"}, FizzArray2.fizzArray2(3));
        assertArrayEquals(new String[] {}, FizzArray2.fizzArray2(0));
        assertArrayEquals(new String[] {"0"}, FizzArray2.fizzArray2(1));
        assertArrayEquals(new String[] {"0", "1", "2", "3", "4", "5"}, FizzArray2.fizzArray2(6));
    }
}