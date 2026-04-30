package dsa.backtracking;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SolutionTest {

    private final Solution sut = new Solution();

    private char[][] sampleBoard() {
        return new char[][]{
                {'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'E'},
        };
    }

    @Test
    void wordSearch_present() {
        assertTrue(sut.exist(sampleBoard(), "ABCCED"));
    }

    @Test
    void wordSearch_presentZigzag() {
        assertTrue(sut.exist(sampleBoard(), "SEE"));
    }

    @Test
    void wordSearch_absent() {
        assertFalse(sut.exist(sampleBoard(), "ABCB"));
    }

    @Test
    void permute_threeElements() {
        List<List<Integer>> result = sortPerms(sut.permute(new int[]{1, 2, 3}));
        List<List<Integer>> expected = sortPerms(List.of(
                List.of(1, 2, 3),
                List.of(1, 3, 2),
                List.of(2, 1, 3),
                List.of(2, 3, 1),
                List.of(3, 1, 2),
                List.of(3, 2, 1)
        ));
        assertEquals(expected, result);
    }

    @Test
    void permute_single() {
        assertEquals(List.of(List.of(7)), sut.permute(new int[]{7}));
    }

    @Test
    void permute_two() {
        List<List<Integer>> result = sortPerms(sut.permute(new int[]{0, 1}));
        assertEquals(List.of(List.of(0, 1), List.of(1, 0)), result);
    }

    private static List<List<Integer>> sortPerms(List<List<Integer>> in) {
        List<List<Integer>> out = new ArrayList<>(in);
        out.sort((a, b) -> {
            for (int i = 0; i < Math.min(a.size(), b.size()); i++) {
                int c = Integer.compare(a.get(i), b.get(i));
                if (c != 0) return c;
            }
            return Integer.compare(a.size(), b.size());
        });
        return out;
    }
}
