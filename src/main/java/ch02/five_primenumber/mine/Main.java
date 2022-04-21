package ch02.five_primenumber.mine;

import java.util.Scanner;

public class Main {
    public int solution(int num) {

//        시간 초과
        int count = 1;
        for (int i = 3; i <= num; i++) {    // num 만큼 숫자 돌기
            String result = "YES";
            for (int j = 2; j < i; j++) {   // 해당 숫자를 j 로 나누기 반복
                if (i  % j == 0) {
                    result = "NO";
                    break;
                }
            }
            if (result == "YES") {
                count++;
            }
        }
        return count;

    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int num = kb.nextInt();
        System.out.println(T.solution(num));
    }
}
