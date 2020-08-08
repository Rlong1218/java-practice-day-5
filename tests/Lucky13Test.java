import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Lucky13Test {

    @Test
    void lucky13() {
        assertTrue(Lucky13.lucky13(new int[] {2, 4, 6}));
        assertTrue(Lucky13.lucky13(new int[] {}));
        assertFalse(Lucky13.lucky13(new int[] {2, 1, 6}));
        assertFalse(Lucky13.lucky13(new int[] {2, 3, 6}));
        assertFalse(Lucky13.lucky13(new int[] {2, 1, 3}));
    }
}