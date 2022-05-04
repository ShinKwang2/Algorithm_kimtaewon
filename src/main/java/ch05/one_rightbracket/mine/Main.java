package ch05.one_rightbracket.mine;

import java.util.Scanner;
import java.util.Stack;

public class Main {

    public String solution(String str) {
        String answer = "YES";
        char[] chars = str.toCharArray();
        Stack<Character> stack = new Stack<>();

        for (char x : chars) {
            if (x == '(')
                stack.push(x);
            else {
                if (stack.isEmpty())
                    return "NO";
                else
                    stack.pop();
            }
        }
        if (!stack.isEmpty())
            return "NO";

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();

        System.out.println(T.solution(str));
    }
}
