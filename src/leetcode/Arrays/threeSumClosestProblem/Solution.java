package leetcode.Arrays.threeSumClosestProblem;

import java.util.Arrays;

public class Solution {
    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int result = 0;
        int sumClosest = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int start = i+1; int end = nums.length-1;
            while(start<end) {
                if(nums[i]+nums[start]+nums[end] == target) {
                    return target;
                }
                if(Math.abs(nums[i]+nums[start]+nums[end] - target) < sumClosest) {
                    sumClosest = Math.abs(nums[i]+nums[start]+nums[end] - target);
                    result = nums[i]+nums[start]+nums[end];
                }
                else if(nums[i] + nums[start] + nums[end] < target) {
                    start++;
                }
                else {
                    end--;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int []nums = {-1,2,1,-4};
        int target = 1;
        int result = threeSumClosest(nums, target);
        System.out.println(result);
    }
}
