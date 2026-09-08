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
    private TreeNode deleteHelper(TreeNode root, Set<Integer> set, List<TreeNode> list)
    {
        if(root == null) return null;
        root.left = deleteHelper(root.left, set, list);
        root.right = deleteHelper(root.right, set, list);
        if(set.contains(root.val))
        {
            if(root.left != null)
            {
                list.add(root.left);
            }
            if(root.right != null)
            {
                list.add(root.right);
            }
            return null;
        }
        else
        {
            return root;
        }
    }
    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        List<TreeNode> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for(int num : to_delete)
        {
            set.add(num);
        }
        deleteHelper(root, set, list);
        if(!set.contains(root.val))
        {
            list.add(root);
        }
        return list;
    }
}