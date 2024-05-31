package StringCompression;

class Solution {
    public int compress(char[] chars) {
        int n = chars.length;
        int write = 0, read = 0;

        while (read < n) {
            char currentChar = chars[read];
            int count = 0;

            // Count consecutive repeating characters
            while (read < n && chars[read] == currentChar) {
                read++;
                count++;
            }

            // Write the current character
            chars[write++] = currentChar;

            // Write the count if it's greater than 1
            if (count > 1) {
                String countStr = String.valueOf(count);
                for (char c : countStr.toCharArray()) {
                    chars[write++] = c;
                }
            }
        }

        return write;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        char[] chars1 = {'a', 'a', 'b', 'b', 'c', 'c', 'c'};
        char[] chars2 = {'a'};
        char[] chars3 = {'a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b'};
        System.out.println(sol.compress(chars1));  // Output: 6
        System.out.println(sol.compress(chars2));  // Output: 1
        System.out.println(sol.compress(chars3));  // Output: 4
    }
}
