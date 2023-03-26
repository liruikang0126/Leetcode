package Running_Sum_of_1D_Array_1480;

public class Solution {
    /*
    Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
    Return the running sum of nums.

    Example 1:
    Input: nums = [1,2,3,4]
    Output: [1,3,6,10]
    Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
     */
    public static int[] runningSum(int[] nums) {
        int sum[] = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                sum[0] = nums[0];
            } else {
                sum[i] = sum[i - 1] + nums[i];
            }
        }
        return sum;
    }
}
