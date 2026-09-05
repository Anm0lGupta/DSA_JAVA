class Solution {
    public boolean isEvenOddTree(TreeNode root) {
        if (root == null) return true;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        boolean evenLevel = true; 
        while (!queue.isEmpty()) {
            int n = queue.size();
            int prev = evenLevel ? 0 : Integer.MAX_VALUE;
            while (n > 0) {
                TreeNode node = queue.poll();
                if (evenLevel) {
                    if (node.val % 2 == 0 || node.val <= prev) {
                        return false; 
                    }
                } else {
                    if (node.val % 2 != 0 || node.val >= prev) {
                        return false; 
                    }
                }
                prev = node.val; 
                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
                n--;
            }
            evenLevel = !evenLevel; 
        }
        return true;
    }
}