package symbol_table;

public abstract class AbstractSymbolTable<Key extends Comparable<Key>, Value> 
        implements SymbolTable<Key,Value> {

    //get Key
    public boolean contain(Key key) {
        return get(key) != null;
    }

    //delete Key
    public void delete(Key key) {
        put(key,null);
    }

    //put
    public void put(Key key, Value value) {
        key = (Key) value;
    }
}
