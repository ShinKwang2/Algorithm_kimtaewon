package ch03.five_sumofseriesnumber.answer;

import java.util.Scanner;

public class Main {

    public int solution(int n) {
        int answer = 0;

        int sum = 0;
        int lt = 0;
        int m = n / 2 + 1; //연속된 숫자니 끝까지 할 필요가 없다.

        int[] arr = new int[m];

        for (int i = 0; i < m; i++) {
            arr[i] = i + 1;
        }

        for (int rt = 0; rt < m; rt++) {
            sum += arr[rt];
            if (sum == n) {
                answer++;
            }
            while (sum >= n) {
                sum -= arr[lt++];
                if (sum == n) {
                    answer++;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();

        System.out.println(T.solution(n));
    }
}
