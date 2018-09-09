public class Solution {

    public String solve(String s) {
        StringBuilder sb = new StringBuilder();
        boolean isCap = false;
       for(int i = 0; i< s.length(); i++) {
           char ch = s.charAt(i);

           if(ch == 'A' || ch == 'a') {
               // change to uppercase
               isCap = !isCap;
               continue;
           }

          if(ch>='a' && ch<='z' && isCap){
               ch -=32;
               sb.append(ch);
           } else {
               sb.append(ch);
           }
       }
       return sb.toString();
    }
  }
