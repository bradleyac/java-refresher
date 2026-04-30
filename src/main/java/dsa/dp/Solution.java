package dsa.dp;

/**
 * Challenge 8: Coin Change + Longest Common Subsequence.
 *
 * <p>Patterns: 1D and 2D dynamic programming.
 *
 * <p>Java focus:
 * <ul>
 *   <li>{@code int[][] dp = new int[m + 1][n + 1]} — primitive arrays default to 0, no need to fill.</li>
 *   <li>{@code Arrays.fill(dp, Integer.MAX_VALUE)} for unreachable states; watch for overflow when adding.</li>
 *   <li>{@code Math.min} / {@code Math.max} (lowercase, unlike C# {@code Math.Min}).</li>
 *   <li>{@code String.charAt(i)} — no indexer syntax.</li>
 * </ul>
 */
public class Solution {

    /**
     * Coin Change: given an array of coin denominations and a target amount, return the
     * minimum number of coins needed to make the amount, or -1 if impossible.
     * Coins may be used unlimited times.
     *
     * <p>Examples:
     * <ul>
     *   <li>coins = [1,2,5], amount = 11 -> 3 (5+5+1)</li>
     *   <li>coins = [2], amount = 3 -> -1</li>
     *   <li>coins = [1], amount = 0 -> 0</li>
     * </ul>
     *
     * <p>Target complexity: O(amount * coins.length) time, O(amount) space.
     */
    public int coinChange(int[] coins, int amount) {
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * Longest Common Subsequence: given two strings, return the length of their longest
     * common subsequence (characters need not be contiguous).
     *
     * <p>Examples:
     * <ul>
     *   <li>"abcde", "ace" -> 3 ("ace")</li>
     *   <li>"abc", "abc" -> 3</li>
     *   <li>"abc", "def" -> 0</li>
     * </ul>
     *
     * <p>Target complexity: O(m * n) time. Space can be O(min(m, n)) with rolling arrays.
     */
    public int longestCommonSubsequence(String text1, String text2) {
        throw new UnsupportedOperationException("TODO");
    }
}
