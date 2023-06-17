package leetcode.Arrays.returnTripletsOfZeroSum;

import java.util.*;

public class Solution {
    public static List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> result = new HashSet<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            int start=i+1; int end= nums.length-1;
            while(start < end) {
                if(nums[i] + nums[start] + nums[end] == 0) {
//                  *Error: with this it shows time limit exceeded then i try with set
//                  if(result.contains(Arrays.asList(nums[i], nums[start], nums[end]))) {
//                      start++;
//                      end--;
//                  }
                    result.add(Arrays.asList(nums[i], nums[start], nums[end]));
                    start++; end--;
                }
                else if(nums[i] + nums[start] + nums[end] < 0) {
                    start++;
                }
                else {
                    end--;
                }
            }
        }
        return new ArrayList<>(result);
    }

    public static void main(String[] args) {
        int []num = {-1,0,1,2,-1,-4};
        List<List<Integer>> list = threeSum(num);
        for(List<Integer> result: list) {
            System.out.println(result);
        }
    }
}
