package dsa.twosum;

import java.util.List;

/**
 * Challenge 1: Two Sum + Three Sum.
 *
 * <p>Patterns: Hashing, sorting, two pointers.
 *
 * <p>Java focus:
 * <ul>
 *   <li>{@code HashMap<Integer,Integer>} — autoboxing happens at every put/get.</li>
 *   <li>{@code Arrays.sort(int[])} sorts in place; for {@code Integer[]} you can pass a Comparator.</li>
 *   <li>Returning {@code List<List<Integer>>} — use {@code new ArrayList<>(List.of(a, b, c))}.</li>
 * </ul>
 */
public class Solution {

    /**
     * Two Sum: given an array of integers and a target, return the indices of the two numbers
     * that add up to target. Exactly one solution exists; you may not use the same element twice.
     *
     * <p>Example: nums = [2,7,11,15], target = 9 -> [0,1]
     *
     * <p>Target complexity: O(n) time, O(n) space.
     */
    public int[] twoSum(int[] nums, int target) {
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * Three Sum: given an integer array, return all unique triplets [a, b, c] such that
     * a + b + c == 0. The result must not contain duplicate triplets.
     *
     * <p>Example: nums = [-1,0,1,2,-1,-4] -> [[-1,-1,2],[-1,0,1]]
     *
     * <p>Target complexity: O(n^2) time, O(1) extra space (excluding output).
     */
    public List<List<Integer>> threeSum(int[] nums) {
        throw new UnsupportedOperationException("TODO");
    }
}
