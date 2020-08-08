import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class No14Test {

    @Test
    void no14() {
        assertTrue(No14.no14(new int[] {}));
        assertTrue(No14.no14(new int[] {1, 5, 2, 1, 7}));
        assertTrue(No14.no14(new int[] {4, 2, 4, 5, 8}));
        assertFalse(No14.no14(new int[] {1, 3, 4, 1}));
    }
}