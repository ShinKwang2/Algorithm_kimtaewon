package ch02.eleven_temporaryelection.mine;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public int solution(int num, int[][] arr) {
        int answer = 0;

        int max = Integer.MIN_VALUE;
        List<Integer> duplicate = new ArrayList<>(num);


        for (int i = 0; i < arr.length; i++) {
            int cnt = 0;
            duplicate.clear();
            for (int j = 0; j < 5; j++) {

                for (int k = 0; k < arr.length; k++) {
                    if (i == k) {
                        continue;
                    }

                    if (arr[i][j] == arr[k][j] && !duplicate.contains(k)) {
                        cnt++;
                        duplicate.add(k);
                    }
                }
            }

            if (max < cnt) {
                max = cnt;
                answer = i + 1;
            }
        }



        return answer;
    }


    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int num = kb.nextInt();
        int[][] arr = new int[num][5];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = kb.nextInt();
            }
        }

        System.out.println(T.solution(num, arr));

    }
}
