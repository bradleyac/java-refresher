package dsa.binarytree;

import java.util.List;

/**
 * Challenge 5: Binary Tree Traversals + Lowest Common Ancestor.
 *
 * <p>Patterns: Recursion, BFS, DFS.
 *
 * <p>Java focus:
 * <ul>
 *   <li>{@code Queue<TreeNode> q = new ArrayDeque<>()} for BFS — avoid {@code LinkedList} (slower).</li>
 *   <li>Iterative in-order requires an explicit {@code Deque<TreeNode>}.</li>
 *   <li>For level order, return {@code List<List<Integer>>} — copy each level into a new ArrayList.</li>
 * </ul>
 */
public class Solution {

    /** In-order traversal (left, root, right) — recursive or iterative. */
    public List<Integer> inorder(TreeNode root) {
        throw new UnsupportedOperationException("TODO");
    }

    /** Pre-order traversal (root, left, right). */
    public List<Integer> preorder(TreeNode root) {
        throw new UnsupportedOperationException("TODO");
    }

    /** Post-order traversal (left, right, root). */
    public List<Integer> postorder(TreeNode root) {
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * Level-order (BFS) traversal: returns a list of levels, each level a list of node values
     * from left to right.
     */
    public List<List<Integer>> levelOrder(TreeNode root) {
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * Lowest Common Ancestor in a Binary Search Tree.
     *
     * <p>Use BST ordering for O(h) traversal without storing parents.
     */
    public TreeNode lowestCommonAncestorBST(TreeNode root, TreeNode p, TreeNode q) {
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * Lowest Common Ancestor in a general binary tree (no BST property).
     *
     * <p>Classic recursion: return p, q, or the first node where left and right both return non-null.
     */
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        throw new UnsupportedOperationException("TODO");
    }
}
