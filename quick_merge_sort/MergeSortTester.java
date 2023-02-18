package quick_merge_sort;

public class MergeSortTester {
    public static void main(String[] args) {
        String s = "EXAMPLEMERGESORT";
        Character[] a = new Character[s.length()];
        for (int i = 0; i < a.length; i++)
        a[i] = s.charAt(i);
        MergeSort.sortVer2(a);
        for (int i = 0; i < a.length; i++) {
        System.out.print(a[i]);
        }
    }
}
