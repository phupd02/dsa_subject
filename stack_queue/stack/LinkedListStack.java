package Stack_With_Queue.stack;

public class LinkedListStack<T> implements Stack<T>{
    
    //class Node
    class Node<T> {
        T element;
        Node next;

        //constructor
        public Node(T element) {
            this.element = element;
            this.next = null;
        }
    }

    private Node stack = null;
    //implement interface
    @Override
    public void push(T element) {
        Node node = new Node(element);
        node.next = stack;
        stack = node;
    }

    @Override
    public T pop() {
        if(isEmpty()) {
            return null;
        }
        T element = (T) stack.element;
        stack = stack.next;
        return element;
    }

    @Override
    public boolean isEmpty() {
        return stack == null;
    }

    //printStack
    void printStack() {
        Node p = stack;
        while(stack != null) {
            System.out.print(p.element + "-->");
            p = p.next;
        }
        System.out.print("END!!!");
    }
    
}
