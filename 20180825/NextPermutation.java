class NextPermutation{
  public void nextPermutation(int[] nums) {
    int i = nums.length -2;
    while(i >=0 && nums[i+1]<=nums[i]) {
      i--;
    }
    int start = i;
    int end = 0;
    if(i>=0) {
      for(int j = nums.length -1; j>start; j--) {
        if(nums[start]>nums[j]) {
          end = j;
          break;
        }
      }
      swap(nums, start, end);
    }
    reverse(nums,start+1);
  }

  public void swap(int[] nums, int start, int end){
    int temp = nums[start];
    nums[start] = nums[end];
    nums[end] = temp;

  }

  public void reverse(int[] nums, int start) {
    int right = nums.length -1;
    int left = start;
    while(left<right) {
      swap(nums, left,right);
      left++;
      right--;
    }
  }
}
