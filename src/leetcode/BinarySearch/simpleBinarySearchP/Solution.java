package leetcode.BinarySearch.simpleBinarySearchP;
//Input: nums = [-1,0,3,5,9,12], target = 9
//Output: 4
//Explanation: 9 exists in nums and its index is 4
public class Solution {
    public static int search(int[] nums, int target) {
        int s=0; int e= nums.length-1;
        while(s<=e) {
            int m = (s+e)/2;
            if(nums[m]==target) {
                return m;
            }
            else if(nums[m]<target) {
                s = m+1;
            }
            else {
                e = m-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int []a = {-1,0,3,5,9,12};
        int t = 9;
        int res = search(a, t);
        System.out.println(res);
    }
}
