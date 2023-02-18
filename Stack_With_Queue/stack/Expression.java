package Stack_With_Queue.stack;

public class Expression {

    public boolean isValidExpr(String expr)
    {
        Stack<String> stack = new LinkedListStack<>();
        for(int i = 0; i < expr.length(); i++) {
            char c = expr.charAt(i);
            if(c == '(') {
                stack.push(c + "");
            } else {
                if(stack.isEmpty()) {
                    return false;
                } else {
                    stack.pop();
                }
            }
        }
        return expr.isEmpty();
    }

public static void main(String[] args)
    {
        
        Expression expr = new Expression();
        String f = "a+b-c(3+a)";
        System.out.println(expr.isValidExpr(f));
    }
}