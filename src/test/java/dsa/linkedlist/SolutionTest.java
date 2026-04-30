package dsa.linkedlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SolutionTest {

    private final Solution sut = new Solution();

    @Test
    void reverseIterative_basic() {
        ListNode reversed = sut.reverseIterative(ListNode.of(1, 2, 3, 4, 5));
        assertArrayEquals(new int[]{5, 4, 3, 2, 1}, ListNode.toArray(reversed));
    }

    @Test
    void reverseIterative_empty() {
        assertNull(sut.reverseIterative(null));
    }

    @Test
    void reverseIterative_single() {
        ListNode reversed = sut.reverseIterative(ListNode.of(7));
        assertArrayEquals(new int[]{7}, ListNode.toArray(reversed));
    }

    @Test
    void reverseRecursive_basic() {
        ListNode reversed = sut.reverseRecursive(ListNode.of(1, 2, 3));
        assertArrayEquals(new int[]{3, 2, 1}, ListNode.toArray(reversed));
    }

    @Test
    void reverseRecursive_empty() {
        assertNull(sut.reverseRecursive(null));
    }

    @Test
    void hasCycle_noCycle() {
        assertFalse(sut.hasCycle(ListNode.of(1, 2, 3, 4)));
    }

    @Test
    void hasCycle_emptyList() {
        assertFalse(sut.hasCycle(null));
    }

    @Test
    void hasCycle_withCycle() {
        ListNode head = ListNode.of(1, 2, 3, 4, 5);
        ListNode tail = head;
        while (tail.next != null) tail = tail.next;
        tail.next = head.next.next; // 5 -> 3, creating a cycle
        assertTrue(sut.hasCycle(head));
    }

    @Test
    void hasCycle_selfLoop() {
        ListNode head = new ListNode(1);
        head.next = head;
        assertTrue(sut.hasCycle(head));
    }
}
