package ch01.four_turnoverword.mine;

import java.util.Scanner;

public class Main {
    public void solution(String str) {

        char[] chars = str.toCharArray();

        for(int i = (chars.length - 1); i >= 0; i--) {
            System.out.print(chars[i]);
        }
        System.out.println();
    }


    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int count = kb.nextInt();
        String[] words = new String[count];

        for (int i = 0; i < count; i++) {
            words[i] = kb.next();
        }

        for (String word : words) {
            T.solution(word);
        }

    }
}
