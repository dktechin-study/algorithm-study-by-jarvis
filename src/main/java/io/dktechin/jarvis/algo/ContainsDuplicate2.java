package io.dktechin.jarvis.algo;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers and an integer k, find out whether there are two distinct indices i and j in the array such
 * that nums[i] = nums[j] and the absolute difference between i and j is at most k.
 *
 * https://leetcode.com/problems/contains-duplicate-ii/description/#
 */
public class ContainsDuplicate2 {

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        return new Solution().containsNearbyDuplicate(nums, k);
    }

    class Solution {
        public boolean containsNearbyDuplicate(int[] nums, int k) {
            Map<Integer, Integer> map = new HashMap<>();
            for (int index = 0; index < nums.length; index++) {
                if (map.containsKey(nums[index])) {
                    Integer maxIndex = map.get(nums[index]);
                    if (Math.abs(maxIndex - index) <= k) {
                        return true;
                    }
                }
                map.put(nums[index], index);
            }

            return false;
        }
    }
}
