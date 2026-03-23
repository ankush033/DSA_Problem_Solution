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
    public List<List<Integer>> levelOrder(TreeNode root) {
      
        List<List<Integer>> list=new ArrayList<>();
        if(root==null){
            return list;
        }
        Queue<TreeNode> q= new LinkedList<>();
        q.add(root);
        q.add(null);
        List<Integer> level =new ArrayList<>();
        while(!q.isEmpty()){
            TreeNode currentNode=q.remove();
            if(currentNode==null){
                list.add(new ArrayList<>(level));
                level.clear();

                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }
            }else{
                level.add(currentNode.val);
                if(currentNode.left!=null) q.add(currentNode.left);
                if(currentNode.right!=null) q.add(currentNode.right);
            }
        }
                    
           return list;     

            }
            }
    
        

