package leetcode.Arrays.Cocatenation_ofArray;

public class Solution {
    public static int[] getConcatenation(int[] nums) {
        int []a = new int[2*nums.length];

        for (int i = 0; i < nums.length; i++) {
            a[i] = nums[i];
            a[nums.length + i] = nums[i];
        }
        return a;
    }

    public static void main(String[] args) {
        int a[] = {1,2,3};
        int ans[] = getConcatenation(a);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + ",");
        }
    }
}
