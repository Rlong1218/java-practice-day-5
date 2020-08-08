import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Sum28Test {

    @Test
    void sum28() {
        assertTrue(Sum28.sum28(new int[] {2, 2, 2, 2}));
        assertTrue(Sum28.sum28(new int[] {2, 1, 4, 2, 5, 2, 2}));
        assertFalse(Sum28.sum28(new int[] {2, 2, 2}));
        assertFalse(Sum28.sum28(new int[] {1, 5, 2 ,7}));
    }
}