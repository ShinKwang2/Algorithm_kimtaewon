package ch01.seven_palindrome.mine;

import java.util.Scanner;

public class Main {
    public String solution(String str) {
        String answer = "YES";
        String word = str.toUpperCase();

        int lt = 0;
        int rt = word.length() - 1;

        while (lt < rt) {
            if (word.charAt(lt) != word.charAt(rt)) {
                answer = "NO";
                break;
            }
            lt++;
            rt--;
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
    }
}
