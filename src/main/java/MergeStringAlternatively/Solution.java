package MergeStringAlternatively;

class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder merged = new StringBuilder();
        int i = 0, j = 0;

        // Use a loop to go through both strings simultaneously
        while (i < word1.length() && j < word2.length()) {
            merged.append(word1.charAt(i));
            merged.append(word2.charAt(j));
            i++;
            j++;
        }

        // If there are remaining characters in word1, append them
        while (i < word1.length()) {
            merged.append(word1.charAt(i));
            i++;
        }

        // If there are remaining characters in word2, append them
        while (j < word2.length()) {
            merged.append(word2.charAt(j));
            j++;
        }

        // Convert the StringBuilder to a String and return it
        return merged.toString();
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String word1 = "abc";
        String word2 = "pqr";
        System.out.println(sol.mergeAlternately(word1, word2));  // Output: "apbqcr"
    }
}
