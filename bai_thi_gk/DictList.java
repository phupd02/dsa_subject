package bai_thi_gk;

import java.util.*;

@SuppressWarnings("unchecked")
public class DictList<T> implements ListInterface<T>{
    private T[] array;
    private int n = 0;

    
    public DictList() {
        array = (T[]) new Object[5];
    }

    // override
    @Override
	public void add(T data) {
       n++;
       array[n - 1] = data;
       if(n > array.length) resize();
	}

	private void resize() {
        T[] newArray = (T[]) new Object[n + 5];
        for (int i = 0; i < n; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
    }

    @Override
	public T get(int i) {
        if(i < n) return array[i];
        else return null;
	}

	@Override
	public int size() {
		return n;
	}

	@Override
	public boolean isEmpty() {
		return n == 0;
    }
}
