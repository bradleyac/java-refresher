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
     *
     * <p>Target complexity: O(n) time, O(1) space.
     */
    public ListNode reverseIterative(ListNode head) {
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * Reverse a singly linked list recursively. Return the new head.
     *
     * <p>Target complexity: O(n) time, O(n) stack space.
     */
    public ListNode reverseRecursive(ListNode head) {
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * Determine whether the linked list contains a cycle.
     *
     * <p>Use Floyd's algorithm (slow/fast pointers).
     *
     * <p>Target complexity: O(n) time, O(1) space.
     */
    public boolean hasCycle(ListNode head) {
        throw new UnsupportedOperationException("TODO");
    }
}
