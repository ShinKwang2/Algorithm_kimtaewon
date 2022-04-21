package ch02.eleven_temporaryelection.answer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public int solution(int num, int[][] arr) {
        int answer = 0;
        int max = Integer.MIN_VALUE;


        for (int i = 1; i < arr.length; i++) {

            int cnt = 0;
            for (int j = 1; j < arr.length; j++) {

                if (i != j) {

                    for (int k = 1; k <= 5; k++) {
                        if (arr[i][k] == arr[j][k]) {
                            cnt++;
                            break;
                        }
                    }
                } // if

            }

            if (cnt > max) {
                max = cnt;
                answer = i;
            }

        }



        return answer;
    }


    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int num = kb.nextInt();
        int[][] arr = new int[num + 1][6];

        for (int i = 1; i < arr.length; i++) {
            for (int j = 1; j < arr[i].length; j++) {
                arr[i][j] = kb.nextInt();
            }
        }

        System.out.println(T.solution(num, arr));

    }
}
