package leetcode.Arrays.createTargetArrayInGivenOrder;

import java.util.ArrayList;

public class Solution {
    public static int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> list = new ArrayList<>();
        int []a = new int[nums.length];
        for (int i = 0; i < a.length; i++) {
            list.add(index[i], nums[i]);
        }
        for (int i = 0; i < list.size(); i++) {
            a[i] = list.get(i);
        }
        return a;
    }

    public static void main(String[] args) {
        int []nums = {0,1,2,3,4};
        int []index = {0,1,2,2,1};

        int []ans = createTargetArray(nums, index);

        System.out.print("Output: ");
        for (int i: ans) {
            System.out.print(i + " ");
        }
    }
}
