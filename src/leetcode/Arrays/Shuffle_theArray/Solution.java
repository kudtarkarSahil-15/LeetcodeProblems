package leetcode.Arrays.Shuffle_theArray;

public class Solution {
    public static int[] shuffle(int[] nums, int n) {
        int a[] = new int[nums.length];
        for (int i = 0; i < n; i++) {
            a[2*i] = nums[i];
            a[2*i+1] = nums[n + i];
        }
        return a;
    }

    public static void main(String[] args) {
        int []a = {1,2,3,4,5,6};
        int []ans = shuffle(a,3);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + ",");
        }
    }
}
