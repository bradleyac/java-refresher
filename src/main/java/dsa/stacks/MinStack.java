package dsa.stacks;

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

    public MinStack() {
        // TODO: initialize internal data structures
    }

    public void push(int val) {
        throw new UnsupportedOperationException("TODO");
    }

    public void pop() {
        throw new UnsupportedOperationException("TODO");
    }

    public int top() {
        throw new UnsupportedOperationException("TODO");
    }

    public int getMin() {
        throw new UnsupportedOperationException("TODO");
    }
}
