package Week_5.prepare_lecture;

public class Fibonaci {
    static int fibo(int n) {
        if(n <= 1) {
            return n;
        } else {
            return fibo(n - 1) + fibo(n -2);
        }
       
    }
    public static void main(String[] args) {
        int n = fibo(15);
        System.out.println(n);
    }
}
