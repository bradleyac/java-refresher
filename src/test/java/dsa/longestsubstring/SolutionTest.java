package dsa.longestsubstring;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    private final Solution sut = new Solution();

    @Test
    void empty() {
        assertEquals(0, sut.lengthOfLongestSubstring(""));
    }

    @Test
    void single() {
        assertEquals(1, sut.lengthOfLongestSubstring("a"));
    }

    @Test
    void abcabcbb() {
        assertEquals(3, sut.lengthOfLongestSubstring("abcabcbb"));
    }

    @Test
    void allSame() {
        assertEquals(1, sut.lengthOfLongestSubstring("bbbbb"));
    }

    @Test
    void pwwkew() {
        assertEquals(3, sut.lengthOfLongestSubstring("pwwkew"));
    }

    @Test
    void withSpacesAndPunct() {
        assertEquals(8, sut.lengthOfLongestSubstring("a b c\td!?,"));
    }
}
