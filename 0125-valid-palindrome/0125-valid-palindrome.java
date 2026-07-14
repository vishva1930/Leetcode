class Solution {
    public boolean isPalindrome(String s) {
        String str = "";

        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);

            if (Character.isLetterOrDigit(a)) {
                str = str + Character.toLowerCase(a);
            }
        }

        String str2 = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            str2 = str2 + str.charAt(i);
        }

        return str.equals(str2);
    }
}