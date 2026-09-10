class Solution {

    int ans = 0;

    public int averageOfSubtree(TreeNode root) {

        dfs(root);

        return ans;
    }

    public int[] dfs(TreeNode root) {

        if (root == null) {
            return new int[]{0, 0};
        }

        // Get sum and count from left subtree
        int[] left = dfs(root.left);

        // Get sum and count from right subtree
        int[] right = dfs(root.right);

        // Calculate current subtree
        int sum = root.val + left[0] + right[0];
        int count = 1 + left[1] + right[1];

        // Check average
        if (root.val == sum / count) {
            ans++;
        }

        return new int[]{sum, count};
    }
}