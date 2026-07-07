class Solution {

    private int postIndex;
    private HashMap<Integer, Integer> map;

    public TreeNode buildTree(int[] inorder, int[] postorder) {

        map = new HashMap<>();

        // Store inorder values with their indices
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }

        // Start from the last element of postorder
        postIndex = postorder.length - 1;

        return build(inorder, postorder, 0, inorder.length - 1);
    }

    private TreeNode build(int[] inorder, int[] postorder, int left, int right) {

        // No nodes to construct
        if (left > right) {
            return null;
        }

        // Last element in postorder is the root
        int rootValue = postorder[postIndex--];
        TreeNode root = new TreeNode(rootValue);

        // Find root in inorder
        int index = map.get(rootValue);

        // Build right subtree first
        root.right = build(inorder, postorder, index + 1, right);

        // Build left subtree
        root.left = build(inorder, postorder, left, index - 1);

        return root;
    }
}