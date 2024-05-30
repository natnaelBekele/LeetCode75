package GCDofString;

class Solution {
    public String gcdOfStrings(String str1, String str2) {
        // If concatenating str1 and str2 in different orders doesn't produce the same result,
        // there is no common divisor string.
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }

        // Find the greatest common divisor of the lengths of the two strings
        int gcdLength = gcd(str1.length(), str2.length());

        // The greatest common divisor string is the prefix of str1 up to gcdLength
        return str1.substring(0, gcdLength);
    }

    // Helper method to find the greatest common divisor using Euclid's algorithm
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String str1 = "ABCABC";
        String str2 = "ABC";
        System.out.println(sol.gcdOfStrings(str1, str2));  // Output: "ABC"

        str1 = "ABABAB";
        str2 = "ABAB";
        System.out.println(sol.gcdOfStrings(str1, str2));  // Output: "AB"

        str1 = "LEET";
        str2 = "CODE";
        System.out.println(sol.gcdOfStrings(str1, str2));  // Output: ""
    }
}
