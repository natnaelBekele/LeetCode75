package ReverseWordsinaString;

class Solution {
    public String reverseWords(String s) {
        // Trim leading and trailing spaces
        s = s.trim();

        // Split the input string into an array of words
        String[] words = s.split("\\s+");

        // Reverse the array of words
        StringBuilder sb = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]);
            if (i > 0) {
                sb.append(" ");
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String s1 = "the sky is blue";
        String s2 = "  hello world  ";
        String s3 = "a good   example";
        System.out.println(sol.reverseWords(s1));  // Output: "blue is sky the"
        System.out.println(sol.reverseWords(s2));  // Output: "world hello"
        System.out.println(sol.reverseWords(s3));  // Output: "example good a"
    }
}
