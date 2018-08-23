class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()) return false;
        int[] s1_sum = new int[26];
        int[] s2_sum = new int[26];
        for(int i =0; i< s1.length(); i++) {
            s1_sum[s1.charAt(i)-'a']++;
            s2_sum[s2.charAt(i) - 'a']++;
        }
        for(int j = 0; j< s2.length()- s1.length(); j++ ){
            if(matches(s1_sum, s2_sum)) {
                return true;
            } else {
                s2_sum[s2.charAt(j)-'a']--;
                s2_sum[s2.charAt(s1.length()+j) - 'a']++;
            }
        }
        return matches(s1_sum,s2_sum);

    }

    public boolean matches(int[] s1, int[] s2) {
        for(int i =0; i<26;i++){
            if(s1[i]!=s2[i]) return false;
        }
        return true;
    }

    // solution two
    // optimized sliding window
    public boolean permutation(String s1, String s2) {
      if(s1.length()>s2.length()) return false;
      int s1_sum[] = new int[26];
      int s2_sum[] = new int[26];
      // initiate the sliding window
      for(int i =0; i< s1.length(); i++){
        s1_sum[s1.charAt(i)-'a']++;
        s2_sum[s2.charAt(i) - 'a']++;
      }
      int count = 0;
      for(int i = 0; i< 26; i++){
        if(s1_sum[i] == s2_sum[i]){
          count++;
        }
      }
      for(int j = 0; j<s2.length()-s1.length();j++) {
        int left = s2.charAt(j)-'a';
        int right = s2.charAt(j+s1.length()) - 'a';
        if(count == 26) return true;

        s2_sum[right]++;
        if(s2_sum[right] == s1_sum[right]){
          count++;
        } else if(s2_sum[right] = s1_sum[right]+1 ) {
          count--;
        }
        s2_sum[left]--;
        if(s2_sum[left]==s1_sum[left]) {
          count++;
        } else if(s2_sum[left] = s1_sum[left]-1){
          count--;
        }



      }
      return count==26;
    }

}
