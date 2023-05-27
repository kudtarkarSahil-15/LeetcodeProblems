package leetcode.Arrays.sumMulties;

public class Solution {
    public static int sumOfMultiples(int n) {
        int result=0;
        for (int i = 1; i <= n; i++) {
            if(i%3==0 || i%5==0 || i%7==0) {
                result += i;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int n =10;

        int output = sumOfMultiples(n);
        System.out.println("Output: " +output);
    }
}
