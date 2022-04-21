package ch01.five_turnoversomeword.mine;

import java.util.Scanner;

public class Main {
    public char[] solution(String str) {

        char[] chars = str.toCharArray();

        int lt = 0;
        int rt = chars.length - 1;

        while (lt < rt) {
            while (!Character.isLetter(chars[lt])) {
                lt++;
            }
            while (!Character.isLetter(chars[rt])) {
                rt--;
            }

            char tmp = chars[lt];
            chars[lt] = chars[rt];
            chars[rt] = tmp;
            lt++;
            rt--;
        }

        return chars;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
    }
}
