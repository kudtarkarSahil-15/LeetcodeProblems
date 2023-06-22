package leetcode.BinarySearch.sumOfSqNum;

public class Solution {
    public static boolean judgeSquareSum(int c) {
        int i=0; int j=(int)Math.sqrt(c);
        while(i<=j) {
            int res = i*i + j*j;
            if(res == c) {
                return true;
            }
            else if(res < c) {
                i++;
            }
            else {
                j--;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int n = 2;
        boolean res = judgeSquareSum(n);
        System.out.println(res);
    }
}

