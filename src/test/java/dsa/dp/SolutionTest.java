package dsa.dp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    private final Solution sut = new Solution();

    @Test
    void coinChange_basic() {
        assertEquals(3, sut.coinChange(new int[]{1, 2, 5}, 11));
    }

    @Test
    void coinChange_impossible() {
        assertEquals(-1, sut.coinChange(new int[]{2}, 3));
    }

    @Test
    void coinChange_zeroAmount() {
        assertEquals(0, sut.coinChange(new int[]{1}, 0));
    }

    @Test
    void coinChange_singleCoinExactMultiple() {
        assertEquals(20, sut.coinChange(new int[]{5}, 100));
    }

    @Test
    void lcs_basic() {
        assertEquals(3, sut.longestCommonSubsequence("abcde", "ace"));
    }

    @Test
    void lcs_identical() {
        assertEquals(3, sut.longestCommonSubsequence("abc", "abc"));
    }

    @Test
    void lcs_disjoint() {
        assertEquals(0, sut.longestCommonSubsequence("abc", "def"));
    }

    @Test
    void lcs_emptyString() {
        assertEquals(0, sut.longestCommonSubsequence("", "abc"));
    }
}
