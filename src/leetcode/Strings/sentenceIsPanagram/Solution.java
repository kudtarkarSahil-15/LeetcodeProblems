package leetcode.Strings.sentenceIsPanagram;

import java.util.HashSet;
import java.util.Set;

/*
Input: sentence = "thequickbrownfoxjumpsoverthelazydog"
Output: true
Explanation: sentence contains at least one of every letter of the English alphabet.
*/
public class Solution {
    public static boolean checkIfPangram(String sentence) {
//        Set<Character> s = new HashSet<>();
//        for (int i = 0; i < sentence.length(); i++) {
//            s.add(sentence.charAt(i));
//        }
//        return s.size() == 26;

        for (int i = 'a'; i <= 'z'; i++) {
            if(sentence.indexOf(i) < 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "thequickbrownfoxjumpsoverthelazydog";
        boolean res = checkIfPangram(s);
        System.out.println(res);
    }
}
