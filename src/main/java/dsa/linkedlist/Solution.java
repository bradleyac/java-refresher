package dsa.linkedlist;

/**
 * Challenge 3: Reverse Linked List + Detect Cycle.
 *
 * <p>Patterns: Pointer manipulation, Floyd's tortoise and hare.
 *
 * <p>Java focus:
 * <ul>
 *   <li>Java's {@code java.util.LinkedList} is a {@code Deque} — interviews want you to roll your own node.</li>
 *   <li>No built-in null-coalescing — be explicit about null checks.</li>
 *   <li>Recursion: be aware of stack depth on long lists; iterative reverse is preferred in production.</li>
 * </ul>
 */
public class Solution {

    /**
     * Reverse a singly linked list iteratively. Return the new head.
     * 1 :: 1
     * 1 -> 2 :: 2 -> 1 .. 1 <- 2
     * 1 -> 2 -> 3 -> 4 :: 4 -> 3 -> 2 -> 1 .. 1 <- 2 </->
     * <p>Target complexity: O(n) time, O(1) space.
     */
    public ListNode reverseIterative(ListNode head) {
        if (head == null) {
            return null;
        }

        var current = head.next;
        head.next = null;
        while (current != null) {
            var next = current.next;
            current.next = head;
            head = current;
            current = next;
        }
        return head;
    }

    /**
     * Reverse a singly linked list recursively. Return the new head.
     *
     * <p>Target complexity: O(n) time, O(n) stack space.
     *
     * 1 -> 2 -> 3 :: 3 -> 2 -> 1
     * 1 // 2 -> 3
     * 1 // 2 // 3
     * 3 -> (2 -> 1)
     */
    public ListNode reverseRecursive(ListNode head) {
        if (head == null) {
            return null;
        }

        var tail = head.next;
        head.next = null;
        var newHead = reverseRecursive(tail);

        if (newHead == null)
        {
            return head;
        }

        tail.next = head;

        return newHead;
    }

    /**
     * Determine whether the linked list contains a cycle.
     *
     * <p>Use Floyd's algorithm (slow/fast pointers).
     *
     * <p>Target complexity: O(n) time, O(1) space.
     */
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null || head.next.next == null) {
            return false;
        }

        ListNode slow = head.next;
        ListNode fast = head.next.next;

        // Slow traverses 1 at a time, fast traverses 2 at a time
        // If no cycle, fast will eventually be null.
        // If a cycle exists, then fast will eventually catch slow
        while (fast != null && slow != fast) {
            slow = slow.next;
            fast = fast.next;
            if (fast == null) {
                return false;
            }
            fast = fast.next;
        }

        return fast != null;
    }
}
