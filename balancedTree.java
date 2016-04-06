/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public boolean isBalanced(TreeNode root) {
        if (root == null)
        {
            return true;
        }
        int rh = height(root.right);
        int lh = height(root.left);
        if(Math.abs (lh - rh) > 1)
        {
            return false;
        }
        return (isBalanced (root.left) && isBalanced (root.right));
    }

    public int height(TreeNode root){
        if(root == null)
        {
            return 0;
        }
        else
        {
            return Math.max (height(root.left), height(root.right)) + 1;
        }
    }
}