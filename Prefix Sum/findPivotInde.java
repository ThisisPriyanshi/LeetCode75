class Solution {
    public int pivotIndex(int[] nums) {

        int [] prefix = new int[nums.length + 1];
        int [] suffix = new int[nums.length + 1];
        for (int i = 0; i < nums.length; i++) {
            final int rightMost = nums.length - i - 1;
            if (i >= 1) {
                prefix[i + 1] = prefix[i] + nums[i];
            }
            else {
                prefix[i + 1] = nums[i];
            }
            suffix[rightMost] = nums[rightMost] + (rightMost == nums.length - 1 ? 0 : suffix[rightMost + 1]);
        }
        int left = 0;
        while (left < nums.length) {
            if (prefix[left] == suffix[left + 1]) {
                return left;
            }
            left += 1;
        }

        return -1;

    }
}
