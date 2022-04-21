package ch01.seven_palindrome.answer;

import java.util.Scanner;

public class MainStringBuilder {
    public String solution(String str) {
        String answer = "NO";

        String tmp = new StringBuilder(str).reverse().toString();

        if (str.equalsIgnoreCase(tmp))
            answer = "YES";

        return answer;
    }

    public static void main(String[] args) {
        MainStringBuilder T = new MainStringBuilder();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
    }
}
