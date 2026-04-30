package dsa.twosum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * Challenge 1: Two Sum + Three Sum.
 *
 * <p>
 * Patterns: Hashing, sorting, two pointers.
 *
 * <p>
 * Java focus:
 * <ul>
 * <li>{@code HashMap<Integer,Integer>} — autoboxing happens at every
 * put/get.</li>
 * <li>{@code Arrays.sort(int[])} sorts in place; for {@code Integer[]} you can
 * pass a Comparator.</li>
 * <li>Returning {@code List<List<Integer>>} — use
 * {@code new ArrayList<>(List.of(a, b, c))}.</li>
 * </ul>
 */
public class Solution {

    /**
     * Two Sum: given an array of integers and a target, return the indices of the
     * two numbers
     * that add up to target. Exactly one solution exists; you may not use the same
     * element twice.
     *
     * <p>
     * Example: nums = [2,7,11,15], target = 9 -> [0,1]
     *
     * <p>
     * Target complexity: O(n) time, O(n) space.
     */
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> seen = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (seen.containsKey(complement)) {
                return new int[] { i, seen.get(complement) };
            }
            seen.put(nums[i], i);
        }

        throw new IllegalArgumentException("No two sum solution");
    }

    /**
     * Three Sum: given an integer array, return all unique triplets [a, b, c] such
     * that
     * a + b + c == 0. The result must not contain duplicate triplets.
     *
     * <p>
     * Example: nums = [-1,0,1,2,-1,-4] -> [[-1,-1,2],[-1,0,1]]
     * [-4, -1, -1, 0, 1, 2]
     * [0, 0, 0, 0]
     *
     * <p>
     * Target complexity: O(n^2) time, O(1) extra space (excluding output).
     */
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums); // nlog(n)

        List<List<Integer>> results = new ArrayList<List<Integer>>();

        for (int i = 0; i < nums.length - 2; ++i) {
            int a = nums[i];

            // Make sure we don't start with the same number a second time.
            if (i > 0 && (a == nums[i - 1])) {
                continue;
            }

            int start = i + 1;
            int end = nums.length - 1;
            while (start < end) {
                int b = nums[start];
                int c = nums[end];
                if (a + b + c == 0) {
                    results.add(List.of(a, b, c));

                    // Advance start and end to next distinct number
                    // Reusing the same number for either b or c here would
                    // never yield a new solution because nums is sorted.
                    do {
                        start = start + 1;
                    } while (start < end && nums[start] == b);
                    do {
                        end = end - 1;
                    } while (start < end && nums[end] == c);
                } else if (a + b + c > 0) {
                    // Advance end to next distinct number
                    do {
                        end = end - 1;
                    } while (start < end && nums[end] == c);
                } else {
                    // Advance start to next distinct number
                    do {
                        start = start + 1;
                    } while (start < end && nums[start] == b);
                }
            }
        }

        return results;
    }
}
