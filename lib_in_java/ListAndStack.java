package lib_in_java;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class ListAndStack {
    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<Integer>();
    
        for (int i = 0; i < 10; i++) {
            queue.add(i);
        }

        //print queue after add
        System.out.println(queue);

        //remove method
        System.out.println("RETURN THE HEAD OF THIS QUEUE AFTER REMOVE: "+ queue.remove());
        System.out.println(queue);

        //test peek method
        System.out.println("RETURN THE HEAD OF THIS QUEUE BUT NOT REMOVE: " + queue.peek());
        System.out.println(queue);

        /*peek = get the first element but not remove
        poll = get the first element of the queue and remove
        */

        //test offer method
        queue.offer(11);
        System.out.println(queue);


        //test Stack
        System.out.println("STACK!!!");

        Stack<Integer> stack = new Stack<Integer>();
    
        for (int i = 0; i < 10; i++) {
           stack.push(i);
        }

        //print
        System.out.println(stack);

        //pop
        stack.pop();
        System.out.println("STACK AFTER POP");
        System.out.println(stack);

        //peek
        System.out.println("PEEK " + stack.peek());
        System.out.println("Search" + stack.search(0));
        
    }
}
