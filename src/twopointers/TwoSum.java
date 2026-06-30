
 package twopointers;
 import java.util.*;

 /**
  * LeetCode 1 - Two Sum
  *
  * Problem: Given an array of integers and a target, return indices of the
  * two numbers such that they add up to the target.
  *
  * Approach: HashMap (one-pass)
  * - For each number, check if (target - number) already exists in the map.
  * - If yes, we found our pair - return their indices.
  * - If no, store the current number and its index for future lookups.
  * - This avoids the O(n^2) brute force of checking every pair.
  *
  * Time Complexity: O(n) - single pass through the array
  * Space Complexity: O(n) - HashMap can store up to n elements
  */
 public class TwoSum {

     public int[] twoSum(int[] nums, int target) {
         Map<Integer, Integer> seen = new HashMap<>(); // value -> index

         for (int i = 0; i < nums.length; i++) {
             int complement = target - nums[i];

             if (seen.containsKey(complement)) {
                 return new int[] { seen.get(complement), i };
             }

             seen.put(nums[i], i);
         }

         throw new IllegalArgumentException("No two sum solution found");
     }

     public static void main(String[] args) {
         TwoSum solution = new TwoSum();

         int[] nums1 = {2, 7, 11, 15};
         System.out.println("Test 1: " + Arrays.toString(solution.twoSum(nums1, 9))); // [0, 1]

         int[] nums2 = {3, 2, 4};
         System.out.println("Test 2: " + Arrays.toString(solution.twoSum(nums2, 6))); // [1, 2]

         int[] nums3 = {3, 3};
         System.out.println("Test 3: " + Arrays.toString(solution.twoSum(nums3, 6))); // [0, 1]
     }
 }
