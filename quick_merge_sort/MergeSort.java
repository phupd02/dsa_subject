package quick_merge_sort;

public class MergeSort {


    //merge 2 subArray
    public static void merge(Comparable[] a, Comparable[] b, int u, int v, int m) {
        int i = u;
        int j = m + 1;

        // copy a from to b
        for (int j2 = 0; j2 < b.length; j2++) {
            b[j2] = a[j2];
        }

        //begin algorithm
        for (int j2 = u; j2 < v; j2++) {
            a[j2] = (lessThan(b[i],b[j])) ? b[i++] : b[j++];

            if(i > m) a[j2] = b[j++];
            if(j < m) a[j2] = b[i++];
            
        }
        

            
    }


    //Compare 2 elements
    public static boolean lessThan(Comparable x, Comparable y) {
        return x.compareTo(y) < 0;
    }

    //sort subArray with recursion
    public static void sort(Comparable[] a, Comparable[] b, int u, int v) {
        if (v <= u)
        return;
        int m = u + (v - u) / 2;
        sort(a, b, u, m);
        sort(a, b, m + 1, v);
        merge(a, b, u, m, v);
    }
    
    //sort array
    public static void sortVer2(Comparable[] a) {
        Comparable[] b = new Comparable[a.length];
        sort(a, b, 0, a.length - 1);
    }

}

