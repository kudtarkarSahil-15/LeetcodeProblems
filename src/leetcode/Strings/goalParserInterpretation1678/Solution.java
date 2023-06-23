package leetcode.Strings.goalParserInterpretation1678;
//Input: command = "G()(al)"
//        Output: "Goal"
//        Explanation: The Goal Parser interprets the command as follows:
//        G -> G
//        () -> o
//        (al) -> al
//        The final concatenated result is "Goal".

public class Solution {
    public static String interpret(String command) {
        return command.replace("()","o").replace("(al)","al");
    }

    public static void main(String[] args) {
        String command = "G()(al)";
        String res = interpret(command);
        System.out.println(res);
    }
}

