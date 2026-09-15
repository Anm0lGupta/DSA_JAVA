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
    private String inorder(TreeNode root)
    {
        if(root == null) return "";
        if(root.left == null && root.right == null)
        {
            return root.val + "_";
        }
        return inorder(root.left) + inorder(root.right);
    }
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        String s1 = inorder(root1);
        String s2 = inorder(root2);
        return s1.equals(s2);
    }
}