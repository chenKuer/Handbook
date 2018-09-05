class Solution {

    int[] nums;
    Random rdn;
    public Solution(int[] nums) {
        this.nums = nums;
        this.rdn = new Random();
    }

    public int pick(int target) {
        int total = 0; // total number of value equals to target
        int res = -1; // index of the target

        for(int i = 0; i< nums.length; i++) {
            if(nums[i] == target) {
                int x = rdn.nextInt(++total);
                if(x==0) {
                    res = i;
                }
            }
        }
        return res;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int param_1 = obj.pick(target);
 */
