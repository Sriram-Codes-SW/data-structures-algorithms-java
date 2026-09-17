package arrays_and_hashing;

/**
 * LeetCode 242 - Valid Anagram
 * https://leetcode.com/problems/valid-anagram/
 *
 * Approach: Fixed-size array of 26 counters (one per lowercase letter a-z).
 * Increment for each char in s, decrement for each char in t, then check
 * all counts are zero. Assumes input is lowercase English letters only.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1) — fixed 26-element array, independent of input size
 */

public class LowercaseEnglishAlphabetAnagram {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] countArray = new int[26];
        for (int i = 0; i < s.length(); i++) {
            countArray[s.charAt(i) - 'a']++;
            countArray[t.charAt(i) - 'a']--;
        }

        for (int count : countArray) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        boolean result = new LowercaseEnglishAlphabetAnagram().isAnagram(s, t);
        System.out.println("s = \"" + s + "\", t = \"" + t + "\"");
        System.out.println("Is Anagram: " + result);
    }
}