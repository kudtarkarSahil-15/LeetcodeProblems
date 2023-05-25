package leetcode.Arrays.SumOfAllOdd_LengthSubArrays;

public class Solution {
    public static int sumOddLengthSubarrays(int[] arr) {
        int result=0;
        for (int i = 0; i < arr.length; i++) {
            int start = arr.length-i;
            int end = i+1;
            int total = start*end;
            int odd = total/2;
            if(total%2 == 1) {
                odd++;
            }
            result += odd*arr[i];
        }
        return result;
    }
    public static void main(String[] args) {
        int []a = {1,4,2,5,3};
        int ans = sumOddLengthSubarrays(a);
        System.out.println(ans);
    }
}
