package leetcode.Strings.problem771;
//Input: jewels = "aA", stones = "aAAbbbb"
//        Output: 3
public class Solution {
    public static int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        for (int i = 0; i < jewels.length(); i++) {
            for (int j = 0; j < stones.length(); j++) {
                if(jewels.charAt(i) == stones.charAt(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String jewels = "aA";
        String stones = "aAAbbbb";
        int res = numJewelsInStones(jewels, stones);
        System.out.println(res);
    }
}
