package ch01.eleven_compressionstring.mine;

import java.util.Scanner;

public class Main {
    public String solution(String s) {
        String answer = "";
        char[] chars = s.toCharArray();
        int count = 1;

        StringBuilder builder = new StringBuilder(100);

        for (int i = 0; i < chars.length - 1; i++) {

            if (chars[i] == chars[i + 1]) {
                count++;
            }
            else {
                builder.append(chars[i]);
                if (count != 1) {
                    builder.append(count);
                }
                count = 1;
            }

            if (i == chars.length - 2) {
                if (chars[i] != chars[i + 1]) {
                    builder.append(chars[i + 1]);
                }
                else {
                    builder.append(chars[i]);
                    builder.append(count);
                }
            }
        }

        answer = builder.toString();

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
    }
}
