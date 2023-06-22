package leetcode.BinarySearch.findSmallestLetterGreaterThanTarget;
//Input: letters = ["c","f","j"], target = "a"
//Output: "c"
//Explanation: The smallest character that is lexicographically greater than 'a' in letters is 'c'.
public class Solution {
    public static char nextGreatestLetter(char[] letters, char target) {
        int start = 0; int end = letters.length-1;
        int ans = 0;
        while(start <= end) {
            int mid = (start+end)/2;
            if(letters[mid] <= target) {
                start = mid+1;
            }
            else {
                end = mid-1;
                ans = mid;
            }
        }
        return letters[ans];
    }

    public static void main(String[] args) {
        char []a = {'c','f','j'};
        char t = 'a';
        char res = nextGreatestLetter(a, t);
        System.out.println(res);
    }
}


