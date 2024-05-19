package codes.Arrays;

// LeetCode Link : https://leetcode.com/problems/trapping-rain-water/
public class TrappingRain {

    // Approach 1 : Brute Force
    // TC : O(n^2)
    // SC : O(1)
    public int trap1(int[] height) {
        int n = height.length;

        int waterTrapped = 0;
        for (int i = 1; i < n - 1; i++) {
            int leftMax = 0;
            for (int j = 0; j < i; j++) {
                leftMax = Math.max(leftMax, height[j]);
            }
            int rightMax = 0;
            for (int k = i + 1; k < n; k++) {
                rightMax = Math.max(rightMax, height[k]);
            }
            int water = Math.min(leftMax, rightMax) - height[i];
            if (water > 0) waterTrapped += water;
        }

        return waterTrapped;
    }

    // Approach 2 : Using Prefix Max and Suffix Max Array
    // TC : O(n)
    // SC : O(n)
    public int trap2(int[] height) {
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
