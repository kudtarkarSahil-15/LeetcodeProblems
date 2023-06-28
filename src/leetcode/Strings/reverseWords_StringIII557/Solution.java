package leetcode.Strings.reverseWords_StringIII557;

/*
* Input: s = "Let's take LeetCode contest"
Output: "s'teL ekat edoCteeL tsetnoc" */
public class Solution {
    public static String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        String []a = s.split(" ");
        for (String value : a) {
            for (int j = value.length() - 1; j >= 0; j--) {
                sb.append(value.charAt(j));
            }
            sb.append(" ");
        }
        return sb.toString().trim();
    }

    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        String res = reverseWords(s);
        System.out.println(res);
    }
}
