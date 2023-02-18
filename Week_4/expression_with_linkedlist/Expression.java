package Week_4.expression_with_linkedlist;

public class Expression{
    
    public boolean isValidExpr(String expr)
    {
        return false;
    }
    
    public static void main(String[] args)
    {
        
        Expression expr = new Expression();
        String f = "a+b-c(3+a)";
        System.out.println(expr.isValidExpr(f));
        
    }
    
    
}

