package Recursion;

public class Factorial {
    
    static int calFactorial(int n) {
        if(n < 2) {
            return 1;
        } else {
            return n * calFactorial(n - 1);
        }
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(calFactorial(n));
    }
}
