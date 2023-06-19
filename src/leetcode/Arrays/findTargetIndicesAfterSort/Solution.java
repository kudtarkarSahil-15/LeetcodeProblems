package leetcode.Arrays.findTargetIndicesAfterSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
//   Input: nums = [1,2,5,2,3], target = 2
//   Output: [1,2]
//   Explanation: After sorting, nums is [1,2,2,3,5].
//   The indices where nums[i] == 2 are 1 and 2.

    public static List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if(target == nums[i]) {
                res.add(i);
            }
        }
        return new ArrayList<>(res);
    }

    public static void main(String[] args) {
        int []a = {1,2,2,3,5};
        int t = 2;
        List<Integer> res = targetIndices(a, t);
        for(int i: res) {
            System.out.print(i + " ");
        }
    }
}
