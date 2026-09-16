/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    private int maxSum;
    private int solve(TreeNode root)
    {
        if(root == null)
        {
            return 0;
        }
        int left = solve(root.left);
        int right = solve(root.right);
        int do_no_ache = left + right + root.val;
        int ek_acha = Math.max(left, right) + root.val;
        int root_acha = root.val;
        maxSum = Math.max(maxSum, Math.max(do_no_ache, Math.max(ek_acha, root_acha)));
        return Math.max(ek_acha, root_acha);
    }
    public int maxPathSum(TreeNode root) {
        maxSum = Integer.MIN_VALUE;
        solve(root);
        return maxSum;
    }
}