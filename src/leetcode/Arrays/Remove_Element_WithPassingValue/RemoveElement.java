package leetcode.Arrays.Remove_Element_WithPassingValue;

public class RemoveElement {

    public int removeElement(int[] nums, int val) {
        int i = 0;
        for (int n: nums) {
            if(n != val) {
                nums[i] = n;
                System.out.print(nums[i] + " ");
                i++;
            }
        }
        return i;
    }

    public static void main(String[] args) {
        int[] num = new int[] {1,2,2,3,4,5,6,2};
        int value = 2;
        RemoveElement re = new RemoveElement();
        int res = re.removeElement(num, value);
        System.out.println("\nTotal Element Left After RemoveElement Method Call: " + res);
    }
}
