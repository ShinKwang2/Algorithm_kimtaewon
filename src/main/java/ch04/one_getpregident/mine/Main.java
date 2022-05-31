package ch04.one_getpregident.mine;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public Character solution(int n, String str) {
        char answer = ' ';

        HashMap<Character, Integer> map = new HashMap<>();

        for (char x : str.toCharArray()) {
            if (map.containsKey(x)) {
                map.put(x, map.get(x) + 1);
            }
            else {
                map.put(x, 1);
            }
        }

        int max = 0;
        for (Character c : map.keySet()) {
            if (map.get(c) > max) {
                max = map.get(c);
                answer = c;
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
