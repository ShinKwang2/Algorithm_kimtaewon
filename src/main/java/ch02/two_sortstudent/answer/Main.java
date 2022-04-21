package ch02.two_sortstudent.answer;

import java.util.Scanner;

public class Main {
    public int solution(int n, int[] arr) {

        int answer = 1;
        int max = arr[0];

        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                answer++;
                max = arr[i];
            }
        }

        return answer;
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
