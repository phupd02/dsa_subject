package Stack_With_Queue.stack;

public class Main {
    public static void main(String[] args) {
        LinkedListStack stack = new LinkedListStack<>();
        Integer[] arr = {1,2,3,4,5,6,7,8,9,10};

        //enqueue elements 
        for (int i = 0; i < arr.length; i++) {
            stack.push(arr[i]);
        }

        //print
        stack.printStack();
    }
}
