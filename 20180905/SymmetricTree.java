class SymmetricTree {
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
    // recursive
    public boolean isSymmetric(TreeNode root) {
        if(root == null) return true;
        return isSym(root.left,root.right);
    }

    public boolean isSym(TreeNode left, TreeNode right) {
        if(left == null && right == null) return true;
        if(left == null || right == null) return false;
        return (left.val == right.val) && isSym(left.left, right.right) && isSym(left.right, right.left);
    }

    // Iterative
    public boolean isSymmetric(TreeNode root) {
      Queue<TreeNode> queue = new LinkedList<>();
      queue.add(root);
      queue.add(root);

      while(!queue.isEmpty()) {
        TreeNode r1 = queue.poll();
        TreeNode r2 = queue.poll();

        if(r1 == null && r2== null) continue;
        if(r1 == null || r2 == null) return false;
        if(r1.val != r2.val) return false;

        queue.add(r1.left);
        queue.add(r2.right);
        queue.add(r1.right);
        queue.add(r2.left);

      }
      return true;
    }

  }
}
