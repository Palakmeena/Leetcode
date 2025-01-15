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
    public List<Integer> inorderTraversal(TreeNode root) {

        //using helper fucntion for this

        
                  List<Integer> list=new ArrayList();

      return  traversal(root,list);
        
    }

    private List<Integer> traversal (TreeNode node, List list){

          if(node==null){
            return list;
          }

          traversal(node.left,list);
          list.add(node.val);
          traversal(node.right,list);

          return list;
    }
}