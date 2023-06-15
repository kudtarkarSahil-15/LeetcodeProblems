package leetcode.Arrays.Remove_Duplicates;

import java.util.HashSet;
import java.util.Set;

public class Solution2 {
    public static void main(String[] args) {
        int [] a = {1,5,4,3,2,1,7,4};
        int N = 8;

        Set<Integer> duplicates = new HashSet<>();

        for (int i = 0; i < N; i++) {
            if(duplicates.contains(a[i])) {
                System.out.println(a[i]);
            }
            duplicates.add(a[i]);
        }

        for (int i: duplicates) {
            System.out.print(i + " ");
        }
    }
}
