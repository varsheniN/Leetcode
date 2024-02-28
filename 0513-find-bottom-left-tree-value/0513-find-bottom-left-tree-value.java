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
    int height=0,tvalue=0;
    public int findBottomLeftValue(TreeNode root) {
        getleftval(root,1);
        return tvalue;
    }
    private void getleftval(TreeNode root,int lvl){
        if(root==null) return;
        else if(lvl>height){
            tvalue=root.val;
            height=lvl;
        }
        getleftval(root.left,lvl+1);
        getleftval(root.right,lvl+1);
    }
    
}