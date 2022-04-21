package ch03.one_mergearray.mine;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public int[] solution(int fn, int[] firstArray, int sn, int[] secondArray) {
        int len = fn + sn;
        int[] answer = new int[len];

        for (int i = 0; i < fn; i++) {
            answer[i] = firstArray[i];
        }

        for (int i = fn; i < len; i++) {
            answer[i] = secondArray[i - fn];
        }

        Arrays.sort(answer);


        return answer;
    }


    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int firstArrayNum = kb.nextInt();
        int[] firstArray = new int[firstArrayNum];
        for (int i = 0; i < firstArrayNum; i++) {
            firstArray[i] = kb.nextInt();
        }

        int secondArrayNum = kb.nextInt();
        int[] secondArray = new int[secondArrayNum];
        for (int i = 0; i < secondArrayNum; i++) {
            secondArray[i] = kb.nextInt();
        }

        for (int x : T.solution(firstArrayNum, firstArray, secondArrayNum, secondArray)) {
            System.out.print(x + " ");
        }

    }
}
