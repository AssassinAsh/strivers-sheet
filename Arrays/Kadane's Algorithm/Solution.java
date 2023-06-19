// Given an integer array nums, find the subarray with the largest sum, and return its sum.

class Solution {
    public int maxSubArray(int[] nums) {
        int curr = 0, res = nums[0];

        for(int ele : nums) {

            // Check if current element summed with current sum is positive.
            if(ele + curr > 0) {
                curr = Math.max(ele, ele + curr);
            } else {
                curr = ele;
            }

            res = Math.max(curr, res);
        }

        return res;
    }

    public static void main(String[] args) {
            int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
            System.out.println(new Solution().maxSubArray(nums));
        }
}