package leetcode.Arrays.Richest_customerWealth;

public class Solution {

    public static int maximumWealth(int[][] accounts) {
        int largestWealth = accounts[0][0];
        for (int i = 0; i < accounts.length; i++) {
            int sumOfWealth = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                sumOfWealth += accounts[i][j];
            }
            largestWealth = Math.max(largestWealth, sumOfWealth);
        }
        return largestWealth;
    }

    public static void main(String[] args) {
        int [][]a = {{1,2,3}, {3,7,1}};
        int ans = maximumWealth(a);
        System.out.println(ans);
    }
}
