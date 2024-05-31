package ReverseVowelsofString;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public String reverseVowels(String s) {
        // Define a set of vowels for quick lookup
        Set<Character> vowels = new HashSet<>();
        vowels.add('a'); vowels.add('e'); vowels.add('i'); vowels.add('o'); vowels.add('u');
        vowels.add('A'); vowels.add('E'); vowels.add('I'); vowels.add('O'); vowels.add('U');

        // Convert the string to a char array for in-place modification
        char[] chars = s.toCharArray();
        int left = 0, right = chars.length - 1;

        // Two-pointer technique to reverse the vowels
        while (left < right) {
            // Move the left pointer until a vowel is found
            while (left < right && !vowels.contains(chars[left])) {
                left++;
            }
            // Move the right pointer until a vowel is found
            while (left < right && !vowels.contains(chars[right])) {
                right--;
            }
            // Swap the vowels
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;

            // Move the pointers inward
            left++;
            right--;
        }

        // Convert the char array back to a string and return
        return new String(chars);
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.reverseVowels("hello"));  // Output: "holle"
        System.out.println(sol.reverseVowels("leetcode"));  // Output: "leotcede"
    }
}
