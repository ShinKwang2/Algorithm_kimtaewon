package ch01.eight_validpalindrome.mine;

import java.util.Scanner;

public class Main {

    public String solution(String str) {
        String answer = "YES";
        str = str.toUpperCase();
        char[] chars = str.toCharArray();
        StringBuilder sb = new StringBuilder(str.length());

        for (int i = 0; i < chars.length; i++) {
            if (Character.isAlphabetic(chars[i])) {
                sb.append(chars[i]);
            }
        }

        str = sb.toString();
        int len = str.length();

        for (int i = 0; i < len / 2; i++) {
            if (str.charAt(i) != str.charAt(len - 1 - i)) {
                answer = "NO";
            }
        }

        return answer;
    }


    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.println(T.solution(str));
    }
}
