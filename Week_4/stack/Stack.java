package Week_4.stack;

import java.util.Iterator;

// Khon dung tu khoa implement do Iterable la mootjinterface kế thừa từ một interface khác
public interface Stack<T> extends Iterable<T>{
    public void push(T value);
    public T pop();
    boolean isEmpty();
    int size();
    
//Interable la interface co chuc nang cung cap cho người dụng duyet phan tu
    //lam the nao de duyet cac phan tu mà không in ra man hình bằng sử dụng sysout
}