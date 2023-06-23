package leetcode.Strings.problem2011;

//Input: operations = ["--X","X++","X++"]
//        Output: 1
//        Explanation: The operations are performed as follows:
//        Initially, X = 0.
//        --X: X is decremented by 1, X =  0 - 1 = -1.
//        X++: X is incremented by 1, X = -1 + 1 =  0.
//        X++: X is incremented by 1, X =  0 + 1 =  1.

public class Solution {
    public static int  finalValueAfterOperations(String[] operations) {
//        System.out.println(operations[0].charAt(1)); //targeting 1st index of each operation
        int x = 0;
        for (String operation : operations) {
            if (operation.charAt(1) == '+') {
                x++;
            } else {
                x--;
            }
        }
        return x;
    }

    public static void main(String[] args) {
        String[] a = {"--X","X++","X++"};
        int res = finalValueAfterOperations(a);
        System.out.println(res);
    }
}

