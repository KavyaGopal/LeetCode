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
    public List<Double> averageOfLevels(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        List<Double> result = new ArrayList<Double>();
        if (root == null)
            return result;
        while(!queue.isEmpty()) {
            int length = queue.size();
            double sum = 0;
            for (int i = 0; i < length; i++) {
                TreeNode node = queue.remove();
                if (node.left != null)
                    queue.add(node.left);
                if (node.right != null)
                    queue.add(node.right);
                sum += node.val;
            }
            result.add(sum/length);
        }
        return result;
    }
}