package dsa.graphs;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    private final Solution sut = new Solution();

    @Test
    void numIslands_threeIslands() {
        char[][] grid = {
                {'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '0', '1', '1'},
        };
        assertEquals(3, sut.numIslands(grid));
    }

    @Test
    void numIslands_oneBigIsland() {
        char[][] grid = {
                {'1', '1', '1', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '0', '0'},
        };
        assertEquals(1, sut.numIslands(grid));
    }

    @Test
    void numIslands_allWater() {
        char[][] grid = {
                {'0', '0'},
                {'0', '0'},
        };
        assertEquals(0, sut.numIslands(grid));
    }

    @Test
    void wordLadder_classic() {
        assertEquals(5, sut.ladderLength("hit", "cog", List.of("hot", "dot", "dog", "lot", "log", "cog")));
    }

    @Test
    void wordLadder_endNotInList() {
        assertEquals(0, sut.ladderLength("hit", "cog", List.of("hot", "dot", "dog", "lot", "log")));
    }

    @Test
    void wordLadder_oneStep() {
        assertEquals(2, sut.ladderLength("a", "c", List.of("a", "b", "c")));
    }
}
