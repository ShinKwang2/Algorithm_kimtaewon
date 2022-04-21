package ch01.three_wordinsentence.answer;

import java.util.Scanner;

public class Main {
    public String solution(String str) {
        String answer = "";
        int max = Integer.MIN_VALUE;    // 가장 작은 값으로 설정

        // String의 split 메소드
        String[] s = str.split(" ");

        for (String x : s ) {
            int len = x.length();
            if (len > max) {
                max = len;
                answer = x;
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
