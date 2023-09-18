/*
 * Given the root of a binary tree, return the level order traversal of its nodes' values.
 *  (i.e., from left to right, level by level).
 */

// This is naive Solution not optimal one
import java.util.ArrayList;
import java.util.List;

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
        List<List<Integer>> list =new  ArrayList<List<Integer>>();
        System.out.println(height(root));
        for(int i=0;i<height(root);i++)
        {
            List<Integer> list1;
            list1=kDistance(root,i,new ArrayList<Integer>());
            System.out.println(list1);
            list.add(list1);
        }
        return list;
        
    }
    public int height(TreeNode root)
    {
        if(root==null)
         return 0;
        else
         return 1+Math.max(height(root.left),height(root.right));
    }
    public List<Integer> kDistance(TreeNode root,int k,List<Integer> list)
    {
        if(root!=null)
        {
            if(k==0)
             list.add(root.val);
            else
            {
              kDistance(root.left,k-1,list);
              kDistance(root.right,k-1,list);

            }
        }
        return list;
    }
}