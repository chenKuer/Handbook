public class BalancedBinaryTree {
  private boolean result = true;

  public boolean isBalanced(TreeNode root) {
    return maxDepth(root) != -1;

  }

  public int maxDepth(TreeNode root) {
    if(root == null ) {
      return 0;
    }
    int l = maxDepth(root.left);
    if(l == -1) return -1;
    int r = maxDepth(root.right);
    if(r == -1) return -1;

    if(Math.abs(l-r)>1) {
      return -1;
    }
    return 1+ Math.max(l,r);
  }


  // time complexity O(N)

}
