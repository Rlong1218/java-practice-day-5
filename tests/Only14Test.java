import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Only14Test {

    @Test
    void only14() {
        assertTrue(Only14.only14(new int[] {1, 1, 1}));
        assertTrue(Only14.only14(new int[] {4, 4, 4, 4}));
        assertTrue(Only14.only14(new int[] {1, 4, 1, 4, 4}));
        assertFalse(Only14.only14(new int[] {1, 2, 1}));
        assertFalse(Only14.only14(new int[] {3}));

    }
}