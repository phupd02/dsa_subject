package Week_4.stack;

public class Expression {

    private static final char VALUE = '(';

    /**
     *
     */

    public boolean isValidExpr(String expr) {
        return false;
    }

    public static void main(String[] args) {
        
        Expression expr = new Expression();
        String f = "a+b-c(3+a)";



        System.out.println(expr.isValidExpr(f));
        
    }

}