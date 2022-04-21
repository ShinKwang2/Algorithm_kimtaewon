package ch01.ten_shortestdistance_word.answer;

import java.util.Scanner;

/**
 * 왼쪽에서 오른쪽으로 쭉, 오른쪽에서 왼쪽으로 쭉 하는 방법
 *  그리고 그 사이의 최솟값 구하기
 */
public class Main {
    public int[] solution(String s, char t) {
        int[] answer = new int[s.length()];

        int p = 1000;

        for (int i = 0; i < answer.length; i++) {
            if (s.charAt(i) == t) {
                p = 0;
                answer[i] = p;
            }
            else {
                p++;
                answer[i] = p;
            }
        }

        p = 1000;
        for (int i = answer.length - 1; i >= 0; i--) {
            if (s.charAt(i) == t) {
                p = 0;
            }
            else {
                p++;
                answer[i] = Math.min(answer[i], p);
            }
        }

//        for (int i = 0; i < answer.length; i++) {
//            if (s.charAt(i) == t) {
//                p = 0;
//            }
//            answer[i] = p++;
//        }
//
//        for (int i = answer.length - 1; i >= 0; i--) {
//            if (s.charAt(i) == t) {
//                p = 0;
//            }
//            answer[i] = Math.min(answer[i], p++);
//        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        char target = kb.next().charAt(0);
        for (int x : T.solution(str, target)) {
            System.out.print(x + " ");
        }
    }
}
