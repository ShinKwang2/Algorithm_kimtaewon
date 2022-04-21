package ch01.four_turnoverword.answer;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public ArrayList<String> solution(int n, String[] str) {
        ArrayList<String> answer = new ArrayList<>();

        // StringBuilder 사용법
//        for (String word : str) {
//            StringBuilder builder = new StringBuilder(word);
//            String reversedWord = builder.reverse().toString();
//            answer.add(reversedWord);
//        }

        // 일일이 매칭해서 교환하기
        for (String word : str) {
            char[] chars = word.toCharArray();
            int lt = 0;
            int rt = chars.length - 1;

            while (lt < rt) {
                char tmp = chars[lt];
                chars[lt] = chars[rt];
                chars[rt] = tmp;
                lt++;
                rt--;
            }
            // String.valueOf(char[] data)
            String tmp = String.valueOf(chars);
            answer.add(tmp);
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int count = kb.nextInt();
        String[] words = new String[count];

        for (int i = 0; i < count; i++) {
            words[i] = kb.next();
        }

        for (String word : T.solution(count, words)) {
            System.out.println(word);
        }
    }
}
