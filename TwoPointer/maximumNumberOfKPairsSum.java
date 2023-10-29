class Solution {
  //https://leetcode.com/problems/max-number-of-k-sum-pairs
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        
        int p1 = 0;
        int p2 = nums.length - 1;
        int op = 0;

        while(p1 < p2)
        {
            if( nums[p1] + nums[p2] == k) //if sum is equal we move both pointers
            {
                op++;
                p1++;
                p2--;
            }

            else if ( nums[p1] + nums[p2] < k) //if sum is less than k we need larger number so we move p1 ahead( sorted array)
            p1++;

            else
            p2--; //else we need a smaller number so we move p2 ahead
        }

        return op;
    }
}
