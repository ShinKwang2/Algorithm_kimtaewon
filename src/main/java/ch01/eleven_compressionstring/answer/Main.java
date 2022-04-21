package ch01.eleven_compressionstring.answer;

import java.util.Scanner;

/**
 *  마지막을 어떻게 처리 할 것인가? 나는 if 문으로 했지만,
 *  차라리 마지막에 빈 문자열을 하나 더 추가해서 한다면 직관적이고 깔끔해진다.
 */
public class Main {
    public String solution(String s) {
        String answer = "";

        s = s + " ";
        int count = 1;

        for(int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                count++;
            }
            else {
                answer += s.charAt(i);
                if (count > 1) {
                    answer += String.valueOf(count);
                    count = 1;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
    }
}
