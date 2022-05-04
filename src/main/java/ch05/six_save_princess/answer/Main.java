package ch05.six_save_princess.answer;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    public int solution(int N, int K) {
        int answer = 0;
        Queue<Integer> Q = new LinkedList<>();  //Queue 선언

        for (int i = 1; i <= N; i++) {
            Q.offer(i);
        }

        while (!Q.isEmpty()) {
            for (int i = 1; i < K; i++) {
                Q.offer(Q.poll());
            }
            Q.poll();

            if (Q.size() == 1)
                answer = Q.peek();
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int N = kb.nextInt();
        int K = kb.nextInt();

        System.out.println(T.solution(N, K));
    }
}
