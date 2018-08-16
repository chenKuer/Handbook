class Solution {

    // force brute
    public int strStr(String haystack, String needle) {
        if(needle==null || haystack==null || needle.length()==0 ) return 0;
        if(haystack.length() < needle.length()) return -1;
        if(haystack.length() == needle.length()) {
            if(haystack.equals(needle)) {
                return 0;
            }
            else {
                return -1;
            }
        }

        for(int i = 0;i<haystack.length();i++) {
            for(int j = 0; j<needle.length(); j++) {
                if(i+j < haystack.length() && haystack.charAt(i+j)==needle.charAt(j)) {
                    if(j == needle.length()-1) {
                        return i;
                    }
                } else {
                    break;
                }

            }
        }

        return -1;        
    }
}
