package dsa.stacks;

import java.util.ArrayDeque;

/**
 * Challenge 4 (part B): Min Stack.
 *
 * <p>Design a stack that supports push, pop, top, and retrieving the minimum element in
 * <strong>constant time</strong>.
 *
 * <p>Target complexity: O(1) for all operations.
 *
 * <p>Java focus:
 * <ul>
 *   <li>Two stacks (values + running min) is the cleanest approach.</li>
 *   <li>Throwing on empty pop/top: use {@code java.util.NoSuchElementException} or just let
 *       the underlying {@code Deque} throw.</li>
 * </ul>
 */
public class MinStack {
    ArrayDeque<Integer> stack = new ArrayDeque<>();
    ArrayDeque<Integer> mins = new ArrayDeque<>();

    public void push(int val) {
        stack.push(val);
        mins.push(mins.isEmpty() ? val : Math.min(mins.peek(), val));
    }

    public void pop() {
        stack.pop();
        mins.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return mins.peek();
    }
}
