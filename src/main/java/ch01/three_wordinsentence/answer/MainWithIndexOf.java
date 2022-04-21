package ch01.three_wordinsentence.answer;

import java.util.Scanner;

public class MainWithIndexOf {
    // indexOf, substring 을 활용해서 풀어보기
    public String solution(String str) {
        String answer = "";
        int max = Integer.MIN_VALUE;    // 가장 작은 값으로 설정
        int pos;

        while ((pos = str.indexOf(" ")) != -1) {
            String tmp = str.substring(0, pos);
            int len = tmp.length();

            if (len > max) {
                max = len;
                answer = tmp;
            }
            str = str.substring(pos + 1);

            if (str.length() > max) {
                answer = str;
            }
        }

        return answer;
    }


    public static void main(String[] args) {
        MainWithIndexOf T = new MainWithIndexOf();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.println(T.solution(str));
    }
}
