package Week_4.stack;

import java.util.Arrays;
import java.util.Iterator;

public class ArrayStack<E> implements Stack<E> {
    private E[] array;
    private int top = 0;
    private static int capacity = 100;


    public ArrayStack(int capacity) {
         array = (E[]) new Object[capacity];
    }


    @Override
    public void push(E value) {
        // Lon hon dung luongj mạng
        // Tao mot mang moi sau do copy cac phyan tu sang
        if(top >= array.length) {
            E[] temp = (E[]) new Object[capacity];
            //copy sang mang moi
            for (int j = 0; j < array.length; j++) {
                temp[j] = array[j];
                array = temp;
            }
        }
        array[top] = value;// ưu tiên sử dụng cách này
        top++;
        //cách khac: array[top++] = value;
        //array[++top] = value : Wrong
    }

    @Override
    public E pop() {
        E e = array[top];
        top--;
        return e;
        //Cách 2: return array[top--]; // trả về array[top] sau đó giảm top 1 đơn vị
    }

    @Override
    public boolean isEmpty() {
        return top == 0;
    }

    @Override
    public int size() {
        return top;
    }


    public static void main(String[] args) {
        Stack<Integer> stack = new ArrayStack<Integer>(capacity);
        Integer[] arr = {1,2,3,4,5,6,7,8,9};

        for (int i = 0; i < arr.length; i++) {
            stack.push(arr[i]);
        }
        System.out.println("Size = " + stack.size());
        System.out.println(stack.pop() + " " + stack.pop());
        System.out.println("Size + " + stack.size());

        while(!stack.isEmpty()) {
            System.out.println(stack.pop() + " ");
        }

    }


    @Override
    public Iterator<E> iterator() {
        return new ArrayStackIterator();
    }

    class ArrayStackIterator implements Iterator<E> {

        int index = top;
        
        @Override
        public boolean hasNext() {
            return index > 0;
        }

        @Override
        public E next() {
            return array[--index];
        }
    }
}
