// Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.

// We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

import java.util.Arrays;

class Solution {

    public void sortColors(int[] nums) {
        
        // Array to count the number of colors
        int[] colorCount = new int[3];

        // Filling colorCount based on the nums arr
        for(int i : nums) {
            colorCount[i]++;
        }

        int index = 0, color = 0;

        while(index < nums.length) {
            while(colorCount[color] == 0) {
                color++;
            }

            nums[index++] = color;

            colorCount[color]--;
        }
    }

    public static void main(String[] args) {    
                int[] nums = {2,0,2,1,1,0};
                new Solution().sortColors(nums);
                System.out.println(Arrays.toString(nums));
    }
}