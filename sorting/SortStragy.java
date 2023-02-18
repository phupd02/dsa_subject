package sorting;
import java.util.List;

public interface SortStragy<T extends Comparable<T>> {
     void sort(List<T> list);
}
