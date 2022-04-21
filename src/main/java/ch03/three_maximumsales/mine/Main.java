package ch03.three_maximumsales.mine;

import java.util.Scanner;

public class Main {

    public int solution(int days, int n, int[] arr) {
        int answer = Integer.MIN_VALUE;

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        answer = sum;

        for (int i = n; i < days; i++) {
            sum += arr[i];
            sum -= arr[i - n];

            answer = Math.max(answer, sum);
        }


        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int days = kb.nextInt();
        int n = kb.nextInt();
        int[] arr = new int[days];

        for (int i = 0; i < days; i++) {
            arr[i] = kb.nextInt();
        }

        System.out.println(T.solution(days, n, arr));
    }
}
