package projava;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CheckFloatTest {
    @Test
    void testCheck() {

        assertFalse(new CheckFloat().check(""));
        assertFalse(new CheckFloat().check("012"));
        assertFalse(new CheckFloat().check(".12"));
        assertFalse(new CheckFloat().check("12."));
        assertFalse(new CheckFloat().check("1.2.3"));
        assertFalse(new CheckFloat().check("1..3"));
        assertTrue(new CheckFloat().check("0"));
        assertTrue(new CheckFloat().check("12"));
        assertTrue(new CheckFloat().check("12.3"));
        assertTrue(new CheckFloat().check("0.3"));
        assertTrue(new CheckFloat().check("12.30"));

        assertFalse(new CheckFloat().check("00.3"));

    }
}
