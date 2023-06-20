package leetcode.Arrays.CountOfMaxPositiveOrNegative;

public class Solution {
    public static int maximumCount(int[] nums) {
        int pCount = 0;
        int nCount = 0;
        for (int num : nums) {
            if (num < 0) {
                nCount++;
            } else {
                pCount++;
            }
        }
        return Math.max(nCount, pCount);
    }

    public static void main(String[] args) {
        int []a = {-2,-1,-1,1,2,3};
        int result = maximumCount(a);
        System.out.println(result);
    }
}
