package ch07_Recursive_Tree_Graph.Recur_03_팩토리얼;

public class Main {

    public int Recur(int n) {
        if (n == 1) {
            return 1;
        }
        else {
            return n * Recur(n - 1);
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        System.out.println(T.Recur(5));
    }
}
