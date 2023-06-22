package leetcode.BinarySearch.singleElementInSiortedArr;

public class Solution {
    public static int singleNonDuplicate(int[] nums) {
        int N = nums.length;
        int start = 1; int end = N-2;
        if(N==1 || nums[start-1] != nums[start]) {
            return nums[0];
        }
        if(nums[N-1] != nums[end]) {
            return nums[N-1];
        }
        while(start <= end) {
            int mid = (start+end)/2;
            if(nums[mid] != nums[mid-1] && nums[mid] != nums[mid+1]) {
                return nums[mid];
            }
            else if((mid%2==1 && nums[mid] == nums[mid-1]) || (mid%2==0 && nums[mid] == nums[mid+1])) {
                start = mid+1;
            }
            else {
                end = mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int []a = {1,1,2,3,3,4,4,8,8};
        int res = singleNonDuplicate(a);
        System.out.println(res);
    }
}
