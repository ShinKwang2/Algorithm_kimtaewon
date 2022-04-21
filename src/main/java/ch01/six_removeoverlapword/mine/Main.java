package ch01.six_removeoverlapword.mine;

import java.util.Scanner;

public class Main {

    public String solution(String str) {
        String answer = "";

        char[] chars = str.toCharArray();

        for (int i = 0; i < chars.length - 1; i++) {
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    chars[j] = 0;
                }
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
