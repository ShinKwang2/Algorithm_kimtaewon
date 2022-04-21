package ch01.two_changecase.mine;

import java.util.Scanner;

public class Main {

    public String solution(String str) {
        String answer = "";

        char[] chars = new char[str.length()];
        String strUpper = str.toUpperCase();


        for (int i = 0; i < str.length(); i++) {
            if ( str.charAt(i) == strUpper.charAt(i) ) {
                chars[i] = Character.toLowerCase(str.charAt(i));
            }
            else {
                chars[i] = Character.toUpperCase(str.charAt(i));
            }
            answer += chars[i];
        }



        return answer;
    }



    public static void main(String[] args){
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
    }
}