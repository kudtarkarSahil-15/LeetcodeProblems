package leetcode.Strings.balancedString1221;
//Input: s = "RLRRLLRLRL"
// Output: 4
// Explanation: s can be split into "RL", "RRLL", "RL", "RL",
// each substring contains same number of 'L' and 'R'.
public class Solution {
    public static int balancedStringSplit(String s) {
        int count=0;
        int r=0,l=0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'R') {
                r++;
            }
            else {
                l++;
            }
            if(r == l) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String s = "RLRRLLRLRL";
        int res = balancedStringSplit(s);
        System.out.println(res);
    }
}
