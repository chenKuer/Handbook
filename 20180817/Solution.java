class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int n = s.length();
        int half = n/2;

        for (int len = 1; len<= half; len++) {
            // must to be divided by length of the substring
            if(n%len ==0){
                for(int j = len; j< n; j++) {
                    if(s.charAt(j) != s.charAt(j%len)) {
                        break;
                    }
                    if(j == n-1) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
