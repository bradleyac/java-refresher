package dsa.lrucache;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LRUCacheTest {

    @Test
    void leetcodeExample() {
        LRUCache cache = new LRUCache(2);
        cache.put(1, 1);
        cache.put(2, 2);
        assertEquals(1, cache.get(1));    // returns 1
        cache.put(3, 3);                  // evicts key 2
        assertEquals(-1, cache.get(2));
        cache.put(4, 4);                  // evicts key 1
        assertEquals(-1, cache.get(1));
        assertEquals(3, cache.get(3));
        assertEquals(4, cache.get(4));
    }

    @Test
    void updateExistingKeyDoesNotEvict() {
        LRUCache cache = new LRUCache(2);
        cache.put(1, 1);
        cache.put(2, 2);
        cache.put(1, 10); // refresh key 1
        cache.put(3, 3);  // should evict key 2, not key 1
        assertEquals(10, cache.get(1));
        assertEquals(-1, cache.get(2));
        assertEquals(3, cache.get(3));
    }

    @Test
    void getRefreshesRecency() {
        LRUCache cache = new LRUCache(2);
        cache.put(1, 1);
        cache.put(2, 2);
        cache.get(1);    // touch key 1
        cache.put(3, 3); // should evict key 2
        assertEquals(1, cache.get(1));
        assertEquals(-1, cache.get(2));
    }

    @Test
    void capacityOne() {
        LRUCache cache = new LRUCache(1);
        cache.put(1, 1);
        cache.put(2, 2);
        assertEquals(-1, cache.get(1));
        assertEquals(2, cache.get(2));
    }
}
