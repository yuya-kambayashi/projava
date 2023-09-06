package projava;

public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    public boolean equals(Object obj){

        if (this == null && obj == null){
            return true;
        }
        if (this == null || obj == null){
            return false;
        }
        return this.val == ((ListNode)obj).val;
    }
}