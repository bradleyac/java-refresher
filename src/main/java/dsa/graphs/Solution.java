package dsa.graphs;

import java.util.List;

/**
 * Challenge 6: Number of Islands + Word Ladder.
 *
 * <p>Patterns: BFS, DFS, implicit graphs, visited tracking.
 *
 * <p>Java focus:
 * <ul>
 *   <li>Grids: {@code char[][]} or {@code int[][]} — be careful: {@code grid.length} is rows,
 *       {@code grid[0].length} is cols.</li>
 *   <li>{@code ArrayDeque} for BFS; {@code addLast} / {@code pollFirst}.</li>
 *   <li>For Word Ladder, build a neighbor lookup with wildcard patterns (e.g. "h*t") to avoid
 *       O(n^2) word-pair comparisons.</li>
 * </ul>
 */
public class Solution {

    /**
     * Number of Islands: given a 2D grid of '1' (land) and '0' (water), count the number
     * of islands (4-directionally connected groups of '1').
     *
     * <p>You may mutate the grid (mark visited as '0' or '#') or use a separate visited array.
     *
     * <p>Target complexity: O(rows * cols) time and space.
     */
    public int numIslands(char[][] grid) {
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * Word Ladder: return the length of the shortest transformation sequence from
     * beginWord to endWord, where each step changes exactly one letter and each
     * intermediate word must be in wordList. Return 0 if no such sequence exists.
     *
     * <p>Length includes both endpoints; e.g., hit -> hot -> dot -> dog -> cog has length 5.
     *
     * <p>Target complexity: O(N * L^2) where N = wordList size, L = word length.
     */
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        throw new UnsupportedOperationException("TODO");
    }
}
