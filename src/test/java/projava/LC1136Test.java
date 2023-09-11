package projava;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LC1136Test {
    @Test
    void Case1() {

        int n = 3;
        int[][] relations = {{1,3}, {2,3}};

        var actual = new LC1136().minimumSemesters(n, relations);

        int expected = 2;

        Assertions.assertEquals(expected, actual);
    }
}
