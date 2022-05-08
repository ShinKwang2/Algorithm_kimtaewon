package ch06.four_LRU.answer;

import java.util.Scanner;

public class Main {

    public int[] solution(int size, int n, int[] arr) {
        int[] cache = new int[size];

        for (int x : arr) {
            int pos = -1;
            for (int i = 0; i < size; i++) {
                if (x == cache[i]) {
                    pos = i;
                }
            }
            if (pos == -1) {
                for (int j = size - 1; j >= 1; j--) {
                    cache[j] = cache[j - 1];
                }
            }
            else {
                for (int j = pos; j >= 1; j--) {
                    cache[j] = cache[j - 1];
                }
            }
            cache[0] = x;

        }

        return cache;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int S = kb.nextInt();
        int N = kb.nextInt();

        int[] workLine = new int[N];
        for (int i = 0; i < N; i++) {
            workLine[i] = kb.nextInt();
        }

        for (int x : T.solution(S, N, workLine)) {
            System.out.print(x + " ");
        }

    }
}
