package ch04.five_biggestofn.mine;

import java.util.Scanner;
import java.util.TreeSet;

public class Main {

    /**
     * Set , TreeSet
     */
    public int solution(int N, int K, int[] arr) {
        int answer = -1;

        TreeSet<Integer> set = new TreeSet<>();

        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                for (int o = j + 1; o < N; o++) {
                    set.add(arr[i] + arr[j] + arr[o]);
                }
            }
        }

        System.out.println("set = " + set);

        Integer[] integers = set.toArray(new Integer[set.size()]);

        if (integers.length < K) {
            return answer;
        }

        int num = integers.length - 1;
        for (int i = 1; i < K; i++) {
            num--;
        }


        return answer = integers[num];
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
