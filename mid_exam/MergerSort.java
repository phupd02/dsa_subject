package mid_exam;

public class MergerSort {
    public static void main(String[] args) {
        int[] a = {1,4,3,7,5,9};
        int[] b = new int[6];
        sort(a, b, 0, a.length - 1);
        
        for (int i = 0; i < b.length; i++) {
            System.out.print(a[i] + " ");
        }
        

    }
    public static void merge(int[] a, int[] b, int u, int v, int m) {
        //function lam nhiem vu tron 2 mang da sap xep lai voi nhau
        // coi 2 nua cua mang la 2 mang khac nhau
        // copy a from to b
        for (int k = 0; k < a.length; k++) {
            b[k] = a[k];
        }

        // merge
        int i = u;
        int j = m + 1;

        for (int j2 = u; j2 < v; j2++) {
            if(b[i] <= b[j]) {
                a[j2] = b[i++];
            } else if(b[i] > b[j]) {
                a[j2] = b[j++];
            } else if(i > m) {
                a[j2] = b[j++];
            } else {
                a[j2] = b[i++];
            }
        }
    }

    // sort
    public static void sort(int[] a, int[] b, int u, int v) {
        if(v <= u) return;
        int m = (u + v)/2;
        sort(a,b,u,m);
        sort(a,b,m + 1, v);
        merge(a, b, u, v, m);
    }
}
