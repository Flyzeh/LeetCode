class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> lettre = new HashSet<>();
        int result = 0;
        int left = 0; 

        for (int right = 0; right < s.length(); right++) {
            while (lettre.contains(s.charAt(right))) {
                lettre.remove(s.charAt(left)); 
                left++; 
            }
            lettre.add(s.charAt(right));
            result = Math.max(result, lettre.size());
        }
        return result;
    }
}
