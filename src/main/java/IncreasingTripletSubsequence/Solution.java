package IncreasingTripletSubsequence;

class Solution {
    public boolean increasingTriplet(int[] nums) {
        int min = Integer.MAX_VALUE;
        int mid = Integer.MAX_VALUE;

        for (int num : nums) {
            if (num <= min) {
                min = num;
            } else if (num <= mid) {
                mid = num;
            } else {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums1 = {1, 2, 3, 4, 5};
        int[] nums2 = {5, 4, 3, 2, 1};
        int[] nums3 = {2, 1, 5, 0, 4, 6};
        System.out.println(sol.increasingTriplet(nums1));  // Output: true
        System.out.println(sol.increasingTriplet(nums2));  // Output: false
        System.out.println(sol.increasingTriplet(nums3));  // Output: true
    }
}
