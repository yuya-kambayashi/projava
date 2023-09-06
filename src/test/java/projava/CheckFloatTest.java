package projava;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CheckFloatTest {
    @Test
    void testCheckByHand() {

        assertFalse(new CheckFloat().checkByHand(""));
        assertFalse(new CheckFloat().checkByHand("012"));
        assertFalse(new CheckFloat().checkByHand(".12"));
        assertFalse(new CheckFloat().checkByHand("12."));
        assertFalse(new CheckFloat().checkByHand("1.2.3"));
        assertFalse(new CheckFloat().checkByHand("1..3"));
        assertTrue(new CheckFloat().checkByHand("0"));
        assertTrue(new CheckFloat().checkByHand("12"));
        assertTrue(new CheckFloat().checkByHand("12.3"));
        assertTrue(new CheckFloat().checkByHand("0.3"));
        assertFalse(new CheckFloat().checkByHand("12.30"));
        assertTrue(new CheckFloat().checkByHand("12.03"));
        assertFalse(new CheckFloat().checkByHand("12.030"));
        assertFalse(new CheckFloat().checkByHand("12.300"));

        assertFalse(new CheckFloat().checkByHand("00.3"));

        assertTrue(new CheckFloat().checkByHand("-123"));
        assertFalse(new CheckFloat().checkByHand("--123"));
        assertFalse(new CheckFloat().checkByHand("-12-3"));

        assertTrue(new CheckFloat().checkByHand("-123.4"));
        assertFalse(new CheckFloat().checkByHand("--123.4"));
        assertFalse(new CheckFloat().checkByHand("-12-3.4"));

        assertFalse(new CheckFloat().checkByHand("-"));
        assertFalse(new CheckFloat().checkByHand("-012"));
        assertFalse(new CheckFloat().checkByHand("-.12"));

        assertTrue(new CheckFloat().checkByHand("-0.12"));
        assertFalse(new CheckFloat().checkByHand("-01.2"));
    }
    @Test
    void testCheckByRegex() {

        assertFalse(new CheckFloat().checkByRegex(""));
        assertFalse(new CheckFloat().checkByRegex("012"));
        assertFalse(new CheckFloat().checkByRegex(".12"));
        assertFalse(new CheckFloat().checkByRegex("12."));
        assertFalse(new CheckFloat().checkByRegex("1.2.3"));
        assertFalse(new CheckFloat().checkByRegex("1..3"));
        assertTrue(new CheckFloat().checkByRegex("0"));
        assertTrue(new CheckFloat().checkByRegex("12"));
        assertTrue(new CheckFloat().checkByRegex("12.3"));
        assertTrue(new CheckFloat().checkByRegex("0.3"));
        assertTrue(new CheckFloat().checkByRegex("12.30"));
        assertTrue(new CheckFloat().checkByRegex("12.03"));
        assertTrue(new CheckFloat().checkByRegex("12.030"));
        assertTrue(new CheckFloat().checkByRegex("12.300"));

        assertFalse(new CheckFloat().checkByRegex("00.3"));

        assertTrue(new CheckFloat().checkByRegex("-123"));
        assertFalse(new CheckFloat().checkByRegex("--123"));
        assertFalse(new CheckFloat().checkByRegex("-12-3"));

        assertTrue(new CheckFloat().checkByRegex("-123.4"));
        assertFalse(new CheckFloat().checkByRegex("--123.4"));
        assertFalse(new CheckFloat().checkByRegex("-12-3.4"));

        assertFalse(new CheckFloat().checkByRegex("-"));
        assertFalse(new CheckFloat().checkByRegex("-012"));
        assertFalse(new CheckFloat().checkByRegex("-.12"));

        assertTrue(new CheckFloat().checkByRegex("-0.12"));
        assertFalse(new CheckFloat().checkByRegex("-01.2"));
    }
}
