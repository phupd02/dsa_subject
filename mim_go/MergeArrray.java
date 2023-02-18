package mim_go;

public class MergeArrray {
    public int[] mergeArray(int[] a, int[] b) {
       int[] c = new int[a.length + b.length];
       int i = 0;
       int j = a.length;

       for (int k = 0; k < c.length; k++) {
           if(a[i] < b[j]) {
                c[k++] = a[i];
           } else if(a[i] > b[j]) {
                c[k++]  = b[i];
           } else if(i > j) {
                c[k++] = b[j];
           } else {
               c[k++] = a[i];
           }
       }
       return c;
    }
}
