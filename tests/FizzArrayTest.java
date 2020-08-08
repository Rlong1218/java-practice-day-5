import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzArrayTest {

    @Test
    void fizzArray() {
        assertArrayEquals(new int[]{0, 1, 2}, FizzArray.fizzArray(3));
        assertArrayEquals(new int[]{}, FizzArray.fizzArray(0));
        assertArrayEquals(new int[]{0}, FizzArray.fizzArray(0));
        assertArrayEquals(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, FizzArray.fizzArray(10));
    }
}