package ch01.one_findchar.mine;

import java.util.Scanner;

public class Main {
    public int solution(String str, char t) {
        int count = 0;
        str = str.toUpperCase();
        t = Character.toUpperCase(t);

        char[] chars = str.toCharArray();
        // 생각해보면, 굳이 char[] 로 만들 필요가 없다.
        // 이미 String 을 index 로 할 수 있는 charAt 이 있기 때문이다.


        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == t)
                count++;
        }

        return count;
    }



    public static void main(String[] args) {
        Main m = new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        char c = kb.next().charAt(0);
        System.out.print(m.solution(str, c));

    }
}
