package ch01.one_findchar.answer;

import java.util.Scanner;

public class Main {
    public int solution(String str, char t) {
        int result = 0;
        str = str.toUpperCase();
        t = Character.toUpperCase(t);

        /* for문
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == t)
                result++;
        }
        */

        // forEach 에서는 iterator를 제공하는 것만 들어올 수 있음
        // 따라서 String 은 불가하기에 String을 문자 배열로 만들어주는 메소드 toCharArray() 사용
        for (char c : str.toCharArray()) {
            if (c == t)
                result++;
        }

        return result;
    }



    public static void main(String[] args) {
        Main m = new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        char c = kb.next().charAt(0);
        System.out.print(m.solution(str, c));

    }
}
