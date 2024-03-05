class Solution {
    public int minimumLength(String s) {
        int i = 0;
        int j = s.length() - 1;

        while (i < j && s.charAt(i) == s.charAt(j)) {
            char currentChar = s.charAt(i);

            while (i <= j && s.charAt(i) == currentChar)
                i++;

            while (i <= j && s.charAt(j) == currentChar)
                j--;
        }

        return j - i + 1;
    }
}
