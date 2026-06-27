package twopointers;
import java.util.*;

/**
 * LeetCode 49 - Group Anagrams
 *
 * Problem: Given an array of strings, group the anagrams together.
 * Approach: Sort each string's characters to create a "key".
 * Anagrams will always produce the same sorted key,
 * so we can group them using a HashMap.
 *
 * Time Complexity: O(n * k log k) -> n = number of strings, k = avg string length
 * Space Complexity: O(n * k)
 */
public class GroupAnagrams {

    public static List<List<String>> groupAnagrams(String[] strs) {
        // Map: sorted-string-key -> list of original strings
        Map<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            // Convert string to char array and sort it
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);

            // If key doesn't exist yet, create a new list
            map.putIfAbsent(key, new ArrayList<>());

            // Add the original string to its anagram group
            map.get(key).add(str);
        }

        // Return all grouped lists as a single List<List<String>>
        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        String[] input = {"eat", "tea", "tan", "ate", "nat", "bat"};

        List<List<String>> result = groupAnagrams(input);

        System.out.println("Grouped Anagrams:");
        for (List<String> group : result) {
            System.out.println(group);
        }
    }
}