package leetcode.Arrays.majorityElementOccurence;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static int majorityElementFn(int []a, int N) {
        int maxOccurence = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            if(map.containsKey(a[i])) {
                map.put(a[i], map.get(a[i])+1);
            }
            else {
                map.put(a[i], 1);
            }
        }
        for(Map.Entry<Integer, Integer> e: map.entrySet()) {
            if(e.getKey() > maxOccurence) {
                maxOccurence = Math.max(maxOccurence, e.getValue());
            }
        }
        return maxOccurence;
    }
    public static void main(String[] args) {
        int []a = {1,2,1,3,1,4,2,2,1,4};
        int N=10;
        int result = majorityElementFn(a,N);
        System.out.println(result);
    }
}
