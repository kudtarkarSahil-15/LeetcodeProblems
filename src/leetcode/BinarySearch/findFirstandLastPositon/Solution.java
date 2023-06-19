package leetcode.BinarySearch.findFirstandLastPositon;

public class Solution {
//    Input: nums = [5,7,7,8,8,10], target = 8 n=6
//    Output: [3,4]
    public static int lowerBound(int[] nums, int target) {
        int first = nums.length;
        int start=0; int end=nums.length-1;
        while(start <= end) {
            int mid = (start+end)/2;
            if(nums[mid]>=target) {
                first = mid;
                end=mid-1;
            }
            else {
                start=mid+1;
            }
        }
        return first;
    }
    public static int upperBound(int []nums, int target) {
        int last = nums.length;
        int start=0; int end = nums.length-1;
        while(start <= end) {
            int mid = (start+end)/2;
            if(nums[mid] > target) {
                last = mid;
                end = mid -1;
            }
            else {
                 start = mid +1;
            }
        }
        return last;
    }

    public static int[] searchRange(int[] nums, int target) {
        int firstOccur = lowerBound(nums, target);
        int lastOccur = upperBound(nums, target);
        if(firstOccur == nums.length || nums[firstOccur] != target) {
            return new int[] {-1,-1};
        }
        return new int[] {firstOccur,lastOccur-1};
    }

    public static void main(String[] args) {
        int []nums = {5,7,7,8,8,10};
        int target = 8;
        int []result = searchRange(nums, target);
        for(int i: result) {
            System.out.print(i + " ");
        }
    }
}
