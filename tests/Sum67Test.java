import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Sum67Test {

    @Test
    void sum67() {
        assertEquals(5, Sum67.sum67(new int[] {2, 1, 6, 3, 5, 1, 8, 7, 2}));
        assertEquals(0, Sum67.sum67(new int[] {6, 3, 1, 5, 7}));
        assertEquals(11, Sum67.sum67(new int[] {3, 1, 7}));
        assertEquals(1, Sum67.sum67(new int[] {6, 2, 4, 1, 7, 1}));
    }
}