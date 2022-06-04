package ch04.two_anagram.review;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public String solution(String str1, String str2) {

        String answer = "YES";

        HashMap<Character, Integer> mapA = new HashMap<>();
        HashMap<Character, Integer> mapB = new HashMap<>();

        for (char c : str1.toCharArray()) {
            mapA.put(c, mapA.getOrDefault(c, 0) + 1);
        }
        for (char c : str2.toCharArray()) {
            mapB.put(c, mapB.getOrDefault(c, 0) + 1);
        }

        for (Character key : mapA.keySet()) {
            if (mapA.get(key) != mapB.get(key)) {
                return "NO";
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);

        String str1 = kb.next();
        String str2 = kb.next();

        System.out.println(T.solution(str1, str2));
    }
}
