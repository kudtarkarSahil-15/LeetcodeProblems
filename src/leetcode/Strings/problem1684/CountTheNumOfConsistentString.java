package leetcode.Strings.problem1684;

import javax.swing.text.AttributeSet;
import java.util.HashSet;

public class CountTheNumOfConsistentString {
    public static int countConsistentStrings(String allowed, String[] words) {
        int count = 0;
        HashSet<Character> set = new HashSet<>();
        for(char ch: allowed.toCharArray()) {
            set.add(ch);
        }

        for(String s: words) {
            count++;
            for(char ch: s.toCharArray()) {
                if(!set.contains(ch)) {
                    count--;
                    break;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String allowed = "ab";
        String []words = {"ad", "bd", "aaab", "baa", "badab"};
        int result = countConsistentStrings(allowed, words);
        System.out.println(result);
    }
}

