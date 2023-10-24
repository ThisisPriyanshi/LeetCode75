import java.util.Arrays;

public class productOfArrayExceptSelf {
    //https://leetcode.com/problems/product-of-array-except-self/?

    public int[] productExceptSelf(int[] nums) {

        int n = nums.length;
        int[] ans = new int[n];
        Arrays.fill(ans, 1);

        int curr = 1;

        for(int i = 0; i <n; i++) //for suffix prod
        {
            ans[i] *= curr;
            curr *= nums[i];
        }

        curr = 1;
        for(int j = n-1; j>= 0; j--) // prefix prod
        {
            ans[j] *= curr;
            curr *= nums[j];
        }

        return ans;
    }
}
