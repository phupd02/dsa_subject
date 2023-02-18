package quick_merge_sort;

import java.util.Random;
import java.util.Scanner;

public class QuickSort {

    // trả về vị trí phân hoạch - tức vị trí của pivot(1 bên nhỏ hơn pivot, 1 bên
    // lơn hơn pivot)
    public static int partition(int[] a, int u, int v) {
        int i = u;
        int j = v + 1;

        int pivot = a[u];

        // begin
        while (true) {
            while (a[++i] < pivot) {
                if (i == v)
                    break;
            }

            while (a[--j] > pivot) {
                if (j == u)
                    break;
            }
            swap(a, i, j);
            if (i >= j)
                break;

        }
        swap(a, u, j);
        return j;
    }

    private static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    // print array
    public static void printArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] inputArray = new int[n];

        // Sinh so ngai nhien
        Random rd = new Random();

        // imput element
        for (int i = 0; i < n; i++) {
            int ran = rd.nextInt(n);
            inputArray[i] = ran;
        }

        // sort
        quickSort(inputArray, 0, n - 1);
        printArray(inputArray);
    }

    public static void quickSort(int[] inputArray, int u, int v) {
        int posPartition = partition(inputArray, u, v);
        quickSort(inputArray,u,posPartition);
        quickSort(inputArray,posPartition + 1, v);
    }
}
