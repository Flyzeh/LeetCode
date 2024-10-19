class Solution {
    public boolean isPalindrome(int x) {
        String mot = Integer.toString(x);
        int n = mot.length();
        
        for (int i = 0; i < n / 2; i++) {
            if (mot.charAt(i) != mot.charAt(n - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
