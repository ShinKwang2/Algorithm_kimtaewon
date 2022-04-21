package ch01.two_changecase.answer;

import java.util.Scanner;

public class Main {

    public String solution(String str) {
        String answer = "";

        // Character 클래스에 isUpperCase(), isLowerCase() 라고 물어보는 메소드 존

        for (char x : str.toCharArray()) {
            if (Character.isLowerCase(x))
                answer += Character.toUpperCase(x);
            else
                answer += Character.toLowerCase(x);
        }


        // ASCII 로 해보기
        // ASCII A = 65, Z = 90 & a = 97, z = 122
        /*
        for (char x : str.toCharArray()) {
            if (x >= 97 && x <= 122)
                answer += (char)(x - 32);
            else
                answer += (char)(x + 32);
        }
        */

        return answer;
    }



    public static void main(String[] args){
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
    }
}