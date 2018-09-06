class MaximumPathSum{
  private int maxValue = Integer.MIN_VALUE;
  public int maxPathSum(TreeNode root) {
    maxV(root);
    return maxValue;
  }

  public int maxVal(TreeNode root) {
    if(root == null) return 0;
    int left = Math.max(0,maxVal(root.left));
    int right = Math.max(0,maxVal(root.right));

    maxValue = Math.max(maxValue, left +root.val+right);
    return root.val+Math.max(left,right);
  }
}
