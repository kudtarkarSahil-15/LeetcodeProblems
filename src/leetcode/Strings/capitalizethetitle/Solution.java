package leetcode.Strings.capitalizethetitle;

public class Solution {
    public static String capitalizeTitle(String title) {

        StringBuilder sb = new StringBuilder();
        String[] words = title.toLowerCase().split(" ");
        for (String word : words) {
            if (words.length > 2) {
                sb.append(word.substring(0, 1).toUpperCase()).append(word.substring(1)).append(" ");
            } else {
                sb.append(word).append(" ");
            }
        }
        return sb.toString().trim();
    }

    public static void main(String[] args) {
        System.out.println(capitalizeTitle("capiTalIze tHe titLe"));
    }
}
