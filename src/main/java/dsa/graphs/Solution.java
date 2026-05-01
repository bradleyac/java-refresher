package dsa.graphs;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Challenge 6: Number of Islands + Word Ladder 
 *
 * <p>Patterns: BFS, DFS, implicit graphs, visited tracking 
 *
 * <p>Java focus:
 * <ul>
 *   <li>Grids: {@code char[][]} or {@code int[][]} — be careful: {@code grid length} is rows,
 *       {@code grid[0] length} is cols </li>
 *   <li>{@code ArrayDeque} for BFS; {@code addLast} / {@code pollFirst} </li>
 *   <li>For Word Ladder, build a neighbor lookup with wildcard patterns (e g  "h*t") to avoid
 *       O(n^2) word-pair comparisons </li>
 * </ul>
 */
public class Solution {
    record Coord(int x, int y){}
    /**
     * Number of Islands: given a 2D grid of '1' (land) and '0' (water), count the number
     * of islands (4-directionally connected groups of '1') 
     *
     * <p>You may mutate the grid (mark visited as '0' or '#') or use a separate visited array 
     *
     * <p>Target complexity: O(rows * cols) time and space
     */
    public int numIslands(char[][] grid) {
        int count = 0;

        for (int i = 0; i < grid.length; ++i) {
            for (int j = 0; j < grid[0].length; ++j) {
                if (grid[i][j] == '1') {
                    grid[i][j] = '0';
                    count++;
                    ArrayDeque<Coord> neighboringLand = new ArrayDeque<>();
                    neighboringLand.add(new Coord(j, i));

                    while(!neighboringLand.isEmpty()) {
                        var current = neighboringLand.removeFirst();

                        for (var neighbor : findValidNeighbors(grid, current)) {
                            if (grid[neighbor.y()][neighbor.x()] == '1') {
                                grid[neighbor.y()][neighbor.x()] = '0';
                                neighboringLand.add(neighbor);
                            }
                        }
                    }
                }
            }
        }

        return count;
    }

    private List<Coord> findValidNeighbors(char[][] grid, Coord pos) {
        List<Coord> neighbors = new ArrayList<>();

        if (pos.y() - 1 >= 0) {
            neighbors.add(new Coord(pos.x(), pos.y()-1));
        }
        if (pos.x() - 1 >= 0) {
            neighbors.add(new Coord(pos.x()-1, pos.y()));
        }
        if (pos.x() + 1 < grid[0].length) {
            neighbors.add(new Coord(pos.x()+1, pos.y()));
        }
        if (pos.y() + 1 < grid.length) {
            neighbors.add(new Coord(pos.x(), pos.y()+1));
        }

        return neighbors;
    }

    /**
     * Word Ladder: return the length of the shortest transformation sequence from
     * beginWord to endWord, where each step changes exactly one letter and each
     * intermediate word must be in wordList  Return 0 if no such sequence exists 
     *
     * <p>Length includes both endpoints; e g , hit -> hot -> dot -> dog -> cog has length 5 
     *
     * <p>Target complexity: O(N * L^2) where N = wordList size, L = word length 
     */
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        final var wordSet = new HashSet<>(wordList); // O(N)
        final var lookups = computeLookups(wordList); // O(N * L)

        // End not in the word list, so bail.
        if (!wordSet.contains(endWord)) { // O(1)
            return 0;
        }

        BiConsumer<String, Queue<String>> consumeWord = (String toConsume, Queue<String> nextLevel) -> {
            for (var wc : computeWildcards(toConsume)) { // O(L)
                for (var word : (lookups.containsKey(wc) ? lookups.get(wc) : new ArrayList<String>())) {
                    if (wordSet.contains(word)) {
                        // Remove from word set as we add a word as a candidate,
                        // ensuring we only visit each word at most once.
                        wordSet.remove(word);
                        nextLevel.add(word);
                    }
                }
            }
        };

        Queue<String> nextLevel = new ArrayDeque<>();
        consumeWord.accept(beginWord, nextLevel);

        int level = 1;
        while (!nextLevel.isEmpty()) {
            ++level;
            Queue<String> thisLevel = nextLevel;
            nextLevel = new ArrayDeque<>();

            while (!thisLevel.isEmpty()) {
                var currentWord = thisLevel.remove();

                if (currentWord.equals(endWord)) {
                    return level;
                }

                consumeWord.accept(currentWord, nextLevel);
            }
        }

        return 0;
    }

    private Map<String, HashSet<String>> computeLookups(List<String> wordList) {
        Map<String, HashSet<String>> lookups = new HashMap<>();
        for (var word : wordList) {
            for (var wildCard : computeWildcards(word)) {
                if (!lookups.containsKey(wildCard)) {
                    lookups.put(wildCard, new HashSet<>());
                }

                lookups.get(wildCard).add(word);
            }
        }

        return lookups;
    }

    private List<String> computeWildcards(String word) {
        List<String> wildCards = new ArrayList<>();

        for (int i = 0; i < word.length(); ++i) {
            wildCards.add(word.substring(0,i) + "*" + word.substring(i+1));
        }

        return wildCards;
    }
}
