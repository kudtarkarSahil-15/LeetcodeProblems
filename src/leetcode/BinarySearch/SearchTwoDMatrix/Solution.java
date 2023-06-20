package leetcode.BinarySearch.SearchTwoDMatrix;

public class Solution {
//    Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
//    Output: true
//    linear search approach -> Tc: O(n^2)
//    public static boolean searchMatrix(int[][] matrix, int target) {
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[i].length; j++) {
//                if(target == matrix[i][j]) {
//                    return true;
//                }
//            }
//        }
//        return false;
//    }
//    public static boolean searchMatrix(int[][] matrix, int target) {
//        int start=0; int end = matrix[0].length-1;
//        while(start < matrix.length && end >= 0) {
//            if (matrix[start][end] == target) {
//                return true;
//            }
//            else if(matrix[start][end] < target) {
//                start++;
//            }
//            else {
//                end--;
//            }
//        }
//        return false;
//    }
    public static boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix[0].length;
        int n = matrix.length;
        int start = 0; int end= (m*n)-1;
        while(start <= end) {
            int mid = (start+end)/2;
            if(matrix[mid/m][mid%m] == target) {
                return true;
            }
            else if(matrix[mid/m][mid%m] < target) {
                start = mid+1;
            }
            else {
                end = mid-1;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        int [][]m = {{1,4,5,7},{10,11,17,20},{23,30,34,60}};
        int target = 3;
        boolean res = searchMatrix(m, target);
        System.out.println(res);
    }
}
