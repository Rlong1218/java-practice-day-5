import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountEvensTest {

    @Test
    void countEvens() {
        assertEquals(3, CountEvens.countEvens(new int[] {5, 2, 1, 1, 7, 6, 10}));
        assertEquals(0, CountEvens.countEvens(new int[] {}));
        assertEquals(1, CountEvens.countEvens(new int[] {2}));
        assertEquals(0, CountEvens.countEvens(new int[] {3, 5, 1, 7, 19}));
    }
}