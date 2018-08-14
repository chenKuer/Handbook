class Solution {
    public int removeElement(int[] nums, int val) {
        int index = nums.length-1;
        for (int i = 0; i <= index; i++) {
            if(val == nums[i]){
                //swap
                nums[i] = nums[index];
                nums[index] = val;
                index--;
                i--;
            }
        }
        return index+1;
    }
}
