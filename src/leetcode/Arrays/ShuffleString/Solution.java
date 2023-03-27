package leetcode.Arrays.ShuffleString;

public class Solution {
    public static String restoreString(String s, int[] indices) {
        StringBuilder sb = new StringBuilder();
        char []c = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            c[indices[i]] = s.charAt(i);
        }
        sb.append(c);
        return sb.toString();
    }

    public static void main(String[] args) {
//        String s ="abc";
//        int []indices = {0,1,2};
        String s = "codeleet";
        int []indices = {4,5,6,7,0,2,1,3};
        String ans = restoreString(s, indices);
        System.out.println(ans);
    }
}
