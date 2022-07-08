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
 * Recursively check depth of left and right subtree starting with the root
 * node - DFS
 * At each level, add one to the max depth of either left or right subtree and
 * return.
 *
 * Time complexity - O(n)
 * Space complexity - O(h) -> for call stack, where h is the height of the tree
 */
class Solution1 {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);

        return 1 + Math.max(leftDepth, rightDepth);
    }
}

/*
 * Peform a BFS of the tree
 * At each level, increment the depth
 *
 * Time complexity - O(n)
 * Space complexity - O(n)
 */
class Solution2 {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int depth = 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            depth++;

            for (int i = 0; i < size; i++) {
                TreeNode temp = queue.poll();

                if (temp.left != null) {
                    queue.offer(temp.left);
                }

                if (temp.right != null) {
                    queue.offer(temp.right);
                }
            }
        }

        return depth;
    }
}
