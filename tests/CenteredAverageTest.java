import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CenteredAverageTest {

    @Test
    void centeredAverage() {
        assertEquals(5, CenteredAverage.centeredAverage(new int[] {5, 6, 20, 3, 9, 0, 2}));
        assertEquals(3, CenteredAverage.centeredAverage(new int[] {10, 1, 3}));
        assertEquals(1, CenteredAverage.centeredAverage(new int[] {1, 1, 1}));
        assertEquals(8, CenteredAverage.centeredAverage(new int[] {4, 9, 100, 7}));
    }
}