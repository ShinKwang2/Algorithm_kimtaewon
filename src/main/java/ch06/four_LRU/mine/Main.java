package ch06.four_LRU.mine;

import java.util.Scanner;

public class Main {

    public int[] solution(int S, int N, int[] memory, int[] workLine) {

        for (int i = 0; i < N; i++) {
            boolean meet = false;
            for (int j = 0; j < S; j++) {
                if (workLine[i] == memory[j]) {
                    int tmp = memory[j];
                    for(int k = j; k > 0; k--) {
                        memory[k] = memory[k - 1];
                    }
                    memory[0] = tmp;
                    meet = true;
                    break;
                }
            }

            if (!meet) {
                for (int k = S - 1; k > 0; k--) {
                    memory[k] = memory[k - 1];
                }
                memory[0] = workLine[i];
            }
        }

        return memory;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int S = kb.nextInt();
        int N = kb.nextInt();

        int[] memory = new int[S];
        int[] workLine = new int[N];
        for (int i = 0; i < N; i++) {
            workLine[i] = kb.nextInt();
        }

        for (int x : T.solution(S, N, memory, workLine)) {
            System.out.print(x + " ");
        }

    }
}
