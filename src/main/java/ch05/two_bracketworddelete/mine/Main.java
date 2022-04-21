package ch05.two_bracketworddelete.mine;

import java.util.Scanner;
import java.util.Stack;

public class Main {

    public String solution(String str) {
        String answer = "";

        Stack<Character> stack = new Stack<>();

        for (char x : str.toCharArray()) {
            if (x == ')') {
                char a = stack.peek();
                while(a != '(') {
                    stack.pop();
                    a = stack.peek();
                }
                stack.pop();
            }
            else {
                stack.push(x);
            }
        }

        StringBuilder sb = new StringBuilder();
        for (Character character : stack) {
            sb.append(character);
        }
        return answer = sb.toString();
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();

        System.out.println(T.solution(str));
    }
}
