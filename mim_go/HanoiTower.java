package mim_go;

public class HanoiTower {
    static void move(char a, char b, char c,int n) {
        int count = 0;
        if(n == 1) {
            System.out.println("Move " + a + "---->" + c);
        } else {
            move(a,c,b,n-1);
            move(a,' ',c,1);
            move(b,a,c,n-1);
        }
    }
    public static void main(String[] args) {
        move('a','b','c',3);
        
    }
}
