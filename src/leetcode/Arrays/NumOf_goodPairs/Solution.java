package leetcode.Arrays.NumOf_goodPairs;

public class Solution {

    public static int numIdenticalPairs(int[] nums) {
        int pairs =0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if(nums[i]==nums[j] && i < j) {
                    pairs++;
                }
            }
        }
        return pairs;
    }

    public static void main(String[] args) {
        int []a = {1,2,3,1,1,3};
        int ans = numIdenticalPairs(a);
        System.out.println("Good Pairs: " +ans);

    }
}
