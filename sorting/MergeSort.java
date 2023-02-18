package sorting;
import java.util.List;
public class MergeSort<T extends Comparable<T>> implements SortStragy<T> {
    public void merge(List<T> a, List<T> b, int u, int m, int v) {
        //copy from a to b
        // Nho rang b ở day la mang trong
        for (int k = u; k <= v; k++) {
            b.set(k, a.get(k));
        }
        
        int i = u;
        int j = m + 1;
        for (int k = u; k <= v; k++) {
            if(a.get(i).compareTo(b.get(j++)) < 0) {
                a.set(k, a.get(i));
            } else if(a.get(i).compareTo(b.get(j++)) > 0) {
                a.set(k,b.get(j));
            } else if (m < i) { // m = len1;
                a.set(k,b.get(j++));
            } else {
                a.set(k,a.get(i++));
            }
        }

    }




    public void sort(List<T> list) {

    }
}
