package arrays_and_hashing;

/**
 * LeetCode 217 - Contains Duplicate
 * https://leetcode.com/problems/contains-duplicate/
 *
 * Approach: Space Time TradeOff using HashSet for O(1) insertion and access
 *           and checking HashSet add() return value
 *
 * Time Complexity: O(n) - Single Pass
 * Space Complexity: O(n) - No extra data structures were used
 */
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> notDuplicate= new HashSet<Integer>();
        for(int i= 0; i < nums.length;i++){
            //Check the add method return value to determine duplicate
            if(!notDuplicate.add(nums[i])){
                return true;
            }
        }
        return false;
    }
}