package ch01.twelve_password.answer;

import java.util.Scanner;

public class Main {
    public String solution(int num, String str) {
        String answer = "";

        for (int i = 0; i < num; i++) {
            String tmp = str.substring(0, 7).replace('#', '1').replace('*', '0');
            int number = Integer.parseInt(tmp, 2);

            answer += (char) number;

            str = str.substring(7);
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int number = kb.nextInt();
        String message = kb.next();
        System.out.println(T.solution(number, message));

    }
}
