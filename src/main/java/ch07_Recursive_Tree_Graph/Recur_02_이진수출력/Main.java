package ch07_Recursive_Tree_Graph.Recur_02_이진수출력;

public class Main {

    public void Recur(int n) {
        if (n == 0) {
            return;
        }
        else {
            Recur(n / 2);
            System.out.print(n % 2);
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        T.Recur(11);
    }
}
