package dsa.stacks;

/**
 * Challenge 4 (part A): Valid Parentheses.
 *
 * <p>Pattern: Stack.
 *
 * <p>Java focus:
 * <ul>
 *   <li>Prefer {@code Deque<Character> stack = new ArrayDeque<>()} over the legacy {@code Stack} class.</li>
 *   <li>Use {@code push}, {@code pop}, {@code peek}; do NOT use {@code add}/{@code remove} on a Deque-as-stack.</li>
 *   <li>{@code ArrayDeque} does not allow null elements (good — fail fast).</li>
 * </ul>
 */
public class Solution {

    /**
     * Given a string containing only the characters '(', ')', '{', '}', '[' and ']',
     * determine if the input string is valid: open brackets close in the correct order.
     *
     * <p>Examples:
     * <ul>
     *   <li>"()[]{}" -> true</li>
     *   <li>"(]"     -> false</li>
     *   <li>"([)]"   -> false</li>
     *   <li>"{[]}"   -> true</li>
     * </ul>
     *
     * <p>Target complexity: O(n) time, O(n) space.
     */
    public boolean isValid(String s) {
        throw new UnsupportedOperationException("TODO");
    }
}
