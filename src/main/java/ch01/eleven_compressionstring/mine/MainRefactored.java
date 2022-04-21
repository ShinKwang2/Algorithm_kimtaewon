package ch01.eleven_compressionstring.mine;

import java.util.Scanner;

/**
 * toCharArray 로 했는데, 그냥 String 으로 리팩토링 ㄱㄱ
 */
public class MainRefactored {
    public String solution(String s) {
        String answer = "";
        int count = 1;

        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                count++;
            }
            else {
                answer += s.charAt(i);

                if (count > 1) {
                    answer += count;
                }
                count = 1;
            }

            if(i == s.length() - 2) {
                if (s.charAt(i) != s.charAt(i + 1)) {
                    answer += s.charAt(i + 1);
                }
                else {
                    answer += s.charAt(i);
                    answer += count;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        MainRefactored T = new MainRefactored();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
    }
}
