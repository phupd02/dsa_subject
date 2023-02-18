package Week_4.queue;

public interface Queue<E> {
    public void anqueue(E value);
    public E dequeue();
    boolean isEmpty();
    int size();
    
}
