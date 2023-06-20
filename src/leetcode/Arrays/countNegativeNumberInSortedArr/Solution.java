package leetcode.Arrays.countNegativeNumberInSortedArr;

public class Solution {
//    Input: grid = [[4,3,2,-1],[3,2,1,-1],[1,1,-1,-2],[-1,-1,-2,-3]]
//    Output: 8
//    Explanation: There are 8 negatives number in the matrix.
    public static int countNegatives(int[][] grid) {
        int count=0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if(grid[i][j] < 0) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int [][]a = {{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
        int result = countNegatives(a);
        System.out.println(result);
    }
}
