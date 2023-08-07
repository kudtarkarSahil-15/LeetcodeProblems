package leetcode.Strings.ExcelSheetColumnNumber;

public class Solution {
    public static int titleToNumber(String columnTitle) {
        int colNumber = 0;
        for (int i = 0; i < columnTitle.length(); i++) {
            colNumber *= 26;
            colNumber = colNumber + columnTitle.charAt(i) - 'A' + 1;
        }
        return colNumber;
    }

    public static void main(String[] args) {
        System.out.println(titleToNumber("AB"));
    }
}
