package dsa.binarytree;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

class SolutionTest {

    private final Solution sut = new Solution();

    /**
     * Sample tree:
     *           1
     *          / \
     *         2   3
     *        / \   \
     *       4   5   6
     */
    private TreeNode sample() {
        TreeNode n4 = new TreeNode(4);
        TreeNode n5 = new TreeNode(5);
        TreeNode n6 = new TreeNode(6);
        TreeNode n2 = new TreeNode(2, n4, n5);
        TreeNode n3 = new TreeNode(3, null, n6);
        return new TreeNode(1, n2, n3);
    }

    /**
     * BST:
     *           6
     *          / \
     *         2   8
     *        / \ / \
     *       0  4 7  9
     *         / \
     *        3   5
     */
    private TreeNode bst() {
        TreeNode n3 = new TreeNode(3);
        TreeNode n5 = new TreeNode(5);
        TreeNode n4 = new TreeNode(4, n3, n5);
        TreeNode n0 = new TreeNode(0);
        TreeNode n2 = new TreeNode(2, n0, n4);
        TreeNode n7 = new TreeNode(7);
        TreeNode n9 = new TreeNode(9);
        TreeNode n8 = new TreeNode(8, n7, n9);
        return new TreeNode(6, n2, n8);
    }

    @Test
    void inorder_basic() {
        assertEquals(List.of(4, 2, 5, 1, 3, 6), sut.inorder(sample()));
    }

    @Test
    void preorder_basic() {
        assertEquals(List.of(1, 2, 4, 5, 3, 6), sut.preorder(sample()));
    }

    @Test
    void postorder_basic() {
        assertEquals(List.of(4, 5, 2, 6, 3, 1), sut.postorder(sample()));
    }

    @Test
    void levelOrder_basic() {
        assertEquals(List.of(List.of(1), List.of(2, 3), List.of(4, 5, 6)), sut.levelOrder(sample()));
    }

    @Test
    void levelOrder_empty() {
        assertEquals(List.of(), sut.levelOrder(null));
    }

    @Test
    void lcaBST_acrossSubtrees() {
        TreeNode root = bst();
        TreeNode p = root.left;          // 2
        TreeNode q = root.right;         // 8
        assertSame(root, sut.lowestCommonAncestorBST(root, p, q));
    }

    @Test
    void lcaBST_oneIsAncestor() {
        TreeNode root = bst();
        TreeNode p = root.left;                // 2
        TreeNode q = root.left.right.left;     // 3
        assertSame(p, sut.lowestCommonAncestorBST(root, p, q));
    }

    @Test
    void lca_general_acrossSubtrees() {
        TreeNode root = sample();
        TreeNode p = root.left.left;     // 4
        TreeNode q = root.right.right;   // 6
        assertSame(root, sut.lowestCommonAncestor(root, p, q));
    }

    @Test
    void lca_general_oneIsAncestor() {
        TreeNode root = sample();
        TreeNode p = root.left;          // 2
        TreeNode q = root.left.right;    // 5
        assertSame(p, sut.lowestCommonAncestor(root, p, q));
    }
}
