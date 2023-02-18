package Week_4.queue;

public class LinkedListQueue<E> implements Queue <E> {

    class Node {
        E data;
        Node next; // go forward
        /* Danh sach móc nối 2 chiều:*/
        //Node previous // go backward
        public Node(E data) {
            this.data = data;
            this.next = null;
        }
    }
    
    private Node top = null , bot = null;
    private int n;

    //implements interface
    @Override
    public void anqueue(E value) {
        if(top == null || bot == null) {
            Node node = new Node(value);
            top = bot = node;
        } else {
            Node node = new Node(value);
            bot.next = node;
            bot = node;
            n++;
        }
    }

    @Override
    public E dequeue() {
        if(isEmpty()) {
            return null;
        }
        E data = top.data;
        top = top.next;
        n--;

        return data;
    }

    @Override
    public boolean isEmpty() {
        return top == null;
    }

    @Override
    public int size() {
        return n;
    }
    
}
