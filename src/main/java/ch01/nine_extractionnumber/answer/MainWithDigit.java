package ch01.nine_extractionnumber.answer;

import java.util.Scanner;

/** ASCII CODE
 *  48 ~ 57 == '0' ~ '9'
 *  answer = answer * 10 + (x - 48)
 */

public class MainWithDigit {
    public int solution(String s) {
        String answer = "";

        for (char x : s.toCharArray()) {
            if (Character.isDigit(x)) {
                answer += x;
            }
        }

        return  Integer.parseInt(answer);
    }


    public static void main(String[] args) {
        MainWithDigit T = new MainWithDigit();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
    }
}
