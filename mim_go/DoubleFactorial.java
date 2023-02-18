package mim_go;

public class DoubleFactorial {
    public static int computeDoubleFactorial(int n) {
        if(n <= 2) {
            return n;
        }
        return n * computeDoubleFactorial(n - 2);

    }
    
    //Giai thua
    public static int computeFactorial(int n) {
        if(n <= 1) {
             return 1;
        }
        return n * computeFactorial(n -1);
    }

    public static void main(String[] args) {
        System.out.println(computeFactorial(3));
        System.out.println(computeDoubleFactorial(4));
    }
}
