package dsa.longestsubstring;

import java.util.HashMap;
import java.util.HashSet;

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
     *   <li>"abcad" -> 4 ("bcad")</li>
     * </ul>
     *
     * <p>Target complexity: O(n) time, O(min(n, alphabet)) space.
     */
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> seen = new HashMap<Character, Integer>();
        int longest = 0;
        int currentLength = 0;

        for (int i = 0; i < s.length(); ++i) {
            char c = s.charAt(i);
            if (!seen.containsKey(c)) {
                seen.put(c, i);
                currentLength++;
            }
            else {
                currentLength = Math.min(i - seen.get(c), currentLength);
            }
            if (currentLength > longest) {
                longest = currentLength;
            }
        }

        return longest;
    }
}
