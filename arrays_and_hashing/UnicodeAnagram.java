package arrays_and_hashing;

/**
 * LeetCode 242 - Valid Anagram
 * https://leetcode.com/problems/valid-anagram/
 *
 * Approach: Using two maps to store characters and their counts and checking for valid Anagram
 *
 * Time Complexity: O(n)
 *  * Space Complexity: O(k) — O(1) if alphabet is fixed (e.g. a-z), O(n) worst case for Unicode
 */

class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.equals(t)){
            return true;
        }
        else if(s.length() != t.length()){
            return false;
        }
        else {
            Map<Character, Integer> countMapS= new HashMap<>();
            Map<Character, Integer> countMapT= new HashMap<>();
            for(int i= 0; i < s.length(); i++){
                char charAtIndexForS= s.charAt(i);
                char charAtIndexForT= t.charAt(i);

                 if(countMapS.containsKey(charAtIndexForS)){
                     countMapS.put(charAtIndexForS, countMapS.get(charAtIndexForS)+1);
                 }
                 else{
                     countMapS.put(charAtIndexForS, 1);
                 }
                 if(countMapT.containsKey(charAtIndexForT)){
                     countMapT.put(charAtIndexForT, countMapT.get(charAtIndexForT)+1);
                 }
                 else{
                     countMapT.put(charAtIndexForT, 1);
                 }
            }
            for(Character c: countMapS.keySet()){
                if(countMapT.get(c) == null){
                    return false;
                }
                else if(!countMapS.get(c).equals(countMapT.get(c))){
                    return false;
                }
            }
            return true;
        }
    }
}