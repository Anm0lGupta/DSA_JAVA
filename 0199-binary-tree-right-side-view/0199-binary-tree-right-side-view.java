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
    public List<Integer> rightSideView(TreeNode root) {
        if(root == null) return new LinkedList();
        Queue<TreeNode> treeNodeQueue = new LinkedList<>();
        List<Integer> list = new ArrayList<>();
        treeNodeQueue.add(root);
        while(!treeNodeQueue.isEmpty())
        {
            int n = treeNodeQueue.size();
            while(n>0)
            {
                TreeNode treeNode = treeNodeQueue.poll();
                if(n == 1)
                {
                    list.add(treeNode.val);
                }
                if(treeNode.left != null)
                {
                    treeNodeQueue.add(treeNode.left);
                }
                if(treeNode.right != null)
                {
                    treeNodeQueue.add(treeNode.right);
                }
                n--;
            }
        }
        return list;
    }
}