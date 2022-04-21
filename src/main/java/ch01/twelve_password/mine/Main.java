package ch01.twelve_password.mine;

import java.util.Scanner;

public class Main {
    public String solution(int num, String str) {
        String answer = "";

        for (int i = 0; i < num * 7; i += 7) {
            String password = str.substring(i, i + 7);
            password = password.replace('#', '1');
            password = password.replace('*', '0');

            int number = Integer.valueOf(password, 2);

            answer += (char) number;
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
