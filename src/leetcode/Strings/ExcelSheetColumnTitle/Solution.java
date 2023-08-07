package leetcode.Strings.ExcelSheetColumnTitle;

public class Solution {
    public static String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();
        while(columnNumber > 0) {
            columnNumber--;
            char title = (char) (columnNumber%26 + 'A');
            columnNumber /= 26;
            sb.append(title);
        }
        return String.valueOf(sb.reverse());
    }

    public static void main(String[] args) {
        System.out.println(convertToTitle(28));
    }
}

