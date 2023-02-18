package binary_search_tree;


public class TestBST {
    public static void main(String[] args) {
        ImplementsBST tree = new ImplementsBST<Integer,String>();
        tree.put(0,"B");
        tree.put(1,"M");
        tree.put(2,"P");
        tree.put(3,"L");

        for (int i = 0; i < 4; i++) {
            System.out.println(tree.get(i));
        }

    }
}
