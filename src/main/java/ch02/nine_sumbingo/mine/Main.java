package ch02.nine_sumbingo.mine;

import java.util.Scanner;

public class Main {
    public int solution(int N, int[][] bingo) {
        int answer = 0;
        int sum = 0;

        // 가로
        for (int i = 0; i < N; i++) {
            sum = 0;
            for (int j = 0; j < N; j++) {
                sum += bingo[i][j];

            }
            if (answer < sum) {
                answer = sum;
            }
        }

        // 세로
        for (int i = 0; i < N; i++) {
            sum = 0;
            for (int j = 0; j < N; j++) {
                sum += bingo[j][i];
            }
            if (answer < sum) {
                answer = sum;
            }
        }

        // 대각선 \
        sum = 0;
        for (int i = 0; i < N; i++) {
            sum += bingo[i][i];
        }
        if(answer < sum) {
            answer = sum;
        }


        // 대각선 /
        sum = 0;
        for (int i = 0; i < N; i++) {
            sum += bingo[i][N - 1 - i];
        }
        if (answer < sum) {
            answer = sum;
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);

        int N = kb.nextInt();
        int[][] bingo = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                bingo[i][j] = kb.nextInt();
            }
        }

        System.out.println(T.solution(N, bingo));
    }
}
