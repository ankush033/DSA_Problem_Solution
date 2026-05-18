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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
    ArrayList<List<Integer> >list=new ArrayList<>();
    Queue<TreeNode> q=new LinkedList<>();
    if(root==null){
        return list;
    }
   boolean flag=true;
   q.add(root);
   while(!q.isEmpty()){
    int size=q.size();
    LinkedList<Integer> level=new LinkedList<>();
    for(int i=0;i<size;i++){
         TreeNode node=q.remove();
         if(flag){
            level.addLast(node.val);
         } else{
            level.addFirst(node.val);
         }
         if(node.left!=null){
            q.add(node.left);
         }
         if(node.right!=null){
            q.add(node.right);
         }
    }
    list.add(level);
    flag=!flag;
  

   }
   return list;





    }
}
//         List<List<Integer>> list=new  ArrayList<>();
//         if(root==null){
//             return list;
//         }
//         Queue<TreeNode> q=new LinkedList<>();
//         q.offer(root);
//         boolean lefttoright=true;
//         while(!q.isEmpty()){
//             int size=q.size();
//             LinkedList<Integer> level=new LinkedList<>();
//             for(int i=0;i<size;i++){
//                 TreeNode node=q.poll();
//                 if(lefttoright){
//                     level.addLast(node.val);
//                 }else{
//                     level.addFirst(node.val);
//                 }
//                 if(node.left!=null) q.offer(node.left);
//                 if(node.right!=null) q.offer(node.right);
//             }
//             list.add(level);
//             lefttoright=!lefttoright;
//         }

// return list;
//     }
// }