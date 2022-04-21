package ch02.four_fibonaccisequence.mine;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public ArrayList<Integer> solution(int num) {
        ArrayList<Integer> answer = new ArrayList<>(num);

        answer.add(1);
        answer.add(1);

        for (int i = 2; i < num; i++) {
            answer.add(answer.get(i - 2) + answer.get(i - 1));
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int num = kb.nextInt();

        for (int x : T.solution(num)) {
            System.out.print(x + " ");
        }
    }
}
