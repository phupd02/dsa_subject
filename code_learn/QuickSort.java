package code_learn;

public class QuickSort {
    
static int quickSort(int[]a, int l, int r) {
    int m = (l + r)/2;
    int key = a[m];
    int i = l;
    int j = r;
    while(i < j) {
        while(a[i] < key) {
            i++;
        }
        while(a[--j] > key) {
            j--;
        }

        if(i <= j) {
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i++;
            j--;
        }
    }
    return j;
}

    public static void main(String[] args) {
        int[] arr = {2,5,1,6,8,3,7,10,9,4};
        System.out.println(quickSort(arr, 0, arr.length));
    }
}
