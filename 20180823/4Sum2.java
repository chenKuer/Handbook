class Solution {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        int res =0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i =0; i< A.length;i++){
            for(int j =0; j< B.length; j++){
                int sum = A[i] +B[j];
                map.put(sum, map.getOrDefault(sum,0)+1);
            }
        }

        for(int i = 0; i<C.length; i++){
            for(int j= 0; j< D.length; j++) {
                res += map.getOrDefault(-1*(C[i]+D[j]),0);
            }
        }
        return res;
    }
}
