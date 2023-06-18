package leetcode.Arrays.twoSum2Problem;
/*
* Input: numbers = [2,7,11,15], target = 9
Output: [1,2]
Explanation: The sum of 2 and 7 is 9. Therefore, index1 = 1, index2 = 2. We return [1, 2].
* */

public class Solution {
    public static int[] twoSum(int[] numbers, int target) {
        int start=0; int end=numbers.length-1;
        while (start<end) {
            if(numbers[start]+numbers[end] == target) {
                return new int[] {start+1, end+1};
            }
            else if(numbers[start] + numbers[end] < target) {
                start++;
            }
            else {
                end--;
            }
        }
        return new int[]{};
    }

    public static void main(String []args) {
        int []num = {2,7,11,15};
        int target = 9;
        int []result = twoSum(num, target);
        for (int i: result) {
            System.out.print(i + " ");
        }
    }
}
