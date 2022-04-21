package ch01.four_turnoverword.mine;

import java.util.ArrayList;
import java.util.Scanner;

public class MainWithStringBuilder {
    public ArrayList<String> solution(int n, String[] str) {
        ArrayList<String> answer = new ArrayList<>();

        //StringBuilder 클래스를 기억해라!
        for (String word : str) {
            String tmp = new StringBuilder(word).reverse().toString();
            answer.add(tmp);
        }

        return answer;
    }

    public static void main(String[] args) {
        MainWithStringBuilder T = new MainWithStringBuilder();
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
