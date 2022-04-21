package ch03.one_mergearray.answer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 배열을 합쳐서 정렬하는 것은 O(nlogn)이기에 복잡도가 높다.
 * two pointer 로 하면 O(n)으로 할 수 있다.
 */
public class Main {
    public ArrayList<Integer> solution(int n, int m, int[] firstArray, int[] secondArray) {
        ArrayList<Integer> answer = new ArrayList<>();

        int p1 = 0; //firstArray Pointer
        int p2 = 0; //secondArray Pointer

        while (p1 < n && p2 < m) {
            if (firstArray[p1] < secondArray[p2]) {
                answer.add(firstArray[p1++]);
            }
            else {
                answer.add(secondArray[p2++]);
            }
        }

        // 나머지 것들을 담아주기
        while (p1 < n) {
            answer.add(firstArray[p1++]);
        }
        while (p2 < m) {
            answer.add(secondArray[p2++]);
        }

        return answer;
    }


    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] firstArray = new int[n];
        for (int i = 0; i < n; i++) {
            firstArray[i] = kb.nextInt();
        }

        int m = kb.nextInt();
        int[] secondArray = new int[m];
        for (int i = 0; i < m; i++) {
            secondArray[i] = kb.nextInt();
        }

        for (int x : T.solution(n, m, firstArray, secondArray)) {
            System.out.print(x + " ");
        }

    }
}
