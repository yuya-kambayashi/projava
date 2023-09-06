package projava;

import java.util.ArrayList;
import java.util.List;

public class LC725 {
    public ListNode[] splitListToParts(ListNode head, int k) {

        ListNode cur = head;
        int N = 0;
        while (cur != null) {
            cur = cur.next;
            N++;
        }

        int width = N / k, rem = N % k;

        ListNode[] ans = new ListNode[k];
        cur = head;
        for (int i = 0; i < k; ++i) {
            ListNode h = new ListNode(0), write = h;
            for (int j = 0; j < width + (i < rem ? 1 : 0); ++j) {
                write = write.next = new ListNode(cur.val);
                if (cur != null) cur = cur.next;
            }
            ans[i] = h.next;
        }
        return ans;
    }
}
