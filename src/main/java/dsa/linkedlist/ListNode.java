package dsa.linkedlist;

/** Singly linked list node. Public fields kept simple to match common interview style. */
public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    /** Build a list from values; returns null for empty input. */
    public static ListNode of(int... values) {
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        for (int v : values) {
            tail.next = new ListNode(v);
            tail = tail.next;
        }
        return dummy.next;
    }

    /** Convert to int[] for easy comparison in tests. Stops at null; not cycle-safe. */
    public static int[] toArray(ListNode head) {
        int len = 0;
        for (ListNode c = head; c != null; c = c.next) len++;
        int[] out = new int[len];
        int i = 0;
        for (ListNode c = head; c != null; c = c.next) out[i++] = c.val;
        return out;
    }
}
