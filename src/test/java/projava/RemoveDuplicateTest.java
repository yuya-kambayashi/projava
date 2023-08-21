package projava;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class RemoveDuplicateTest {

    @Test
    void 文字列の重複(){

        assertEquals(RemoveDuplicate.removeDuplicateString("abccbassbcc"), "abcbasbc");
    }

    @Test
    void 数値の重複(){

        assertEquals(RemoveDuplicate.removeDuplicateString("11223344"), "1234");
    }

    @Test
    void 空文字(){

        assertEquals(RemoveDuplicate.removeDuplicateString(""), "");
    }

    @Test
    void 空白(){

        assertEquals(RemoveDuplicate.removeDuplicateString(" "), " ");
    }

    @Test
    void 記号(){

        assertEquals(RemoveDuplicate.removeDuplicateString("!!@#$%%"), "!@#$%");
        assertEquals(RemoveDuplicate.removeDuplicateString("!!@@##$$%%"), "!@#$%");
    }

    @Test
    void 日本語(){

        assertEquals(RemoveDuplicate.removeDuplicateString("ああいうえお"), "あいうえお");
    }
}
