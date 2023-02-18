package Stack_With_Queue.array_stack;
public interface ListInterface<T> extends Iterable<T>{

	public void add(T data);
	public T get(int i);
	public int size();
	public boolean isEmpty();
}
