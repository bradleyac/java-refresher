package dsa.stacks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SolutionTest {

    private final Solution sut = new Solution();

    @Test
    void empty() {
        assertTrue(sut.isValid(""));
    }

    @Test
    void simplePairs() {
        assertTrue(sut.isValid("()[]{}"));
    }

    @Test
    void nested() {
        assertTrue(sut.isValid("{[()]}"));
    }

    @Test
    void mismatched() {
        assertFalse(sut.isValid("(]"));
    }

    @Test
    void interleaved() {
        assertFalse(sut.isValid("([)]"));
    }

    @Test
    void unclosed() {
        assertFalse(sut.isValid("((("));
    }

    @Test
    void unopened() {
        assertFalse(sut.isValid(")))"));
    }
}
