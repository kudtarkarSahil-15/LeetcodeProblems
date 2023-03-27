package leetcode.Arrays.diffBetnElementSumAnd_DigitSum;

public class Solution {
    public static int differenceOfSum(int[] nums) {
        int elementSum = 0, digitSum = 0;
        for (int i = 0; i < nums.length; i++) {
            elementSum += nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            int remainder;
            int number = nums[i];
            if(number > 9) {
                while(number != 0) {
                    remainder = number % 10;
                    digitSum = digitSum + remainder;
                    number = number/10;
                }
            }
            digitSum += number;
        }
        return Math.abs(elementSum - digitSum);
    }

    public static void main(String[] args) {
        int []nums = {1,15,6,3};
        int ans = differenceOfSum(nums);
        System.out.println(ans);
    }
}
