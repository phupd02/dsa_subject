package binary_search_tree;

public interface BST<Key extends Comparable<Key>, Value> {
    void put(Key key, Value value);
    Value get(Key key);
    int height();
    boolean isEmpty();
    int size();
}
