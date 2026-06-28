
 package twopointers;

 import java.util.*;


public class ContainerWithMostWater {

    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;

        while (left < right) {
            int width = right - left;
            int currentHeight = Math.min(height[left], height[right]);
            int currentArea = width * currentHeight;

            maxArea = Math.max(maxArea, currentArea);

            // Move the pointer at the shorter line inward
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }

    public static void main(String[] args) {
        ContainerWithMostWater solution = new ContainerWithMostWater();

        int[] heights1 = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println("Test 1: " + solution.maxArea(heights1)); // Expected: 49

        int[] heights2 = {1, 1};
        System.out.println("Test 2: " + solution.maxArea(heights2)); // Expected: 1

        int[] heights3 = {4, 3, 2, 1, 4};
        System.out.println("Test 3: " + solution.maxArea(heights3)); // Expected: 16
    }
}