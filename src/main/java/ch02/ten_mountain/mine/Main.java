package ch02.ten_mountain.mine;

import java.util.Scanner;

public class Main {

    public int solution(int N, int[][] mountainMap) {
        int count = 0;

        for (int i = 1; i < N + 1; i++) {
            for (int j = 1; j < N + 1; j++) {
                if (mountainMap[i][j] > mountainMap[i - 1][j]
                        && mountainMap[i][j] > mountainMap[i + 1][j]
                        && mountainMap[i][j] > mountainMap[i][j - 1]
                        && mountainMap[i][j] > mountainMap[i][j + 1] ) {
                    count++;
                }

            }
        }

        return count;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);

        int N = kb.nextInt();
        int[][] mountainMap = new int[N + 2][N + 2];

        for (int i = 1; i < N + 1; i++) {
            for (int j = 1; j < N + 1; j++) {
                mountainMap[i][j] = kb.nextInt();
            }
        }

        System.out.println(T.solution(N, mountainMap));
    }
}
