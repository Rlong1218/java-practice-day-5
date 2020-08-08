import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BigDiffTest {

    @Test
    void bigDiff() {
        assertEquals(5, BigDiff.bigDiff(new int[] {7, 9, 5, 8, 10, 9}));
        assertEquals(0, BigDiff.bigDiff(new int[] {4}));
        assertEquals(1, BigDiff.bigDiff(new int[] {10, 9}));
        assertEquals(8, BigDiff.bigDiff(new int[] {22, 30, 25}));
    }
}