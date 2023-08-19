package leetcode.Strings.detectCapital;

public class Solution {

    public static boolean detectCapitalUse(String word) {
        String lowercase = word.toLowerCase();
        String uppercase = word.toUpperCase();
        String firstLetterCaps = word.substring(0,1).toUpperCase();
        if(word.equals(uppercase) || word.equals(firstLetterCaps)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(detectCapitalUse("USA"));
    }
}

