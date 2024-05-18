package codes.arrays;

// LeetCode Link : https://leetcode.com/problems/trapping-rain-water/
public class TrappingRain {

    // Approach 2 : Using Prefix Max and Suffix Max Array
    // TC : O(n)
    // SC : O(n)
    public int trap(int[] height) {
        int n = height.length;

        int[] pfm = new int[n];
        int max = 0;
        for (int i = 0; i < n; i++) {
            max = Math.max(max, height[i]);
            pfm[i] = max;
        }

        max = 0;
        int[] sfm = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            max = Math.max(max, height[i]);
            sfm[i] = max;
        }

        int waterTrapped = 0;
        for (int i = 1; i < n - 1; i++) {
            int leftMax = pfm[i - 1];
            int rightMax = sfm[i + 1];
            int water = Math.min(leftMax, rightMax) - height[i];
            if (water > 0) waterTrapped += water;
        }

        return waterTrapped;
    }

}
