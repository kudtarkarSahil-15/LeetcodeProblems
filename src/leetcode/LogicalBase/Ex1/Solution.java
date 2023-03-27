package leetcode.LogicalBase.Ex1;

public class Solution {

    //solution-1
//    public static boolean isPalindrome(int x) {
//        String s = Integer.toString(x);
//        int i=0;
//        int j=s.length()-1;
//        while(i<=j) {
//            if(s.charAt(i) == s.charAt(j)) {
//                return true;
//            }
//            i++;
//            j--;
//        }
//        return false;
//    }

    //Solution-2(w/o converting into string)
    public static boolean isPalindrome(int x) {
        int reverseNumber=0;
        int originalNumber = x;

        while(originalNumber > 0) {
            int lastDigit = originalNumber%10;
            reverseNumber = reverseNumber*10 + lastDigit;
            originalNumber = originalNumber/10;
        }

        if(x == reverseNumber) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        boolean res = Solution.isPalindrome(1221);
        System.out.println(res);
    }
}
