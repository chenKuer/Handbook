// facebooks
// To find the sum of hamming distance
// no more than 32 bits
// input
// 通过统计所有数字中每一位bit上有多少个1， 可以知道有多少个0. 通过排列组合
可以得到有多少种可能性 (n-k)*k
int[0] = '1101'
int[1] = '01';

public class Solution{
  public int sumHam(int[] nums) {
    int n = nums.length;
    int sum =0;
    for(int i =0;i<32;i++) {
      int count = 0;
      for(int j=0; j< nums.length; j++) {
        if(nums[j] % 2 != 0){
          count++;
        }
      }
      sum = sum + count*(n-count);
    }
    return sum;
  }
}


// Roatate a k number of Array
public int[] rotate(int[] nums, int k) {
  if(nums==null||nums.length == 0) return null;
  if(k>nums.length) return nums;
  // reverse the whole Array
  // then reverse the k, and the len-k
  reverse(nums,0,nums.length-1);
  reverse(nums,0,k);
  reverse(nums,k+1,nums.length-1);
  return nums;

}

// reverse in Array
/*
* start from start index, end at end index
*/
public int[] reverse(int[] nums, int start, int end) {
  int temp;
  while(start<end) {
    temp = nums[start];
    nums[start] = nums[end];
    nums[end] = temp;
    start++;
    end--;
  }
  return nums;
}
