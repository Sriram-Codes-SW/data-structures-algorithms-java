package arrays_and_hashing;

import java.util.HashMap;
import java.util.Map;

/**
 * Problem: LeetCode 1 - Two Sum
 * Pattern: Arrays & Hashing
 *
 * Time Complexity: O(N) — Single pass iteration through the array.
 *                   HashMap lookups and insertions operate in O(1) time on average.
 * Space Complexity: O(N) — In the worst-case scenario (the target complement is
 *                    at the very end), the map stores N - 1 elements.
 */
public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        // Edge case validation boundaries
        if (nums == null || nums.length < 2) {
            return new int[]{};
        }

        // Map to store value-to-index pairs: Key = Number value, Value = Index in array
        Map<Integer, Integer> complementMap = new HashMap<>();

        for (int currentIndex = 0; currentIndex < nums.length; currentIndex++) {
            int currentNum = nums[currentIndex];
            int requiredComplement = target - currentNum;

            // Single-pass optimization check: lookup the complement before adding the value
            if (complementMap.containsKey(requiredComplement)) {
                return new int[]{complementMap.get(requiredComplement), currentIndex};
            }

            // Store current number with its unique index allocation
            complementMap.put(currentNum, currentIndex);
        }

        return new int[]{}; // Return empty array if no matching pair fulfills the constraint
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = new TwoSum().twoSum(nums, target);
        System.out.println("Input: " + java.util.Arrays.toString(nums) + ", target = " + target);
        System.out.println("Indices: " + java.util.Arrays.toString(result));
    }
}