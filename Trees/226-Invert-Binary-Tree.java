class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

/*
 * Recursively swap left and right children starting with the root node.
 *
 * Time complexity - O(n)
 * Space complexity - O(h) -> for call stack, where h is the height of the tree
 */
class Solution {
    public TreeNode invertTree(TreeNode root) {
        if (root == null)
            return null;

        TreeNode temp = root.left;

        root.left = invertTree(root.right);
        root.right = invertTree(temp);

        return root;
    }
}
