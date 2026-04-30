package dsa.stacks;

import java.util.ArrayDeque;

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
        var stack = new ArrayDeque<Character>();

        for (char c : s.toCharArray())
        {
            switch (c) {
                case '(':
                case '{':
                case '[': stack.push(c); break;
                case ')': if (!stack.isEmpty() && stack.pop() == '(') { break; } else { return false; }
                case '}': if (!stack.isEmpty() && stack.pop() == '{') { break; } else { return false; }
                case ']': if (!stack.isEmpty() && stack.pop() == '[') { break; } else { return false; }
            }
        }

        return stack.isEmpty();
    }
}
