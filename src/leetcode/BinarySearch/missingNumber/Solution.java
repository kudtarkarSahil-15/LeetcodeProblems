package leetcode.BinarySearch.missingNumber;

import java.util.Arrays;
//Input: nums = [3,0,1]
//Output: 2
//  Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3].
//    2 is the missing number in the range since it does not appear in nums.

public class Solution {
    public static int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int start=0;
        int end= nums.length-1;
        while(start <= end) {
            int mid = (start+end)/2;
            if(nums[mid] == mid) {
                start = mid+1;
            }
            else {
                end = mid-1;
            }
        }
        return start;
    }

    public static void main(String[] args) {
        int []a = {3,0,1};
        int res = missingNumber(a);
        System.out.println(res);
    }
}
