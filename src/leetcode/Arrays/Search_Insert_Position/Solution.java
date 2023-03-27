package leetcode.Arrays.Search_Insert_Position;

public class Solution {
    public static int searchInsert(int[] nums, int target) {

        int left=0;
        int right=nums.length-1;

        while (left <= right) {
            int mid = (left+right)/2;
            if(nums[mid] == target) {
                return mid;
            }
            else if(nums[mid] < target) {
                left = mid+1;
            }
            else {
                right = mid-1;
            }
        }
        return left;
    }
    public static void main(String[] args) {
        int target = 7;
        int[] num = new int[] {1,3,5,6};
        int res = Solution.searchInsert(num, target);
        System.out.println(res);
    }
}
