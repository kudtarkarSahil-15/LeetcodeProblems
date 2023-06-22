package leetcode.BinarySearch.validPerfectSquare;

public class Solution {
    public static boolean isPerfectSquare(int num) {
        if(num == 1 || num == 0) {
            return true;
        }
        int start=1; int end=num;
        while(start <= end) {
            int mid = (start+end)/2;
            double value = (double)num/mid;
            if(mid == value) {
                return true;
            }
            else if(mid < value) {
                start = mid+1;
            }
            else {
                end = mid-1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int num = 15;
        boolean res = isPerfectSquare(num);
        System.out.println(res);
    }
}
