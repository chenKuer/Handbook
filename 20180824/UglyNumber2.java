class Solution {
  public int uglyNumber(int n) {
    int[] ugly = new int[n];
    ugly[0] = 1;
    int idx2 =0;
    int idx3 =0;
    int idx5 = 0;

    int factor2 = 2;
    int factor3 = 3;
    int factor5 = 5;

    for(int i = 1; i<n; i++){
      int min_v = Math.min(Math.min(factor2,factor3), factor5);

      ugly[i] = min_v;
      if(min_v == factor2) {
        factor2 = 2* ugly[++idx2];
      } else if(min_v == factor3) {
        factor3 = 3 * ugly[++idx3];
      } else if(min_v == factor5) {
        factor5 = 5* ugly[++idx5];
      }

    }
    return ugly[n-1];
  }
}
