/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if(inorder.length ==0 || postorder.length == 0) return null;
        return subTree(inorder,0,inorder.length-1, postorder,0, postorder.length-1);
    }

    public TreeNode subTree(int[] inorder, int start, int end, int[] postorder, int postStart, int postEnd) {
        if(postEnd<0 || postStart>inorder.length-1 || start>end ) return null;
        TreeNode root = new TreeNode(postorder[postEnd]); // root node;
        // find in the inorder index
        int index = findIndex(inorder, postorder[postEnd], start, end);

        root.left = subTree(inorder,start,index -1, postorder,postStart, postStart+index-start-1 );
        root.right = subTree(inorder,index+1,end,postorder,postStart+index-start,postEnd-1);
        return root;
    }

    public int findIndex(int[] inorder, int target, int start, int end) {
        for(int i = start; i<=end; i++){
            if(inorder[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
