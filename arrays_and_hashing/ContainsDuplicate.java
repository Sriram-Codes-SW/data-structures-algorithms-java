package arrays_and_hashing;

/**
 * LeetCode 217 - Contains Duplicate
 * https://leetcode.com/problems/contains-duplicate/
 *
 * Approach: Two passes over the data using loops. If the second loop finds it, it is a duplicate.
 *
 * Time Complexity: O(n^2) - two passes, O(n) per pass
 * Space Complexity: O(1) - No extra data structures were used
 */
class Solution {
    public boolean containsDuplicate(int[] nums) {
        for(int i = 0; i < nums.length;i++) {
         int temp= nums[i];
         for(int j= 0; j < nums.length;j++){
             if(j != i && nums[j] == temp){
                 return true;
             }
         }
        }
        return false;
    }
}
