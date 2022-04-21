package ch01.five_turnoversomeword.answer;

import java.util.Scanner;

public class Main {
    public String solution(String str) {
        String answer = "";
        char[] chars = str.toCharArray();

        int lt = 0;
        int rt = chars.length - 1;

        while (lt < rt) {
            if (!Character.isAlphabetic(chars[lt]))
                lt++;
            else if (!Character.isAlphabetic(chars[rt]))
                rt--;
            else {
                char tmp = chars[lt];
                chars[lt] = chars[rt];
                chars[rt] = tmp;
                lt++;
                rt--;
            }
        }
        answer = String.valueOf(chars);

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
    }
}
