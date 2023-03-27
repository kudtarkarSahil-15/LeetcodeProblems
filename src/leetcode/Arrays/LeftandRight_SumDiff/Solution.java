package leetcode.Arrays.LeftandRight_SumDiff;

public class Solution {

    public static int[] leftRightDifference(int[] nums) {
        int []leftsum = new int[nums.length];
        int []rightsum = new int[nums.length];
        int []sum = new int[nums.length];

        leftsum[0] = 0;
        rightsum[nums.length-1] = 0;

        for (int i = 0; i < nums.length-1; i++) {
            leftsum[i+1] = leftsum[i] + nums[i];
        }

        for (int i = nums.length-1; i > 0 ; i--) {
            rightsum[i-1] = rightsum[i] + nums[i];
        }

        for (int i = 0; i < sum.length; i++) {
            sum[i] = Math.abs(leftsum[i] - rightsum[i]);
        }
        return sum;
    }


    public static void main(String[] args) {
        int []a = {10,4,8,3};
        int []ans = leftRightDifference(a);
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }
    }
}
