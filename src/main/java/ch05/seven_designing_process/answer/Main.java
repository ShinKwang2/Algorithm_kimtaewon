package ch05.seven_designing_process.answer;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    public String solution(String need, String plan) {
        String answer = "YES";
        Queue<Character> Q = new LinkedList<>();

        for (char x : need.toCharArray()) {
            Q.offer(x);
        }

        for (char x : plan.toCharArray()) {
            if (Q.contains(x)) {
                if (x != Q.poll())
                    return "NO";
            }
        }

        if (!Q.isEmpty()) {
            return "NO";
        }

        return answer;

    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String necessary = kb.next();
        String process = kb.next();

        System.out.println(T.solution(necessary, process));
    }
}
