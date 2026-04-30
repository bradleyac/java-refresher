package dsa.longestsubstring;

/**
 * Challenge 2: Longest Substring Without Repeating Characters.
 *
 * <p>Pattern: Sliding window with hash set.
 *
 * <p>Java focus:
 * <ul>
 *   <li>{@code String} is immutable — use {@code charAt(i)} or {@code toCharArray()}.</li>
 *   <li>{@code HashSet<Character>} boxes each char (vs C# {@code HashSet<char>} which doesn't).</li>
 *   <li>For ASCII you can use {@code int[] last = new int[128]} as a faster index map.</li>
 * </ul>
 */
public class Solution {

    /**
     * Given a string, find the length of the longest substring without repeating characters.
     *
     * <p>Examples:
     * <ul>
     *   <li>"abcabcbb" -> 3 ("abc")</li>
     *   <li>"bbbbb" -> 1</li>
     *   <li>"pwwkew" -> 3 ("wke")</li>
     * </ul>
     *
     * <p>Target complexity: O(n) time, O(min(n, alphabet)) space.
     */
    public int lengthOfLongestSubstring(String s) {
        throw new UnsupportedOperationException("TODO");
    }
}
