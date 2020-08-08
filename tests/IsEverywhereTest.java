import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IsEverywhereTest {

    @Test
    void isEverywhere() {
        assertTrue(IsEverywhere.isEverywhere(new int[] {2, 1, 5, 1, 7}, 1));
        assertTrue(IsEverywhere.isEverywhere(new int[] {3, 1, 3, 7, 3, 1, 3}, 3));
        assertTrue(IsEverywhere.isEverywhere(new int[] {3, 6, 1, 6, 9, 6}, 6));
        assertTrue(IsEverywhere.isEverywhere(new int[] {2, 4, 2, 7}, 2));
        assertFalse(IsEverywhere.isEverywhere(new int[] {1, 2, 1, 2, 5}, 1));
        assertFalse(IsEverywhere.isEverywhere(new int[] {5, 3}, 1));
    }
}