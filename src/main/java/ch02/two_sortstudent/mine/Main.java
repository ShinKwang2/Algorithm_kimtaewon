package ch02.two_sortstudent.mine;

import java.util.Scanner;

public class Main {
    public int solution(int n, int[] arr) {
        int count = 0;
        int max = 0;

        for (int i = 0; i < n; i++) {
            if (max < arr[i]) {
                count++;
                max = arr[i];
            }
        }

        return count;
    }


    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int num = kb.nextInt();
        int[] heights = new int[num];

        for (int i = 0; i < num; i++) {
            heights[i] = kb.nextInt();
        }

        System.out.println(T.solution(num, heights));
    }
}
