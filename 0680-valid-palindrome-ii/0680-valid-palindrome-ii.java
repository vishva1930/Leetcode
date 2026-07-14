class Solution {
    public boolean validPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {

            // If characters don't match
            if (s.charAt(left) != s.charAt(right)) {

                // Either skip the left character or skip the right character
                return isPalindrome(s, left + 1, right) ||
                       isPalindrome(s, left, right - 1);
            }

            left++;
            right--;
        }

        return true;
    }

    // Check if substring s[left...right] is a palindrome
    public boolean isPalindrome(String s, int left, int right) {

        while (left < right) {

            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}