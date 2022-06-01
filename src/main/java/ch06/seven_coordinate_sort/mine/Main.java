package ch06.seven_coordinate_sort.mine;

import java.util.Scanner;

public class Main {

    public void solution(int N, int[] arrayX, int[] arrayY) {

        for (int i = 0; i < N; i++) {

        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);

        int N = kb.nextInt();
        int[] arrayX = new int[N];
        int[] arrayY = new int[N];
        for (int i = 0; i < N; i++) {
            arrayX[i] = kb.nextInt();
            arrayY[i] = kb.nextInt();
        }

        T.solution(N, arrayX, arrayY);

        for (int i = 0; i < N; i++) {
            System.out.println(arrayX[i] + " " + arrayY[i]);
        }
    }
}
