package ch02.seven_scorecalculation.mine;

import java.util.Scanner;

public class Main {

    public int solution(int num, int[] arr) {
        int sum = 0;
        int[] counts = new int[num];
        int score = 0;

        for (int i = 0; i < num; i++) {
            if (arr[i] == 1) {
                score++;
                counts[i] = score;
                sum += score;
            }
            else {
                score = 0;
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int number = kb.nextInt();
        int[] answerList = new int[number];

        for (int i = 0; i < answerList.length; i++) {
            answerList[i] = kb.nextInt();
        }

        System.out.println(T.solution(number, answerList));
    }
}
