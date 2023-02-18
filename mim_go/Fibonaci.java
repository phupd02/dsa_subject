package mim_go;

public class Fibonaci {
    static int fibonaci(int n) {
        if(n < 2) {
            return n;
        } else {
            return fibonaci(n - 1) + fibonaci(n - 2);
        }
    }
    public static void main(String[] args) {
        System.out.println(fibonaci(7));
    }
}
