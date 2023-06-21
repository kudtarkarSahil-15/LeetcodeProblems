package leetcode.BinarySearch.searchTwoDMatrix2;

public class Solution {
//    Input: matrix = [[1,4,7,11,15],[2,5,8,12,19],[3,6,9,16,22],[10,13,14,17,24],[18,21,23,26,30]],
//    target = 5
//    Output: true
    public static boolean searchMatrix(int[][] matrix, int target) {
        int start = 0; int end = matrix[0].length-1;
        while (start < matrix.length && end >= 0) {
            if(matrix[start][end] == target) {
                return true;
            }
            else if(matrix[start][end] < target) {
                start++;
            }
            else {
                end--;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int [][]m = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        int target = 27;
        boolean res = searchMatrix(m, target);
        System.out.println(res);
    }
}
