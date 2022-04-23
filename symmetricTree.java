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
//TC : O(N) SC : O(height of tree)
class Solution {
    public boolean isSymmetric(TreeNode root) {

        if(root == null) return true;

        return helper(root.left,root.right);

    }

    private boolean helper(TreeNode left, TreeNode right)
    {
        if(left==null && right == null) return true;

        if((left!=null && right == null) || (right!=null && left == null)) return false;

        if(left.val != right.val) return false;

        boolean c1 = helper(left.left,right.right);
        boolean c2 = helper(left.right,right.left);

        return c1 && c2;
    }
}