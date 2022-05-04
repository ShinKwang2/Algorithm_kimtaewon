package ch05.three_crainfordoll.review;

import java.util.Scanner;
import java.util.Stack;

public class Main {

    public int solution(int n, int count, int[][] board, int[] moves) {
        int answer = 0;

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < count; i++) {
            int line = moves[i] - 1;

            for (int j = 0; j < n; j++) {

                if (board[j][line] == 0) {
                    continue;
                }

                if (!stack.isEmpty() && board[j][line] == stack.peek()) {
                    stack.pop();
                    answer += 2;
                    board[j][line] = 0;
                }
                else {
                    stack.push(board[j][line]);
                    board[j][line] = 0;
                }
                break;
            }
        }


        for (int i = 0; i < stack.size(); i++) {
            System.out.print(stack.get(i) + " ");
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[][] board = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = kb.nextInt();
            }
        }

        int count = kb.nextInt();
        int[] moves = new int[count];

        for (int i = 0; i < count; i++) {
            moves[i] = kb.nextInt();
        }

        System.out.println(T.solution(n, count, board, moves));

    }
}
