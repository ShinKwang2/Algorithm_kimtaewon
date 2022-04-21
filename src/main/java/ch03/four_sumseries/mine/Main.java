package ch03.four_sumseries.mine;

import java.util.Scanner;

public class Main {

    public int solution(int N, int M, int[] arr) {

        int answer = 0;

        for (int i = 0; i < N; i++) {
            int sum = 0;

            for (int j = i; j < N; j++) {
                sum += arr[j];

                if (sum == M) {
                    answer++;
                }
                if (sum > M) {
                    break;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int N = kb.nextInt();
        int M = kb.nextInt();

        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = kb.nextInt();
        }

        System.out.println(T.solution(N, M, arr));
    }
}
