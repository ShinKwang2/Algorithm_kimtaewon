package ch01.three_wordinsentence.mine;

import java.util.Scanner;

public class Main {
    public String solution(String str) {
        String answer = "";
        int max = 0;

        String[] strings = str.split(" ");

        for (String s : strings) {
            if (s.length() > max)
                max = s.length();
                // 2. answer = s; 를 추가하면 됨, 밑에 빼고
        }


        // 1. 생각해보니 밑에는 굳이 넣을 필요가 없음
        for (String s : strings) {
            if (max == s.length()) {
                answer = s;
                break;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String sentence = kb.nextLine();
        System.out.println(T.solution(sentence));
    }
}
