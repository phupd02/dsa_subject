package Week_4.mim_go_4_3;

import java.util.Iterator;

public class LinkedListStack<T> implements StackInterface<T> {

	class Node {
		T element;
		Node next;
	}

	Node stack = null;

	@Override
	public void push(T element) {
		Node node = new Node();
        node.element = element;
        node.next = stack;
        stack = node;
	}

	@Override
	public T pop() {
		T element = stack.element;
        stack = stack.next;
        return element;
	}

	@Override
	public boolean isEmpty() {
		if(stack == null) {
            return true;
        }
        return false;
	}

	@Override
	public Iterator<T> iterator() {
		return new StackIterator();
	}

	class StackIterator implements Iterator<T> {

		private Node currentNode = stack;

		@Override
		public boolean hasNext() {
			return currentNode != null;
		}

		@Override
		public T next() {
			T data = currentNode.element;
			currentNode = currentNode.next;
			return data;
		}
	}

}
