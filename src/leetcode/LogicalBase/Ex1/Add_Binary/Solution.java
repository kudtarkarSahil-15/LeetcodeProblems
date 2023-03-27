package leetcode.LogicalBase.Ex1.Add_Binary;

public class Solution {
    public static String addBinary(String a, String b)
    {
        return Integer.toBinaryString(Integer.parseInt(a,2) + Integer.parseInt(b,2));
    }
    public static void main(String[] args) {
        String res = Solution.addBinary("11","1");
        System.out.println(res);
    }
}
