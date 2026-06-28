package twopointers;


import java.util.*;

/**
 * LeetCode 11 - Container With Most Water
 *
 * Problem: Given n non-negative integers representing heights of vertical lines,
 * find two lines that, together with the x-axis, form a container that holds
 * the most water.
 *
 * Approach: Two Pointers
 * - Start with widest possible container (left = 0, right = n-1)
 * - Move the pointer with the SHORTER height inward, since the shorter
 *   line is always the limiting factor on area - keeping it can never
 *   produce a bigger area than moving past it.
 * - Track the maximum area seen at each step.
 *
 *
