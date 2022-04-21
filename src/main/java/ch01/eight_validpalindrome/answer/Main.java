package ch01.eight_validpalindrome.answer;

import java.util.Scanner;

public class Main {

    public String solution(String str) {
        String answer = "NO";
        str = str.toUpperCase().replaceAll("[^A-Z]", "");
        // replace 는 정규식이 불가능하지만, replace 는 정규식 가능

        String tmp = new StringBuilder(str).reverse().toString();

        if (str.equals(tmp))
            answer = "YES";


        return answer;
    }


    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.println(T.solution(str));
    }
}
