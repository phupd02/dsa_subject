package sorting;
import java.util.Collections;
import java.util.List;

public class QuickSort<T extends Comparable<T>> implements SortStragy<T> {

    public int partition(List<T> list, int u, int v) {
        int i = u;
        int j = v + 1;
        T pivot = list.get(u);
        while(u <= v) {
            while(list.get(++i).compareTo(pivot) < 0) {// neu dung thì ++i
                if(i == v); break;
            }
            while(list.get(--j).compareTo(pivot) > 0) {
                if(j == u); break;
            }
            if(i >= j) 
                break;
                swap(list,i,j);
            
        }
        swap(list,u,j);
        return j;
    }

    public void swap(List<T> list, int a, int b) {
		T temp = list.get(a);
		list.set(a, list.get(b));
		list.set(b, temp);
	}

    public void sort(List<T> list,int u, int v) {
        if(v <= u) {
            return;
        }
        int j = partition(list, u, v);
        sort(list, u, j - 1);
        sort(list, j + 1, v);
    }
    
    public void sort(List<T> list) {
		Collections.shuffle(list);
		sort(list, 0, list.size() - 1);
	}
}

