class Solution {
   public TreeNode convertArrayToBST(int[] nums) {
      if(nums.length == 0) return null;
      return
   }

   public TreeNode convert(int[] nums, int start, int end) {
     if(start>end) return null;
     int mid = (start+end) /2;
     TreeNode node = new TreeNode(nums[mid]);
     node.left = convert(nums, start, mid-1);
     node.right = convert(nums,mid+1, end);

     return node;
   }
}
