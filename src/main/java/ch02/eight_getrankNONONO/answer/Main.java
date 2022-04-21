package ch02.eight_getrankNONONO.answer;

import java.util.Scanner;

public class Main {

    public int[] solution(int num, int[] scores) {
        int[] answer = new int[num];

        for (int i = 0; i < num; i++) {
            int rank = 1;
            for (int j = 0; j < num; j++) {
                if (scores[j] > scores[i]) {
                    rank++;
                }
            }
            answer[i] = rank;
        }

        return answer;
    }


    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int number = kb.nextInt();
        int[] scores = new int[number];

        for (int i = 0; i < number; i++) {
            scores[i] = kb.nextInt();
        }

        for (int x : T.solution(number, scores)) {
            System.out.print(x + " ");
        }
    }
}
