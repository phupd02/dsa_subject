package Stack_With_Queue.array_stack;

import java.util.Iterator;
public class SimpleArrayList<T> implements ListInterface<T> {

	private T[] array;
	private int n = 0;
	private int defaultSize = 100;

	public SimpleArrayList() {
		array = (T[]) new Object[defaultSize];
	}

	public SimpleArrayList(int capacity) {
		// Hàm dựng với kích thước mảng là capacity
		array = (T[]) new Object[capacity];
	}

	public void add(T data) {
	    array[n] = data;
	    ++n;
	
	}

	public T get(int i) { 
	    return array[i];
	}

	public void set(int i, T data)
	{
	    array[i] = data;
	}
	public void remove(int i) {
	
	    T[] temp = (T[]) new Object[array.length - 1];
	    int index = 0;
	    for(int j= 0; j < array.length; ++j){
	        if(j== i) break;
	        temp[index] = array[j];
	        index++;
	    }
	}

	public boolean isContain(T data) {
	    for(int i = 0; i < array.length; ++i){
	        if(array[i].equals(data)) return true;
	    }
		
		return false;
	}
	
	public int indexOf(T data)
	{
	    for(int i = 0; i < array.length; ++i){
	        if(array[i] != null && array[i].equals(data)) return i;
	    }
		return -1;
	}

	public int size() {
		return n;
	}

	public boolean isEmpty() {
		return n==0;
	}

	public Iterator<T> iterator() {
		return new ArrayListIterator();
	}
	
	class ArrayListIterator implements Iterator<T>
	{
		private int current = 0;
		@Override
		public boolean hasNext() {
			return current  < n;
		}

		@Override
		public T next() {
			T data = array[current];
			current++;
			return data;
		}
		
	}

}
