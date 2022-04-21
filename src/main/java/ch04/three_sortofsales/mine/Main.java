package ch04.three_sortofsales.mine;

import java.util.*;

public class Main {

    public List<Integer> solution(int n, int k, int[] arr) {
        List<Integer> answer = new LinkedList<>();

        HashMap<Integer, Integer> map = new HashMap<>();

        int lt = 0;

        for (int i = 0; i < k; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        answer.add(map.size());

        for (int rt = k; rt < n; rt++) {

            map.put(arr[rt], map.getOrDefault(arr[rt], 0) + 1);

            map.put(arr[lt], map.get(arr[lt]) - 1);
            if (map.get(arr[lt]) == 0) {
                map.remove(arr[lt]);
            }
            lt++;

            answer.add(map.size());
        }

        return answer;
    }

    /**
     * Time Limit
     */
    public List<Integer> solutionAnother(int n, int k, int[] arr) {
        List<Integer> answer = new LinkedList<>();

        for (int i = 0; i <= n - k; i++) {
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int j = i; j < i + k; j++) {
                map.put(arr[j], map.getOrDefault(arr[j], 0) + 1);
            }
            answer.add(map.size());
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int k = kb.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }

//        for (int i : T.solution(n, k, arr)) {
//            System.out.print(i + " ");
//        }


        for (int i : T.solution(n, k, arr)) {
            System.out.print(i + " ");
        }
    }
}
