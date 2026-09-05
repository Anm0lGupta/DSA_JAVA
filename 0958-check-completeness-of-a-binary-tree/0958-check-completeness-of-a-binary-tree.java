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
    public boolean isCompleteTree(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        boolean past = false;
        q.add(root);
        while(!q.isEmpty())
        {
            TreeNode treeNode = q.poll();
            if(treeNode == null)
            {
                past = true;
            }
            else
            {
                if(past) 
                {
                    return false;
                }
            q.add(treeNode.left);
            q.add(treeNode.right);
            }
        }
        return true;
    }
}