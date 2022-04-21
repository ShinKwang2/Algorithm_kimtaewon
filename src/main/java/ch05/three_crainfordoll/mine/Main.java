package ch05.three_crainfordoll.mine;

import java.util.Scanner;
import java.util.Stack;

public class Main {

    public int solution(int n, int[][] arr, int m, int[] moves) {
        int answer = 0;

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < m; i++) {
            int lane = moves[i] - 1;

            for (int j = 0; j < n; j++) {
                if (arr[j][lane] == 0)
                    continue;

                if (stack.isEmpty()) {
                    stack.push(arr[j][lane]);
                    arr[j][lane] = 0;
                    break;
                }
                else if (stack.peek() == arr[j][lane]) {
                    stack.pop();
                    answer += 2;
                    arr[j][lane] = 0;
                    break;
                }
                else {
                    stack.push(arr[j][lane]);
                    arr[j][lane] = 0;
                    break;
                }
            }
        }


        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int[][] arr = new int[n][n];
        for(int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = kb.nextInt();
            }
        }

        int m = kb.nextInt();
        int[] moves = new int[m];
        for (int i = 0; i < m; i++) {
            moves[i] = kb.nextInt();
        }

        System.out.println(T.solution(n, arr, m, moves));
    }
}
