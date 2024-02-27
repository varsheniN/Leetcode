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
    private int diameter=0;
    public int diameterOfBinaryTree(TreeNode root) {
        finddia(root);
        return diameter;
    }
    private int finddia(TreeNode root){
        if(root==null) return 0;
        int leftdp=finddia(root.left);
        int rightdp=finddia(root.right);
        int curr=leftdp+rightdp;
        diameter=Math.max(curr,diameter);
        return 1+Math.max(leftdp,rightdp);
    }
}