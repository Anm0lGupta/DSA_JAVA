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
    private void fill(TreeNode root, List<List<Integer>> result,  int targetSum, List<Integer> temp, int sum)
    {
        if(root == null)
        {
            return;
        }
        sum += root.val;
        temp.add(root.val);
        if(root.left == null && root.right == null)
        {
            if(sum == targetSum)
            {
                result.add(new ArrayList<>(temp));
            }
        }
        else
        {
            fill(root.left, result, targetSum, temp, sum);
            fill(root.right, result, targetSum, temp, sum);
        }
        temp.remove(temp.size() - 1);
    }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        fill(root, result, targetSum, temp, 0);
        return result;
    }
}