package leetcode.Arrays.Remove_Duplicates;

import java.util.Arrays;

public class Solution
{
    public static int removeDuplicates(int[] nums) {

        Arrays.sort(nums);
        System.out.println("\n\nFirst - Sort Array:" +nums.length);
        for (int n: nums) {
            System.out.print(n + " ");
        }
        System.out.println();

        int index=1;
        int duplicates = 0;
        for(int i=1; i < nums.length; i++)
        {
            if(nums[i-1] != nums[i]) {
                nums[index] = nums[i];
                index++;
            }
            else {
                duplicates++;
            }
        }
        System.out.println("\nTotal Duplicates Values Present in An Array: " +duplicates);
        return index;
    }

    public static void main(String[] args) {
        int[] num = new int[] {1,1,2,2,3,4,2,4,5,5,6,9,2,8,9,7,0};

        System.out.println("Traversing An Given Array:" +num.length);
        for (int i = 0; i <= num.length-1; i++) {
            System.out.print(num[i] + " ");
        }

        int n = removeDuplicates(num);
        System.out.println("\nRemove Duplicates From Array:");
        for (int i = 0; i < n; i++) {
            System.out.print(num[i] + " ");
        }
    }
}