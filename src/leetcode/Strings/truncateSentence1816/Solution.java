package leetcode.Strings.truncateSentence1816;
/*
Input: s = "Hello how are you Contestant", k = 4
Output: "Hello how are you"
Explanation:
The words in s are ["Hello", "how" "are", "you", "Contestant"].
The first 4 words are ["Hello", "how", "are", "you"].
Hence, you should return "Hello how are you". */
public class Solution {
    public static String truncateSentence(String s, int k) {
        int count =0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == ' ') {
                count++;
                if(count == k) {
                    return s.substring(0, i);
                }
            }
        }
        return s;
    }

    public static void main(String[] args) {
        String s = "Hello how are you Contestant";
        int k = 4;
        String  res = truncateSentence(s, k);
        System.out.println(res);
    }
}
