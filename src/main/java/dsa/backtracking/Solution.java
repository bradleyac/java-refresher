package dsa.backtracking;

import java.util.List;

/**
 * Challenge 9: Word Search + Permutations.
 *
 * <p>Patterns: Backtracking with state restoration.
 *
 * <p>Java focus:
 * <ul>
 *   <li>Mutate a shared {@code List<Integer>} as the path; on a found leaf, copy with
 *       {@code new ArrayList<>(path)} (no C# {@code ToList()}).</li>
 *   <li>For grids, mutate the cell to a sentinel (e.g. '#') and restore on backtrack —
 *       avoids allocating a visited matrix.</li>
 *   <li>{@code char[]} loops are faster than repeated {@code charAt}.</li>
 * </ul>
 */
public class Solution {

    /**
     * Word Search: given an m x n grid of characters and a word, return true if the
     * word can be constructed from letters of sequentially adjacent cells (horizontal or
     * vertical neighbors). The same cell may not be used more than once.
     *
     * <p>Example: board = [['A','B','C','E'],['S','F','C','S'],['A','D','E','E']],
     * word = "ABCCED" -> true.
     *
     * <p>Target complexity: O(m * n * 4^L) worst case where L = word length.
     */
    public boolean exist(char[][] board, String word) {
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * Permutations: given a distinct integer array, return all possible permutations.
     * Order of the result list does not matter; tests sort it before comparing.
     *
     * <p>Example: [1,2,3] -> [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]].
     *
     * <p>Target complexity: O(n * n!) time.
     */
    public List<List<Integer>> permute(int[] nums) {
        throw new UnsupportedOperationException("TODO");
    }
}
