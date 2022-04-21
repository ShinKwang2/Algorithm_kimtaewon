package ch04.four_everyanagram.mine;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public int solution(String a, String b) {
        int answer = 0;
        int len = b.length();

        char[] arrayA = a.toCharArray();

        HashMap<Character, Integer> mapA = new HashMap<>();
        HashMap<Character, Integer> mapB = new HashMap<>();
        for (char key : b.toCharArray()) {
            mapB.put(key, mapB.getOrDefault(key, 0) + 1);
        }


        for (int i = 0; i < len - 1; i++) {
            mapA.put(arrayA[i], mapA.getOrDefault(arrayA[i], 0) + 1);
        }


        int lt = 0;
        for (int rt = len - 1; rt < arrayA.length; rt++) {
            mapA.put(arrayA[rt], mapA.getOrDefault(arrayA[rt], 0) + 1);
            if (mapA.equals(mapB)) {
                answer++;
            }

            mapA.put(arrayA[lt], mapA.get(arrayA[lt]) - 1);
            if (mapA.get(arrayA[lt]) == 0) {
                mapA.remove(arrayA[lt]);
            }
            lt++;

        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String a = kb.next();
        String b = kb.next();

        System.out.println(T.solution(a, b));
    }
}
