package dsa.twosum;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    private final Solution sut = new Solution();

    @Test
    void twoSum_basic() {
        int[] result = sut.twoSum(new int[]{2, 7, 11, 15}, 9);
        Arrays.sort(result);
        assertArrayEquals(new int[]{0, 1}, result);
    }

    @Test
    void twoSum_negatives() {
        int[] result = sut.twoSum(new int[]{-3, 4, 3, 90}, 0);
        Arrays.sort(result);
        assertArrayEquals(new int[]{0, 2}, result);
    }

    @Test
    void twoSum_duplicates() {
        int[] result = sut.twoSum(new int[]{3, 3}, 6);
        Arrays.sort(result);
        assertArrayEquals(new int[]{0, 1}, result);
    }

    @Test
    void threeSum_basic() {
        List<List<Integer>> result = normalize(sut.threeSum(new int[]{-1, 0, 1, 2, -1, -4}));
        assertEquals(List.of(List.of(-1, -1, 2), List.of(-1, 0, 1)), result);
    }

    @Test
    void threeSum_allZeros() {
        List<List<Integer>> result = normalize(sut.threeSum(new int[]{0, 0, 0, 0}));
        assertEquals(List.of(List.of(0, 0, 0)), result);
    }

    @Test
    void threeSum_noTriplets() {
        List<List<Integer>> result = sut.threeSum(new int[]{1, 2, 3});
        assertEquals(List.of(), result);
    }

    private static List<List<Integer>> normalize(List<List<Integer>> in) {
        List<List<Integer>> copy = new java.util.ArrayList<>();
        for (List<Integer> t : in) {
            List<Integer> sorted = new java.util.ArrayList<>(t);
            sorted.sort(Comparator.naturalOrder());
            copy.add(sorted);
        }
        copy.sort((a, b) -> {
            for (int i = 0; i < 3; i++) {
                int c = Integer.compare(a.get(i), b.get(i));
                if (c != 0) return c;
            }
            return 0;
        });
        return copy;
    }
}
