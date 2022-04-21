package ch03.five_sumofseriesnumber.mine;

import java.util.Scanner;

public class Main {

    public int solution(int n) {
        int answer = 0;
        int sum = 0;

        int lt = 1;

        // n 까지 돌 필요가 없음, n / 2 + 1 까지만 가도 됨.
        for (int rt = 1; rt < n; rt++) {
            sum += rt;

            if (sum == n) {
                answer++;
            }
            while (sum >= n) {
                sum -= lt++;
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
