package ProductofArrayExceptSelf;

import java.util.Arrays;

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;

        // Initialize arrays to store prefix and suffix products
        int[] prefixProducts = new int[n];
        int[] suffixProducts = new int[n];

        // Calculate prefix products
        prefixProducts[0] = 1;
        for (int i = 1; i < n; i++) {
            prefixProducts[i] = prefixProducts[i - 1] * nums[i - 1];
        }

        // Calculate suffix products
        suffixProducts[n - 1] = 1;
        for (int i = n - 2; i >= 0; i--) {
            suffixProducts[i] = suffixProducts[i + 1] * nums[i + 1];
        }

        // Combine prefix and suffix products to get the final result
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = prefixProducts[i] * suffixProducts[i];
        }

        return result;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums1 = {1, 2, 3, 4};
        int[] nums2 = {-1, 1, 0, -3, 3};
        System.out.println(Arrays.toString(sol.productExceptSelf(nums1)));  // Output: [24,12,8,6]
        System.out.println(Arrays.toString(sol.productExceptSelf(nums2)));  // Output: [0,0,9,0,0]
    }
}
