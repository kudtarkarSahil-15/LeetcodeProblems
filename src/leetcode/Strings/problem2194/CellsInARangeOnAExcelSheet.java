package leetcode.Strings.problem2194;

import java.util.ArrayList;
import java.util.List;

public class CellsInARangeOnAExcelSheet {
    public static List<String> cellsInRange(String s) {
        List<String> list = new ArrayList<>();
        int initCol = s.charAt(0);
        int initRow = s.charAt(1);
        int finalCol = s.charAt(3);
        int finalRow = s.charAt(4);

        char []ch = new char[2];

        for (int i = initCol; i <= finalCol; i++) {
            for (int j = initRow; j <= finalRow; j++) {
                ch[0] = (char)i;
                ch[1] = (char)j;
                list.add(String.valueOf(ch));
            }
        }
        return list;
    }
    public static void main(String[] args) {
        String s = "K1:L2";
        for(String l: cellsInRange(s)) {
            System.out.println(l);
        }
    }
}
