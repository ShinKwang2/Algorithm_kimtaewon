package ch02.six_reversprimenumber.mine;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public ArrayList<Integer> solution(int num, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>(num);


        for (int i = 0; i < arr.length; i++) {
            // 자리 바꾸기
            String reverseStr = new StringBuilder(String.valueOf(arr[i])).reverse().toString();
            Integer reversedInt = Integer.parseInt(reverseStr);

            String isPrimeNumber = "YES";
            // 소수인지 확인하기
            for (int j = 2; j < reversedInt; j++) {
                isPrimeNumber = "YES";
                if (reversedInt % j == 0) {
                    isPrimeNumber = "NO";
                    break;
                }
            }
            if (isPrimeNumber == "YES" && reversedInt != 1) {
                answer.add(reversedInt);
            }
        }


        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int number = kb.nextInt();
        int[] arr = new int[number];

        for (int i = 0; i < number; i++) {
            arr[i] = kb.nextInt();
        }

        for (int x : T.solution(number, arr)) {
            System.out.print(x + " ");
        }
    }
}
