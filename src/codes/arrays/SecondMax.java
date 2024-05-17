package codes.arrays;

// GFG Link : https://www.geeksforgeeks.org/problems/second-largest3735/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=bottom_sticky_on_article
public class SecondMax {

    // TC : O(n)
    // SC : O(1)
    int print2largest(int arr[], int n) {
        int m = arr.length;

        int max = 0;
        int secondMax = 0;
        for (int i = 0; i < m; i++) {
            if (max < arr[i]) {
                secondMax = max;
                max = arr[i];
            } else if (secondMax < arr[i] && max != secondMax) {
                secondMax = arr[i];
            }
        }

        return secondMax;
    }
}
