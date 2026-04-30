package dsa.binarytree;

import java.util.ArrayDeque;
import java.util.ArrayList;
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
        if (root == null) {
            return new ArrayList<Integer>();
        }

        var result = inorder(root.left);
        result.add(root.val);
        result.addAll(inorder(root.right));
        return result;
    }

    /** Pre-order traversal (root, left, right). */
    public List<Integer> preorder(TreeNode root) {
        if (root == null) {
            return new ArrayList<Integer>();
        }

        var result = new ArrayList<Integer>();
        result.add(root.val);
        result.addAll(preorder(root.left));
        result.addAll(preorder(root.right));
        return result;
    }

    /** Post-order traversal (left, right, root). */
    public List<Integer> postorder(TreeNode root) {
        if (root == null) {
            return new ArrayList<Integer>();
        }

        var result = postorder(root.left);
        result.addAll(postorder(root.right));
        result.add(root.val);
        return result;
    }

    /**
     * Level-order (BFS) traversal: returns a list of levels, each level a list of node values
     * from left to right.
     */
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();

        if (root == null) {
            return result;
        }

        ArrayDeque<TreeNode> nextLevelNodes = new ArrayDeque<>();
        nextLevelNodes.add(root);

        while (!nextLevelNodes.isEmpty())
        {
            var thisLevel = new ArrayList<Integer>();

            var thisLevelNodes = nextLevelNodes;
            nextLevelNodes = new ArrayDeque<>();

            while (!thisLevelNodes.isEmpty()) {
                var current = thisLevelNodes.pop();
                thisLevel.add(current.val);
                if (current.left != null) {
                    nextLevelNodes.add(current.left);
                }
                if (current.right != null) {
                    nextLevelNodes.add(current.right);
                }
            }
            result.add(thisLevel);
        }

        return result;
    }

    /**
     * Lowest Common Ancestor in a Binary Search Tree.
     *
     * <p>Use BST ordering for O(h) traversal without storing parents.
     */
    public TreeNode lowestCommonAncestorBST(TreeNode root, TreeNode p, TreeNode q) {
        if (root == p || root == q) {
            return root;
        }

        if (p.val < root.val && q.val < root.val) {
            // Both in left subtree
            return lowestCommonAncestorBST(root.left, p, q);
        }
        else if (p.val > root.val && q.val > root.val) {
            // Both in right subtree
            return lowestCommonAncestorBST(root.right, p, q);
        } else {
            // Each in different subtrees, root is the LCA.
            return root;
        }
    }

    /**
     * Lowest Common Ancestor in a general binary tree (no BST property).
     *
     * <p>Classic recursion: return p, q, or the first node where left and right both return non-null.
     */
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == p || root == q || root == null) {
            return root;
        }

        var leftA = lowestCommonAncestor(root.left, p, q);
        var rightA = lowestCommonAncestor(root.right, p, q);

        if (leftA != null && rightA != null) {
            return root;
        }

        return lowestCommonAncestor(leftA != null ? root.left : root.right, p, q);
    }
}
