package leetcode.Arrays.Plus_One;

public class Solution {
    public static int[] plusOne(int[] digits) {
        for (int i = digits.length-1; i >=0; i--) {
            if(digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }

    public static void main(String[] args) {
        int a[] = {1,2,3,4};
        int ans[] = plusOne(a);
        for (int i = 0; i < a.length; i++) {
            System.out.print(ans[i] + ",");
        }
    }
}
