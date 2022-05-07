package ch06.one_selection_sort.mine;

import java.util.Scanner;

public class Main {

    public int[] solution(int n, int[] arr) {

        for (int i = 0; i < n; i++) {
            int min = arr[i];
            int tmp = i;

            for (int j = i + 1; j < n; j++) {
                if (min > arr[j]) {
                    min = arr[j];
                    tmp = j;
                }
            }

            int change = arr[i];
            arr[i] = arr[tmp];
            arr[tmp] = change;
        }

        return arr;
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
