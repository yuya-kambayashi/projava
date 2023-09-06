package projava;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LC725Test {
    @Test
    void Case1() {

        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3)));
        int k = 5;

        var actual = new LC725().splitListToParts(head, k);

        ListNode[] expected = { new ListNode(1),  new ListNode(2), new ListNode(3), null, null};
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    void Case2() {

        ListNode head = new ListNode(1,
                new ListNode(2,
                        new ListNode(3,
                                new ListNode(4,
                                        new ListNode(5,
                                                new ListNode(6,
                                                        new ListNode(7,
                                                                new ListNode(8,
                                                                    new ListNode(9,
                                                                            new ListNode(10))))))))));
        int k = 3;

        var actual = new LC725().splitListToParts(head, k);

        ListNode[] expected = {
                new ListNode(1,
                        new ListNode(2,
                                new ListNode(3,
                                        new ListNode(4 )))),
                new ListNode(5,
                        new ListNode(6,
                                new ListNode(7))),
                new ListNode(8,
                        new ListNode(9,
                                new ListNode(10))),
        };
        Assertions.assertArrayEquals(expected, actual);
    }
}
