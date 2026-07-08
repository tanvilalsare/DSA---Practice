class Solution {
    int maxSum = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        findMax(root);
        return maxSum;
    }

    private int findMax(TreeNode node) {
        if (node == null) {
            return 0;
        }

        int left = Math.max(0, findMax(node.left));
        int right = Math.max(0, findMax(node.right));

        // Path passing through current node
        int currentPath = node.val + left + right;

        // Update global maximum
        maxSum = Math.max(maxSum, currentPath);

        // Return maximum gain to parent
        return node.val + Math.max(left, right);
    }
}