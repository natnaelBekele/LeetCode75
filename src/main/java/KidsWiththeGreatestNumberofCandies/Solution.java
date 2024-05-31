package KidsWiththeGreatestNumberofCandies;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        // Step 1: Find the maximum number of candies any kid currently has
        int maxCandies = 0;
        for (int candy : candies) {
            if (candy > maxCandies) {
                maxCandies = candy;
            }
        }

        // Step 2: Determine if giving the extraCandies to each kid will make their total
        // greater than or equal to the maximum number of candies.
        List<Boolean> result = new ArrayList<>();
        for (int candy : candies) {
            result.add(candy + extraCandies >= maxCandies);
        }

        // Step 3: Return the result
        return result;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] candies = {2, 3, 5, 1, 3};
        int extraCandies = 3;
        System.out.println(sol.kidsWithCandies(candies, extraCandies));  // Output: [true, true, true, false, true]
    }
}
