import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Sum13Test {

    @Test
    void sum13() {
        assertEquals(10, Sum13.sum13(new int[] {1, 4, 13, 20, 5}));
        assertEquals(5, Sum13.sum13(new int[] {1, 4, 13}));
        assertEquals(0, Sum13.sum13(new int[] {13, 3}));
        assertEquals(10, Sum13.sum13(new int[] {1, 3, 6}));
    }
}