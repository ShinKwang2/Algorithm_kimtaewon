package ch02.six_reversprimenumber.answer;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public boolean isPrime(int num) {

        if (num == 1)
            return false;

        for (int i = 2; i < num; i++) {
            if (num % i == 0)
                return false;
        }

        return true;
    }

    public ArrayList<Integer> solution(int num, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>(num);

        for (int i = 0; i < num; i++) {
            int tmp = arr[i];
            int res = 0;

            while (tmp > 0) {
                int t = tmp % 10;
                res = res * 10 + t;
                tmp = tmp / 10;
            }

            if (isPrime(res)) {
                answer.add(res);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int number = kb.nextInt();
        int[] arr = new int[number];

        for (int i = 0; i < number; i++) {
            arr[i] = kb.nextInt();
        }

        for (int x : T.solution(number, arr)) {
            System.out.print(x + " ");
        }
    }
}
