package leetcode.Arrays.MaxNumOfWord_inSentence;

public class Solution {
    public static int mostWordsFound(String[] sentence) {
        int maxWords = 0;
        for (int i = 0; i < sentence.length; i++) {
            maxWords = Math.max(maxWords, sentence[i].split(" " ).length);
        }
        return maxWords;
    }

    public static void main(String[] args) {
        String []sentence = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        int ans = mostWordsFound(sentence);
        System.out.println(ans);
    }
}
