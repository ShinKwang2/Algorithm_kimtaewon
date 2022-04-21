package ch01.nine_extractionnumber.answer;

import java.util.Scanner;

/** ASCII CODE
 *  48 ~ 57 == '0' ~ '9'
 *  answer = answer * 10 + (x - 48)
 */

public class MainWithAscii {
    public int solution(String s) {
        int answer = 0;

        for (char x : s.toCharArray()) {
            if (x >= 48 && x <= 57) {
                answer = answer * 10 + (x - 48);
            }
        }

        return  answer;
    }


    public static void main(String[] args) {
        MainWithAscii T = new MainWithAscii();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
    }
}
