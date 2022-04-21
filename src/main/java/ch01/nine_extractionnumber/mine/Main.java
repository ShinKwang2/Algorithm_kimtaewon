package ch01.nine_extractionnumber.mine;

import java.util.Scanner;

public class Main {
    public int solution(String s) {
        int answer = -1;

        s = s.replaceAll("[^0-9]", "");
        Integer getInt = Integer.valueOf(s);

        return answer = getInt;
    }


    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
    }
}
