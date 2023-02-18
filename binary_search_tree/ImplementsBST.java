package binary_search_tree;

public class ImplementsBST<Key extends Comparable<Key>, Value> implements BST<Key, Value> {
    private int n = 0;

    //Node class
    class Node {
        Key key;
        Value value;
        Node right, left;

        public Node(Key key, Value value) {
            this.key = key;
            this.value = value;
        }
    }

    private Node root;
    //implement BST

    //inserts to the last position
    @Override
    public void put(Key key, Value value) {
       root = put(root,key,value);
    }

    //private put
    private Node put(Node node, Key key, Value value) {
        // if node == null, create new node
        if(node == null) {
           node = new Node(key,value);
        }

        /*if root != null, recursive down to subtree 
        if key < node.key --> go left
        if(key > node.key --> go right
        if(key == node.key ---> search hit*/
        if(key.compareTo(node.key) > 0) {
            node.right = put(node.right,key,value);
        } else if(key.compareTo(node.key) < 0) {
            node.left = put(node.left,key,value);
        } else {
            node.value = value;
        }
        return node;
        }
    //get
    @Override
    public Value get(Key key) {
        Node p = root;
        while(p != null) {
            if(key.compareTo(p.key) > 0) {
                p = p.right;
            } else if(key.compareTo(p.key) < 0)  {
                p = p.left;
            } else {
                return p.value;
            }
        }
        return null;
    }

    @Override
    public int height() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return n == 0;
    }

    @Override
    public int size() {
        return n;
    }
    
}
