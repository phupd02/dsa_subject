package Week_4.mim_go_4_3;

public interface StackInterface<T> extends Iterable<T> {

	public void push(T element);

	public T pop();

	public boolean isEmpty();

}
