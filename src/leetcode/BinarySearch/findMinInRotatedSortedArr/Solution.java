package leetcode.BinarySearch.findMinInRotatedSortedArr;

public class Solution {
//    Input: nums = [3,4,5,1,2]
//    Output: 1
//    Explanation: The original array was [1,2,3,4,5] rotated 3 times.
    public static int findMin(int[] nums) {
        int start=0; int end = nums.length-1;
        if(nums[start] <= nums[end]) {
            return nums[start];
        }
        while(start <= end) {
            int mid = (start+end)/2;
            if (nums[mid] > nums[mid+1]) {
                return nums[mid+1];
            }
            else if (nums[mid] < nums[mid-1]) {
                return nums[mid];
            }
            else if(nums[start] <= nums[mid]) {
                start = mid+1;
            }
            else {
                end = mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int []a = {3,4,5,1,2};
        int res = findMin(a);
        System.out.println(res);
    }
}
