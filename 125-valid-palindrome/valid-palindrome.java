
class Solution {
    public boolean isPalindrome(String s) {

        StringBuilder sb = new StringBuilder();

        for(char c : s.toCharArray()) {

            if(Character.isLetterOrDigit(c)) {
                sb.append(Character.toLowerCase(c));
            }
        }

        String original = sb.toString();

        sb.reverse();

        return original.equals(sb.toString());
    }
}
