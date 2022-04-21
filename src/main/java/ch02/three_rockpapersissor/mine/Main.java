package ch02.three_rockpapersissor.mine;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public ArrayList<String> solution(int count, int[] resultOfA, int[] resultOfB) {
        ArrayList<String> answer = new ArrayList<>(count);

        for (int i = 0; i < count; i++) {
            int result = resultOfA[i] - resultOfB[i];
            if (result == 0) {
                answer.add("D");
            }
            else if (result == 1 || result == -2) {
                answer.add("A");
            }
            else {
                answer.add("B");
            }
        }

        return answer;
    }


    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int count = kb.nextInt();
        int[] resultOfA = new int[count];
        int[] resultOfB = new int[count];

        for (int i = 0; i < count; i++) {
            resultOfA[i] = kb.nextInt();
        }
        for (int i = 0; i < count; i++) {
            resultOfB[i] = kb.nextInt();
        }

        for (String x : T.solution(count, resultOfA, resultOfB)) {
            System.out.println(x);
        }
    }
}
