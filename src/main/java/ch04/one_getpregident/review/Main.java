package ch04.one_getpregident.review;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public char solution(int n, String str) {
        char result = ' ';
        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : str.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        System.out.println(map.containsKey('F'));
        System.out.println(map.size());
        System.out.println(map.remove('A'));
        System.out.println(map.size());


        int max = Integer.MIN_VALUE;
        for (Character key : map.keySet()) {
            if (max < map.get(key)) {
                max = map.get(key);
                result = key;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        String str = kb.next();

        System.out.println(T.solution(n, str));
    }
}
