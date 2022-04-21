package ch02.twelve_mentoring.mine;

import java.util.*;

public class Main {


    public int factorial(int n) {
        int sum = 1;
        for (int i = n; i >= 1; i--) {
            sum *= i;
        }

        return sum;
    }

    public int solution(int number, int cnt, int[][] arr) {
        List<String> firstList = new ArrayList<>(factorial(number - 1));
        List<String> list = new ArrayList<>(factorial(number - 1));

        for (int i = 0; i < number; i++) {
            for (int j = i + 1; j < number; j++) {
                firstList.add(arr[0][i] + " " + arr[0][j]);
            }
        }

        for (int i = 1; i < cnt; i++) {
            for (int j = 0; j < number; j++) {

                for (int k = j + 1; k < number; k++) {
                    list.add(arr[i][j] + " " + arr[i][k]);
                }
            }

            for (String x : firstList) {
                if (!firstList.contains(x)) {
                    firstList.remove(x);
                }
            }
        }

        for (String x : firstList) {
            System.out.print(x + " / ");
        }

        int answer = firstList.size();

        return answer;

    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int number = kb.nextInt();
        int count = kb.nextInt();

        int[][] arr = new int[count][number];

        for (int i = 0; i < count; i++) {
            for (int j = 0; j < number; j++) {
                arr[i][j] = kb.nextInt();
            }
        }

        System.out.println(T.solution(number, count, arr));
    }
}
