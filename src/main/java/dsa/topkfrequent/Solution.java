package dsa.topkfrequent;

/**
 * Challenge 7: Top K Frequent Elements.
 *
 * <p>Patterns: Hash map counting + heap (or bucket sort).
 *
 * <p>Java focus:
 * <ul>
 *   <li>{@code PriorityQueue} is a <strong>min-heap</strong> by default.</li>
 *   <li>To make a max-heap or custom order: pass a {@code Comparator}, e.g.
 *       {@code new PriorityQueue<>(Comparator.comparingInt(Map.Entry::getValue))}.</li>
 *   <li>For top-K with a min-heap, keep size at K and poll the smallest when it overflows —
 *       O(n log k).</li>
 *   <li>No LINQ: use {@code map.entrySet()} iteration; method references like
 *       {@code Map.Entry::getValue} keep code tight.</li>
 * </ul>
 */
public class Solution {

    /**
     * Given an integer array nums and an integer k, return the k most frequent elements.
     * The order of the result does not matter; tests sort the result before comparing.
     *
     * <p>Examples:
     * <ul>
     *   <li>nums = [1,1,1,2,2,3], k = 2 -> [1, 2]</li>
     *   <li>nums = [1], k = 1 -> [1]</li>
     * </ul>
     *
     * <p>Target complexity: O(n log k) time, O(n) space.
     */
    public int[] topKFrequent(int[] nums, int k) {
        throw new UnsupportedOperationException("TODO");
    }
}
