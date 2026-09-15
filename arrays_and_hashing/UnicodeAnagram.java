package arrays_and_hashing;

/**
 * LeetCode 242 - Valid Anagram
 * https://leetcode.com/problems/valid-anagram/
 *
 * Approach: Using a single map to count character frequencies from s (increment)
 * and t (decrement), then checking all counts net to zero.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(k) — O(1) if alphabet is fixed (e.g. a-z), O(n) worst case for Unicode
 */

class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        else {
            Map<Character, Integer> countMap= new HashMap<>();
            for(char c : s.toCharArray()) {
                countMap.merge(c, 1, Integer::sum);
            }
            for(char c : t.toCharArray()) {
                countMap.merge(c, -1, Integer::sum);
            }

            for(int charCount: countMap.values()) {
                if(charCount != 0) {
                    return false;
                }
            }
            return true;
        }
    }
}