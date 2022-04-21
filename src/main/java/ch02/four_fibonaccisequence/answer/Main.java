package ch02.four_fibonaccisequence.answer;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public int[] solution(int num) {
        int[] answer = new int[num];

        answer[0] = 1;
        answer[1] = 1;

        for (int i = 2; i < num; i++) {
            answer[i] = answer[i - 2] + answer[i - 1];
        }

        return answer;
    }

    public void solutionWithoutArray(int n) {
        int a = 1;
        int b = 1;
        int c;

        System.out.print(a + " " + b + " ");

        for(int i = 2; i < n; i++) {
            c = a + b;
            System.out.print(c + " ");

            a = b;
            b = c;
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int num = kb.nextInt();

        for (int x : T.solution(num)) {
            System.out.print(x + " ");
        }

        System.out.println();
        T.solutionWithoutArray(num);
    }
}
