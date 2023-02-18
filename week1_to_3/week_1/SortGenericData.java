package Week_1_to_3.week_1;

import java.util.Comparator;
import java.util.Random;

@SuppressWarnings("unchecked")
public class SortGenericData {

    // Phương thức sắp xếp cho dữ liệu có giao diện Comparable (có thể so sánh được)
    public static void sort(Comparable[] a) {
        int n = a.length;

        for(int i = 0; i < n - 1;i++) {
            for(int j = i + 1;j < n;j++) {
                if(a[i].compareTo(a[j]) > 0) {
                   Comparable temp = a[i];
                   a[i] = a[j];
                   a[j] = temp;
                }
            }
        }

    }

    // Phương thức sắp xếp cho dữ liệu tổng quát T, thông qua bộ so sánh compare
    //<T> dinh nghia kieu du kieu bat ky - kieu du lieu cua doi tuong
    public static <T> void sort(T[] a, Comparator<T> comp) {
        int n = a.length;

        for(int i = 0; i < n - 1;i++) {
            for(int j = i + 1;j < n;j++) {
                if(comp.compare(a[i], a[j]) > 0) {
                   T temp = a[i];
                   a[i] = a[j];
                   a[j] = temp;
                }
            }
        }

    }

    //Hàm print
    public static void printArray(Object[] a) {
        int n = a.length;
        for(int i = 0;i < n - 1;i++) {
            System.out.print(a[i] + " ");
        }
    }

    // Viết một hàm shuffle
    public static void shuffle(Object[] a) {
        int n = a.length;
        Random rand = new Random();

        for(int i = 1;i < n - 1;i++) {
            int j = rand.nextInt(a.length);
            Object temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }

    }
    public static void main(String[] args) {
        // String[] a = {"a", "b", "c", "d","e", "f", "g"," h"};

        // System.out.println("Mang ban dau: ");
        // printArray(a);

        // System.out.println("Tron: ");
        // shuffle(a);
        // printArray(a);

        // System.out.println("Sap xep ve ban dau: ");
        // sort(a);
        // printArray(a);



        Integer[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        Comparator<Integer> comp = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {

                if (o1 % 2 == o2 % 2)
                    return o1 - o2;
                else
                    return o1 % 2 - o2 % 2;
            }
        };

        sort(a, comp);
        for (int i = 0; i < a.length; i++)
            System.out.println(a[i]);
    }

}