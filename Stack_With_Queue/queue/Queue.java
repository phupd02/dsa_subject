package Stack_With_Queue.queue;

interface Queue<T> {
    void enqueue(T element);
    T dequeue();
    boolean isEmpty();
}
