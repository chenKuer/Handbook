class Solution {
  public int searchInsert(int[] nums, int target) {
    int left = 0;
    int right = nums.length-1;

    while(left<=right) {
      int center = (left+right)/2;
      if(target==nums[center]) return center;
      if(target>nums[center]) {
        left = center+1;
      } else {
        right = center - 1;
      }
    }
    return left;

  }
}
