class Solution {
    public int rob(TreeNode root) {
        int[] res = solve(root);
        return Math.max(res[0], res[1]);
    }

    public int[] solve(TreeNode root) {
        if (root == null) return new int[]{0, 0};

        int[] left = solve(root.left);
        int[] right = solve(root.right);

        int[] curr = new int[2];

        // rob current
        curr[0] = root.val + left[1] + right[1];

        // skip current
        curr[1] = Math.max(left[0], left[1]) + Math.max(right[0], right[1]);

        return curr;
    }
}