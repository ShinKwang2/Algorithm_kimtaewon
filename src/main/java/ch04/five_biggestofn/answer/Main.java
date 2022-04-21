package ch04.five_biggestofn.answer;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {

    // TreeSet 은 중복도 제거하고, 정렬도 해준다.
    public int solution(int N, int K, int[] arr) {
        int answer = -1;

        // 내림차순으로 만들기 위해, Collections.reverseOrder()
        TreeSet<Integer> Tset = new TreeSet<>(Collections.reverseOrder());

        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                for (int l = j + 1; l < N; l++) {
                    Tset.add(arr[i] + arr[j] + arr[l]);
                }
            }
        }
        int cnt = 0;

        for (int x : Tset) {
            cnt++;
            if (cnt == K)
                return x;
        }

        /**
         * Tset.remove() / Tset.size()
         * Tset.first() / Tset.last()
         */

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int N = kb.nextInt();
        int K = kb.nextInt();

        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = kb.nextInt();
        }

        System.out.println(T.solution(N, K, arr));
    }
}
