package leetcode.Arrays.fourSum2;

import java.util.*;

public class Solution {
    public static int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
//        Input: nums1 = [1,2], nums2 = [-2,-1], nums3 = [-1,2], nums4 = [0,2]
//        Output: 2
//        -2 -1 -1 0 1 2 2 2
        int result = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i: nums1) {
            for(int j: nums2) {
                map.put(i+j, map.getOrDefault(i+j, 0) +1);
            }
        }
        for(int k: nums3) {
            for(int l: nums4) {
                result += map.getOrDefault(-(k+l), 0);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int []nums1 = {1,2};
        int []nums2 = {-2,-1};
        int []nums3 = {-1,2};
        int []nums4 = {0,2};
        int result = fourSumCount(nums1, nums2, nums3, nums4);
        System.out.println(result);
    }
}
