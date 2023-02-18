package Week_4.stack;

import java.util.Iterator;

public class LinkedListStack<T> implements Stack<T> {

    class Node {
        T data;
        Node next;

        //Constructor
        public Node(T data) {
            this.data = data;
            this.next = null;
        }

    }

    private Node stack = null;
    public LinkedListStack<T>.Node head;
    
    //push()
    @Override
    public void push(T value) {
        Node node = new Node(value);
        node.next = stack;
        stack = node;
    }

    //pop()
    @Override
    public T pop() {
        if(isEmpty()) {
            return null;
        }
        T data = stack.data;
        stack = stack.next;
        return data;
    }

    //isEmpty()
    @Override
    public boolean isEmpty() {
        if(stack == null) {
            return true;
        }
        return false;
    }

    //size()
    @Override
    public int size() {
       int count = 0;
       Node p = stack;
       while(p != null) {
           count++;
           p = p.next;
       }
    return count;
    }

    // //printStack
    // public void printstack() {
    //     Node p = stack;
    //     while(p != null) {
    //         System.out.print(p.data + "-->");
    //         p = p.next;
    //     }
    //     System.out.println("NULL");
    // }

    
    // implement Iterable
    //Lớp nội
    class LinkedListIterator implements Iterator<T> {
    Node current = head;

    @Override
    public boolean hasNext() {
        return current != null;
    }

    @Override
        public T next() {
            T e = current.data;
            current = current.next;
            return e;
        }

    }

    @Override
    public Iterator<T> iterator() {
        return new LinkedListIterator();
    }

    
}
