package leetcode.Arrays.deleteElementFromIndex;

import java.util.ArrayList;

public class Solution {
    public static ArrayList<Integer> deleteElementFn(int []a, int index) {
        ArrayList<Integer> b = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            b.add(a[i]);
        }
        for (int i = 0; i < b.size(); i++) {
            if(i == index)
                b.remove(i);
        }
        return b;
    }
    public static void main(String[] args) {
        int []a = {1,2,3,4,5};
        int index = 3;
        ArrayList<Integer> result = deleteElementFn(a, index);
        for(int i: result) {
            System.out.print(i + " ");
        }
    }
}
