package ch04.one_getpregident.answer;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public char solution(int n, String str) {
        char answer = ' ';

        HashMap<Character, Integer> map = new HashMap<>();

        // getOrDefault
        for (char x : str.toCharArray()) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        // containsKey
        System.out.println(map.containsKey('F'));
        // size
        System.out.println(map.size());
        // remove
        System.out.println(map.remove('A'));
        System.out.println(map.size());

        int max = Integer.MIN_VALUE;
        for (char key : map.keySet()) {
//            System.out.println(key + " " + map.get(key));

            if (map.get(key) > max) {
                max = map.get(key);
                answer = key;
            }
        }


        return answer;
    }


    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        String str = kb.next();

        System.out.println(T.solution(n, str));

    }
}
