package leetcode.Arrays.FindPairsWithArray;

import java.util.ArrayList;

public class Solution {
    public static ArrayList<Integer> findPairsFn(int []a, int N, int sum) {
        ArrayList<Integer> pairs = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            for (int j = i+1; j < N; j++) {
                if(a[i] + a[j] == sum) {
                    pairs.add(a[i]);
                    pairs.add(a[j]);
                }
            }
        }
        return pairs;
    }
    public static void main(String[] args) {
        int []a = {1,2,3,4,5,6,7};
        int N=7;
        int sum=9;

        ArrayList<Integer> result = findPairsFn(a, N, sum);
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i)+ "," + result.get(i+1));
            i++;
        }
    }
}
