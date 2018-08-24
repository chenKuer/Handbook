class Solution {
    int len = 0;
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        len = nums.length;
        Arrays.sort(nums); // 需要先排序
        result = kSum(nums,target, 4, 0);
        return result;
    }

    public List<List<Integer>> kSum(int[] nums, int target, int k,int index){
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if(k>len) return res;
        if(k==2) {
            int l = index;
            int r = len-1;
            // two sum;

            while(l<r) {
                if(nums[l]+nums[r] == target) {
                    List<Integer> temp = new ArrayList<Integer>();
                    temp.add(nums[l]);
                    temp.add(nums[r]);
                    res.add(temp);
                    while(l<r && nums[l] == nums[l+1]) l++;
                    while(l<r && nums[r] == nums[r-1]) r--;
                    l++;
                    r--;
                } else if(nums[l] + nums[r] > target) {
                    r--;
                } else {
                    l++;
                }
            }
        }else {
            // k > 2

            for(int i = index;i<len;i++){

                // remove duplicate
                if(i==index || nums[i] != nums[i-1]) {
                    List<List<Integer>> res3 = kSum(nums, target-nums[i],k-1,i+1);
                    for(List<Integer> t: res3) {
                        t.add(0,nums[i]);
                        res.add(t);
                    }
                }
            }
        }
        return res;
    }
}
