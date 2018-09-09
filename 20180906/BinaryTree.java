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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if(preorder.length ==0 || inorder.length ==0) return null;
        // preorder first element is the root, then find in the
        return subTree(preorder, 0, preorder.length-1,inorder,0, inorder.length-1);

    }

    public TreeNode subTree(int[] preorder, int preStart,int preEnd, int[] inorder, int inStart, int inEnd) {
        if(preEnd-preStart<0 || inEnd-inStart <0 ) return null;
        TreeNode root = new TreeNode(preorder[preStart]);
        int midIndex = findIndex(inorder, preorder[preStart], inStart, inEnd); // at inorder
        root.left = subTree(preorder, preStart+1, preStart+ midIndex-inStart,inorder, inStart, midIndex-1);
        root.right = subTree(preorder, preStart+midIndex-inStart+1,preEnd,inorder, midIndex+1,inEnd);
        return root;

    }

    // find the index in inorder
    public int findIndex(int[] inorder, int target, int inStart,int inEnd) {
        for(int i = inStart; i<= inEnd; i++) {
            if(inorder[i] == target) {
                return i;
            }
        }
        return -1;
    }

}
