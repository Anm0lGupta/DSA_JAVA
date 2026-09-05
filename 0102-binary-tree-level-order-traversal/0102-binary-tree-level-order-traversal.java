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
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root == null) return new LinkedList();
        Queue<TreeNode> treeNodeQueue = new LinkedList<>();
        List<List<Integer>> list = new ArrayList<>();
        treeNodeQueue.add(root);
        int i=0;
        while(!treeNodeQueue.isEmpty())
        {
            int n = treeNodeQueue.size();
            list.add(new ArrayList<>());
            while(n>0)
            {
                TreeNode treeNode = treeNodeQueue.poll();
                if(treeNode != null)
                {
                    list.get(i).add(treeNode.val);
                    if(treeNode.left != null) treeNodeQueue.add(treeNode.left);
                    if(treeNode.right != null) treeNodeQueue.add(treeNode.right);
                }
                n--;
            }
            i++;
        }
        return list;
    }
}