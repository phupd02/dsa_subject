package Stack_With_Queue.queue;

public class LinkedListQueue<T> implements Queue<T>{
    
    //Class Node
    class Node<T> {
        T element;
        Node next;

        
        public Node(T element) {
            this.element = element;
            this.next = null;
        } 
    }


    //Create 
    private Node top = null,bot = null;
    private int size = 0;


    @Override
    public void enqueue(T element) {
        Node node = new Node(element);
        if(isEmpty()) {
            top = bot = node;
        } 
        bot.next = node;
        bot = node;

    }


    @Override
    public T dequeue() {
        if(isEmpty()) {
            return null;
        }

        T element = (T) top.element;
        top = top.next;
        return element;
    }


    @Override
    public boolean isEmpty() {
        return top == null;
    }

    //print queue
    void printQueue() {
        Node q = top;
        while(q != null) {
            System.out.print(q.element + "-->");
            q = q.next;
        }
        if(q == null) {
            System.out.print("End");
        }
    }

}
