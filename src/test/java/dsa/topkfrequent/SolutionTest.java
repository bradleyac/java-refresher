package dsa.topkfrequent;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SolutionTest {

    private final Solution sut = new Solution();

    @Test
    void basic() {
        int[] result = sut.topKFrequent(new int[]{1, 1, 1, 2, 2, 3}, 2);
        Arrays.sort(result);
        assertArrayEquals(new int[]{1, 2}, result);
    }

    @Test
    void single() {
        assertArrayEquals(new int[]{1}, sut.topKFrequent(new int[]{1}, 1));
    }

    @Test
    void allDistinct() {
        int[] result = sut.topKFrequent(new int[]{4, 1, -1, 2, -1, 2, 3}, 2);
        Arrays.sort(result);
        assertArrayEquals(new int[]{-1, 2}, result);
    }

    @Test
    void kEqualsLength() {
        int[] result = sut.topKFrequent(new int[]{1, 2, 3}, 3);
        Arrays.sort(result);
        assertArrayEquals(new int[]{1, 2, 3}, result);
    }
}
