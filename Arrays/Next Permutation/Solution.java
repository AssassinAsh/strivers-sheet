// Given an array of integers nums, find the next permutation of nums.

import java.util.Arrays;

class Solution {
    public void nextPermutation(int[] nums) {
        int i = nums.length - 2;
        
        // Find the index of the pivot element.
        while(i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }

        if(i < 0) {
            // Revere the whole array if first element is pivot element i.e. the array is sorted in descending order.
            reverse(0, nums.length - 1, nums);
        } else {
            int j = nums.length - 1;

            // Fins the index of the next greated elemenent to the pivot element.
            while(j > i && nums[j] <= nums[i]) {
                j--;
            }
            
            swap(i, j, nums);

            reverse(i + 1, nums.length - 1, nums);
        }
    }

    // swap - swaps two elements.
    private void swap(int i, int j, int[] nums) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    // reverse - reverses the subarray.
    private void reverse(int i, int j, int[] nums) {
        while(i < j) {
            swap(i, j, nums);
            i++; j--;
        }
    }

    public static void main(String[] args) {
            int[] nums = {1, 2, 4, 3, 5};
            new Solution().nextPermutation(nums);
            System.out.println(Arrays.toString(nums));
        }
}   