package leetcode.Strings.problem1108;
//Input: address = "1.1.1.1"
//Output: "1[.]1[.]1[.]1"
public class Solution {
    public String defangIPaddr(String address) {
        return address.replace(".", "[.]");
    }
}
