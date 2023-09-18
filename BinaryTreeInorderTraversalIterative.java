import java.util.ArrayList;
import java.util.List;
import java.util.Stack;


 // Definition for a binary tree node.
   class TreeNode {
     int val;
      TreeNode left;
     TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
         this.left = left;
          this.right = right;
      }
  }
 
 /*   Iterative  Solution   */
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        
        List<Integer> list=new ArrayList<Integer> ();
        Stack<TreeNode> stack=new Stack<TreeNode>();
        while(root!=null || !stack.isEmpty())
        {
            while(root!=null)
            {
                stack.push(root);
                root=root.left;
            }
            TreeNode temp=stack.pop();
            list.add(temp.val);
            root=temp.right;
        }
        return list;

    }
}