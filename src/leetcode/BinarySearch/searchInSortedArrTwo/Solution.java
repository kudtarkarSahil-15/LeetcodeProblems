package leetcode.BinarySearch.searchInSortedArrTwo;

public class Solution {
//    Input: nums = [2,5,6,0,0,1,2], target = 0
//    Output: true
    public static boolean search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (nums[mid] == target) {
                return true;
            }
            else if (nums[start] < nums[mid]) {
                if (nums[start] <= target && nums[mid] > target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            else if(nums[start] > nums[mid]) {
                if (nums[mid] < target && nums[end] >= target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
            else { //skip duplicate and increment start pointer by 1
                start++;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] a = {1,0,1,1,1};
        int t = 0;
        boolean res = search(a, t);
        System.out.println(res);
    }
}
