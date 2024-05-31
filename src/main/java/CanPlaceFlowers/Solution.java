package CanPlaceFlowers;

class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int length = flowerbed.length;

        for (int i = 0; i < length; i++) {
            // Check if the current plot is empty
            if (flowerbed[i] == 0) {
                // Check if the previous and next plots are empty or out of bounds
                boolean prevEmpty = (i == 0) || (flowerbed[i - 1] == 0);
                boolean nextEmpty = (i == length - 1) || (flowerbed[i + 1] == 0);

                if (prevEmpty && nextEmpty) {
                    // Plant a flower here
                    flowerbed[i] = 1;
                    n--;

                    // If we have planted all required flowers, return true
                    if (n == 0) {
                        return true;
                    }
                }
            }
        }

        // If we have not planted all required flowers, return false
        return n <= 0;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] flowerbed1 = {1, 0, 0, 0, 1};
        int n1 = 1;
        System.out.println(sol.canPlaceFlowers(flowerbed1, n1));  // Output: true

        int[] flowerbed2 = {1, 0, 0, 0, 1};
        int n2 = 2;
        System.out.println(sol.canPlaceFlowers(flowerbed2, n2));  // Output: false
    }
}
