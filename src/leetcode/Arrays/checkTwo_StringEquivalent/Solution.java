package leetcode.Arrays.checkTwo_StringEquivalent;

public class Solution {

    public static boolean arrayStringsAreEqual(String []word1, String []word2) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2= new StringBuilder();
        for (int i = 0; i < word1.length; i++) {
            sb1.append(word1[i]);
        }

        for (int i = 0; i < word2.length; i++) {
            sb2.append(word2[i]);
        }
        return sb1.toString().equals(sb2.toString());
    }

    public static void main(String[] args) {
        String []word1 = {"ab","cd"};
        String []word2 = {"a", "bcd"};
        boolean ans = arrayStringsAreEqual(word1, word2);
        System.out.println(ans);
    }
}
