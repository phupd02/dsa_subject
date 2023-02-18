package Week_4.queue;

public class ArrayQueue<E> implements Queue<E> {
    E[] array;
    int front = 0;
    int count;

    // add 100 elements > front = 0; rear = 100;
    //remove 90 elements ===> front = 90, rear = 100
    // add 50 elements: array[(front + count) % capacity]
    @Override
    public void anqueue(E value) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public E dequeue() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean isEmpty() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public int size() {
        // TODO Auto-generated method stub
        return 0;
    }
    
}
