import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Has22Test {

    @Test
    void has22() {
        assertTrue(Has22.has22(new int[] {1, 2, 2, 1, 2}));
        assertTrue(Has22.has22(new int[] {1, 2, 2}));
        assertFalse(Has22.has22(new int[] {2}));
        assertFalse(Has22.has22(new int[] {1, 2, 1, 2}));
    }
}