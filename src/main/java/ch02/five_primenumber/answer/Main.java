package ch02.five_primenumber.answer;

import java.util.Scanner;

public class Main {
    public int solution(int num) {
        int answer = 0;
        int[] check = new int[num + 1];

        for (int i = 2; i < check.length; i++) {
            if (check[i] == 0) {
                answer++;
                for (int j = i; j < check.length; j = j + i) {
                    check[j] = 1;
                }
            }
        }

        return answer;

    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int num = kb.nextInt();
        System.out.println(T.solution(num));
    }
}
