package ch03.four_sumseries.mine;

import java.util.Scanner;

public class MainTwoPointer {

    public int solution(int N, int M, int[] arr) {
        int answer = 0;
        int sum = 0;

        int lt = 0;
        int rt = 0;

        while (rt < N) {
            sum += arr[rt];

            if (sum == M) {
                answer++;
            }
            while (sum >= M) {
                sum -= arr[lt++];
                if (sum == M) {
                    answer++;
                }
            }
            rt++;
        }

        return answer;
    }

    public static void main(String[] args) {
        MainTwoPointer T = new MainTwoPointer();
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
