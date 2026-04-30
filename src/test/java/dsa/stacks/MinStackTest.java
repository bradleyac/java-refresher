package dsa.stacks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MinStackTest {

    @Test
    void pushPopMin() {
        MinStack ms = new MinStack();
        ms.push(-2);
        ms.push(0);
        ms.push(-3);
        assertEquals(-3, ms.getMin());
        ms.pop();
        assertEquals(0, ms.top());
        assertEquals(-2, ms.getMin());
    }

    @Test
    void duplicateMins() {
        MinStack ms = new MinStack();
        ms.push(2);
        ms.push(2);
        ms.push(1);
        ms.push(1);
        assertEquals(1, ms.getMin());
        ms.pop();
        assertEquals(1, ms.getMin());
        ms.pop();
        assertEquals(2, ms.getMin());
        ms.pop();
        assertEquals(2, ms.getMin());
    }

    @Test
    void singleElement() {
        MinStack ms = new MinStack();
        ms.push(42);
        assertEquals(42, ms.top());
        assertEquals(42, ms.getMin());
    }
}
