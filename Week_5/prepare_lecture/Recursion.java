package Week_5.prepare_lecture;

public class Recursion {
    public static void main(String[] args) {
        int n = 3;
        count(n);
    }

    static void count(int n) {
        if(n >= 0) {
            System.out.println(n);
            count(n-1);
        }
        
    }
}
