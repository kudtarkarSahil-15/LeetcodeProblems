package leetcode.Strings.countNumOfConsistentStr1684;
/*
Input: allowed = "ab", words = ["ad","bd","aaab","baa","badab"]
Output: 2
Explanation: Strings "aaab" and "baa" are consistent since they only contain characters 'a' and 'b'.*/
public class Solution {
    public static int countConsistentStrings(String allowed, String[] words) {
        int result = 0;
        return result;
    }
    public static void main(String[] args) {
        String a = "ab";
        String []w = {"ad","bd","aaab","baa","bbab"};
        int res = countConsistentStrings(a, w);
        System.out.println(res);
    }
}
