class Solution {
    public int largestAltitude(int[] gain) {

        int max = 0, curr = 0;
      for(int i : gain) {
          curr += i;
          max = Math.max(max, curr);
      }  
      return max;
    }
}
