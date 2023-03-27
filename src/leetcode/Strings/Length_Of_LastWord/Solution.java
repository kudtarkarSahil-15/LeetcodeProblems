package leetcode.Strings.Length_Of_LastWord;

public class Solution {
//    public static int lengthOfLastWord(String s) {
//        int i =0;
//        String[] a = s.split(" ");
//        for (i = a.length-1; i >= 0 ;i--) {
//            if(a[i] != null) {
//                return a[i].length();
//            }
//        }
//        return i;
//    }

//    public static int lengthOfLastWord(String s) {
//        int count=0;
//        String a = s.trim();
//        for (int i = a.length()-1; i >=0; i--) {
//            if(a.charAt(i) != ' ') {
//                count++;
//            }
//            else {
//                break;
//            }
//        }
//        return count;
//    }

    public static int lengthOfLastWord(String s) {
        String[] arr = s.split(" ");
        return arr[arr.length-1].length();
    }
    public static void main(String[] args) {
        String str = "hel lo world   ";
        int res = Solution.lengthOfLastWord(str);
        System.out.println(res);
    }
}
