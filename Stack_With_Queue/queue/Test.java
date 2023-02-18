package Stack_With_Queue.queue;

public class Test {
    public static void main(String[] args) {
        LinkedListQueue queue = new LinkedListQueue<>();

        Integer[] arr = {1,2,3,4,5,6,7,8,9,10};
        //enqueue elements 
        for (int i = 0; i < arr.length; i++) {
            queue.enqueue(arr[i]);
        }

        //print
        queue.printQueue();

        //enqueue
        queue.enqueue(100);
        System.out.println("ENQUEUE!!");
        queue.printQueue();

        //DEQUEUE
        queue.dequeue();
        System.out.println("DEQUEUE!!");
        queue.printQueue();

    }
}
