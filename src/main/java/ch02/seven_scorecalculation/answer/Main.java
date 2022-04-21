package ch02.seven_scorecalculation.answer;

import java.util.Scanner;

public class Main {

    public int solution(int num, int[] arr) {
        int answer = 0;
        int cnt = 0;

        for (int i = 0; i < num; i++) {
            if (arr[i] == 1) {
                cnt++;
                answer += cnt;
            }
            else {
                cnt = 0;
            }
        }

        return answer;
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
