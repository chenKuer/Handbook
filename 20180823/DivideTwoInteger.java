class Solution {
    public int divide(int dividend, int divisor) {

        long ldividend = Math.abs((long) dividend);
        long ldivisor = Math.abs((long) divisor);

        if(ldividend<ldivisor || ldividend ==0) return 0;
        if(ldivisor==0) return Integer.MAX_VALUE;

        int sign =1;
        if((dividend<0 && divisor>0) || (dividend>0 && divisor<0)) {
            sign = -1;
        }

        long ans = 0;

        ans = ldivide(ldividend, ldivisor);

        ans = sign* ans;

        if(ans>Integer.MAX_VALUE || ans<Integer.MIN_VALUE ) {
            return Integer.MAX_VALUE;
        }
        return (int)ans;

    }

    public long ldivide(long ldividend, long ldivisor) {
        if(ldividend<ldivisor) return 0;

        long sum = ldivisor;
        long multiply = 1;
        while(sum+ sum <= ldividend) {
            sum+= sum;
            multiply +=multiply;
        }

        return multiply+ ldivide(ldividend-sum, ldivisor);
    }
}
