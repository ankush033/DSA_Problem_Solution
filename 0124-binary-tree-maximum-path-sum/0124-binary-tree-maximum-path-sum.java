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
    int maxSum=Integer.MIN_VALUE;
     public int maxPathSum(TreeNode root) {
        maxPathdown(root);
        return maxSum;
     }
     public int maxPathdown(TreeNode root){
        if(root==null){
            return 0;
        }
        int leftsum=Math.max(0,maxPathdown(root.left));
        int rightsum=Math.max(0,maxPathdown(root.right));
        maxSum=Math.max(maxSum,root.val+leftsum+rightsum);
        return Math.max(leftsum,rightsum)+ root.val;
     }
}

















//     int maxSum=Integer.MIN_VALUE;
//     public int maxPathSum(TreeNode root) {
//         maxpathdown(root);
//         return maxSum;
//     }
//     public int maxpathdown(TreeNode node){
//         if(node==null){
//             return 0;
//         }
//         int leftSum=Math.max(0,maxpathdown(node.left));
//         int rightSum=Math.max(0,maxpathdown(node.right));
//         maxSum=Math.max(maxSum,leftSum+rightSum+node.val);
//         return node.val+Math.max(leftSum,rightSum);
//     }
// }