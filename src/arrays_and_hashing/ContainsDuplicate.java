package arrays_and_hashing;

import java.util.HashSet;
import java.util.Set;

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
public class ContainsDuplicate {
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

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        boolean result = new ContainsDuplicate().containsDuplicate(nums);
        System.out.println("Input: " + java.util.Arrays.toString(nums));
        System.out.println("Contains Duplicate: " + result);
    }
}