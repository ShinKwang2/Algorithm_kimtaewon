package ch02.eight_getrankNONONO.mine;

import java.util.Scanner;

public class Main {

    public int[] solution(int num, int[] scores) {
        int[] answer = new int[num];

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
