package ch04.two_anagram.mine;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public String solution(String a, String b) {

        String answer = "YES";

        char[] charsA = a.toCharArray();
        char[] charsB = b.toCharArray();

        HashMap<Character, Integer> mapA = new HashMap<>();
        HashMap<Character, Integer> mapB = new HashMap<>();

        for (int i = 0; i < charsA.length; i++) {
            mapA.put(charsA[i], mapA.getOrDefault(charsA[i], 0) + 1);
            mapB.put(charsB[i], mapB.getOrDefault(charsB[i], 0) + 1);
        }

//        boolean equals = mapA.equals(mapB);
//        if (equals)
//            return answer;
//        else
//            return answer = "NO";

        for (char key : mapA.keySet()) {
            if (mapA.get(key) != mapB.get(key))
                answer = "NO";
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
