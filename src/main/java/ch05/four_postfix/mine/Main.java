package ch05.four_postfix.mine;

import java.util.Scanner;
import java.util.Stack;

public class Main {

    public int solution(String str) {
        int answer = 0;

        Stack<Integer> stack = new Stack<>();

        for (char x : str.toCharArray()) {
            if (x == '+') {
                int rt = Integer.valueOf(stack.pop());
                int lt = Integer.valueOf(stack.pop());
                int tmp = lt + rt;
                stack.push(tmp);
            }
            else if (x == '-') {
                int rt = Integer.valueOf(stack.pop());
                int lt = Integer.valueOf(stack.pop());
                int tmp = lt - rt;
                stack.push(tmp);
            }
            else if (x == '*') {
                int rt = Integer.valueOf(stack.pop());
                int lt = Integer.valueOf(stack.pop());
                int tmp = lt * rt;
                stack.push(tmp);
            }
            else if (x == '/') {
                int rt = Integer.valueOf(stack.pop());
                int lt = Integer.valueOf(stack.pop());
                int tmp = lt / rt;
                stack.push(tmp);
            }
            else {
                Integer push = stack.push(Integer.valueOf(x) - 48);
            }
        }

        return answer = stack.get(0);
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);

        String str = kb.next();

        System.out.println(T.solution(str));
    }
}
