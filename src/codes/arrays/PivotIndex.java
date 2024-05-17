package codes.arrays;

// LeetCode Link : https://leetcode.com/problems/find-pivot-index/description/
public class PivotIndex {
    // Approach 1 : Brute Force
    // TC : O(n^2)
    // SC : O(1)
    public int pivotIndex1(int[] nums) {
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int leftSum = 0;
            for (int j = 0; j < i; j++) leftSum += nums[j];
            int rightSum = 0;
            for (int k = i + 1; k < n; k++) rightSum += nums[k];
            if (leftSum == rightSum) return i;
        }

        return -1;
    }

    // Approach 2 : Using Prefix and Suffix Sum
    // TC : O(n)
    // SC : O(n)
    public int pivotIndex2(int[] nums) {
        int n = nums.length;

        int[] pfs = new int[n];
        pfs[0] = nums[0];
        for (int i = 1; i < n; i++) {
            pfs[i] = pfs[i - 1] + nums[i];
        }

        int[] sfs = new int[n];
        sfs[n - 1] = nums[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            sfs[i] = sfs[i + 1] + nums[i];
        }

        for (int i = 0; i < n; i++) {
            int ls = 0;
            if (i > 0) ls = pfs[i - 1];
            int rs = 0;
            if (i < n - 1) rs = sfs[i + 1];
            if (ls == rs) return i;
        }

        return -1;
    }

    // Approach 3 : Updating the Input Array to Prefix Sum Array
    // TC : O(n)
    // SC : O(1)
    public int pivotIndex3(int[] nums) {
        int n = nums.length;

        for (int i = 1; i < n; i++)
            nums[i] = nums[i - 1] + nums[i];

        for (int i = 0; i < n; i++) {
            int ls = 0;
            if (i > 0) ls = nums[i - 1];
            int rs = 0;
            if (i < n - 1) rs = nums[n - 1] - nums[i];
            if (ls == rs) return i;
        }

        return -1;
    }
}
