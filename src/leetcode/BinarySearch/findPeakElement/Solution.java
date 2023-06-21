package leetcode.BinarySearch.findPeakElement;

public class Solution {
//    Input: nums = [1,2,1,3,5,6,4]
//    Output: 5
//    Explanation: Your function can return either index number 1 where the peak element is 2, or
//    index number 5 where the peak element is 6.
    public static int findPeakElement(int[] nums) {
//        //linear search
//        int peak = 0;
//        for (int i = 0; i < nums.length; i++) {
//            if((i==0 || nums[i] > nums[i-1]) && ((i==nums.length-1) || nums[i] > nums[i+1])) {
//                peak = i;
//            }
//        }

        //binary search
        int peak = -1;
        int start = 1; int end = nums.length-2;
        if(nums.length == 1) {
            peak = 0;
            return peak;
        }
        if(nums[0] > nums[start]) {
            peak = 0;
            return peak;
        }
        if(nums[nums.length-1] > nums[end]) {
            peak = nums.length-1;
            return peak;
        }
        while(start <= end) {
            int mid = (start+end)/2;
            if(nums[mid] > nums[mid+1] && nums[mid] > nums[mid-1]) {
                peak = mid;
            }
            if(nums[mid-1] <= nums[mid]) {
                start = mid+1;
            }
            else {
                end = mid-1;
            }
        }
        return peak;
    }

    public static void main(String[] args) {
        int []a = {1,2,5,4,3,2,1};
        int res = findPeakElement(a);
        System.out.println(res);
    }
}
