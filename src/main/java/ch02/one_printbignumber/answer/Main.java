package ch02.one_printbignumber.answer;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public ArrayList<Integer> solution(int n, int[] array) {
        ArrayList<Integer> answer = new ArrayList<>(n);

        answer.add(array[0]);

        for (int i = 1; i < n; i++) {
            if (array[i] > array[i - 1])
                answer.add(array[i]);
        }


        return answer;

    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }

        for (int x : T.solution(n, arr)) {
            System.out.print(x + " ");
        }
    }
}
