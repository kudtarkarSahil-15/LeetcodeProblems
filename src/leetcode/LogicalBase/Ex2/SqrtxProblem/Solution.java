package leetcode.LogicalBase.Ex2.SqrtxProblem;

public class Solution {
    public static int mySqrt(int x) {
        return Math.abs((int)Math.sqrt(x));
    }
    public static void main(String[] args) {
        int x = 4;
        int result = mySqrt(x);
        System.out.println(result);
    }
}
