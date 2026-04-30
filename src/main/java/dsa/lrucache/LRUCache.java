package dsa.lrucache;

/**
 * Challenge 10: LRU Cache.
 *
 * <p>Design a data structure for a Least Recently Used cache supporting:
 * <ul>
 *   <li>{@code get(key)} — return the value if it exists, else -1; mark it most recently used.</li>
 *   <li>{@code put(key, value)} — insert or update; if capacity exceeded, evict the
 *       least recently used key.</li>
 * </ul>
 * Both operations must run in O(1) average time.
 *
 * <p>Approaches (try both for practice):
 * <ol>
 *   <li><strong>Easy mode:</strong> extend {@code java.util.LinkedHashMap} with access-order
 *       enabled and override {@code removeEldestEntry}.</li>
 *   <li><strong>Hard mode:</strong> hand-roll a {@code HashMap<Integer, Node>} +
 *       a doubly linked list with a sentinel head and tail.</li>
 * </ol>
 *
 * <p>Java focus:
 * <ul>
 *   <li>{@code LinkedHashMap}'s third constructor arg toggles access-order vs insertion-order.</li>
 *   <li>For the hand-rolled version: sentinel head/tail nodes simplify edge cases — no
 *       null checks on {@code next}/{@code prev} during list mutation.</li>
 * </ul>
 */
public class LRUCache {

    public LRUCache(int capacity) {
        // TODO: initialize internal data structures
    }

    public int get(int key) {
        throw new UnsupportedOperationException("TODO");
    }

    public void put(int key, int value) {
        throw new UnsupportedOperationException("TODO");
    }
}
