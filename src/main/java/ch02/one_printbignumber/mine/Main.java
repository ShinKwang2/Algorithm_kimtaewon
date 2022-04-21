package ch02.one_printbignumber.mine;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public ArrayList<Integer> solution(int n, int[] array) {
        ArrayList<Integer> answer = new ArrayList<>(n);

        for (int i = 0; i < n; i++) {
            if (i == 0)
                answer.add(array[i]);
            else {
                if (array[i] > array[i - 1])
                    answer.add(array[i]);
            }
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
