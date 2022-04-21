package ch01.ten_shortestdistance_word.mine;

import java.util.Scanner;

/** 그냥 생각없이 한 듯. 겁나 비효율적
 *
 */
public class Main {
    public String solution(String s) {
        String answer = "";
        String[] array = s.split(" ");

        int[] ints = new int[array[0].length()];


        int tmp = 0;
        int ltCount = 0;
        int rtCount = 0;
        tmp = array[0].indexOf(array[1], tmp);

        for (int i = tmp; i >= 0; i--) {
            ints[i] = rtCount++;
        }

        while (tmp != -1) {
            ltCount = 0;
            rtCount = 0;

            int lt = tmp;

            tmp = array[0].indexOf(array[1], tmp + 1);

            if (tmp == -1) {
                for (int i = lt; i < ints.length; i++) {
                    ints[i] = ltCount++;
                }
                break;
            }

            int rt = tmp;


            while (lt <= rt) {
                ints[lt] = ltCount++;
                ints[rt] = rtCount++;

                lt++;
                rt--;
            }
        }

        StringBuilder builder = new StringBuilder(100);

        for (int i = 0; i < ints.length; i++) {
            if (i != ints.length - 1)
                builder.append(ints[i] + " ");
            else
                builder.append(ints[i]);
        }

        answer = builder.toString();

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.println(T.solution(str));
    }
}
