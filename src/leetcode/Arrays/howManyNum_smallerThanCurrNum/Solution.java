package leetcode.Arrays.howManyNum_smallerThanCurrNum;

public class Solution {
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int []smaller = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++)
            {
                if(nums[j]<nums[i] && j!=i)
                {
                    smaller[i]++;
                }
            }
        }
        return smaller;
    }

    public static void main(String[] args) {
//        int []nums = {8,1,2,2,3};
        int []nums = {7,7,7,7};
        int []ans  = smallerNumbersThanCurrent(nums);
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }
    }
}
