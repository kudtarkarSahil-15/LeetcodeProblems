package leetcode.Arrays.fourSumProblem;
import java.util.*;

public class Solution {
    public static List<List<Integer>> fourSum(int[] nums, int target) {
//        Input: nums = [1,0,-1,0,-2,2], target = 0
//        Output: [[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]
        Set<List<Integer>> list = new HashSet<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length-3; i++) {
            for (int j = i+1; j < nums.length-2; j++) {
                int start=j+1; int end=nums.length-1;
                while(start < end) {
                    if((long)nums[i] + (long)nums[j] + (long)nums[start] + (long)nums[end] == (long)target) {
                        list.add(Arrays.asList(nums[i],nums[j],nums[start],nums[end]));
                        start++; end--;
                    }
                    else if(nums[i] + nums[j] + nums[start] + nums[end] < target) {
                        start ++;
                    }
                    else {
                        end--;
                    }
                }
            }
        }
        return new ArrayList<>(list);
    }

    public static void main(String[] args) {
        int []nums = {1,0,-1,0,-2,2};
        int target = 0;
        List<List<Integer>> list = fourSum(nums, target);
        for(List<Integer> result: list) {
            System.out.println(result);
        }
    }
}
