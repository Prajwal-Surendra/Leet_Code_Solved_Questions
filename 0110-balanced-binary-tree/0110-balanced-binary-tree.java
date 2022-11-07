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
    public boolean isBalanced(TreeNode root) {
        return dfs(root)!=-1;
    }
    public int dfs(TreeNode root)
    {
        if (root == null)
            return 0;
        int ltree=dfs(root.left);
        int rtree=dfs(root.right);
        if(ltree == -1 || rtree == -1 || Math.abs(ltree - rtree )>1)
            return -1;
        return Math.max(ltree,rtree)+1;
    }
}