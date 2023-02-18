package Week_4.stack;

public class App {
    public static void main(String[] args) {
        Stack<Integer> stack = new LinkedListStack<Integer>();
        Integer[] arr = {1,2,3,4,5,6,7,8,9};

        for (int i = 0; i < arr.length; i++) {
            stack.push(arr[i]);
        }
        System.out.println("Size = " + stack.size());
        System.out.println(stack.pop() + " " + stack.pop());
        System.out.println("Size + " + stack.size());

        while(!stack.isEmpty()) {
            System.out.println(stack.pop() + " ");
        }

    }
}
