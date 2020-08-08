import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class More14Test {

    @Test
    void more14() {
        assertTrue(More14.more14(new int[] {1, 1, 1, 4, 4}));
        assertTrue(More14.more14(new int[] {1, 3, 5, 2}));
        assertFalse(More14.more14(new int[] {1, 4, 4}));
        assertFalse(More14.more14(new int[] {1, 4}));
        assertFalse(More14.more14(new int[] {4}));
    }
}