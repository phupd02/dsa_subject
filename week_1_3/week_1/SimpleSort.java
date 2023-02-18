package Week_1_to_3.week_1;

import java.util.Random;
import java.util.Scanner;


public class SimpleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập số phần tử của mảng: ");
        int n = sc.nextInt();

        int[] numberArray = new int[n];

        System.out.println("Nhập các phần tử của mảng");
        for(int i = 0; i < n;i++) {
            numberArray[i] = sc.nextInt();
        }

        // Xáo trộn các phần tử
        shuffle(numberArray);
        
        // Bubble Sort ngược
        reverseBubbleSort(numberArray);
        
        //In mang
        printArray(numberArray);

    }

//thuat toan sap xep bubble sort xuôi
public static void bubbleSort(int[] a) {
    int n = a.length;
    for(int i = n - 1; i > 0; i--) {
        for(int j = 1; j < n; j++) {
            if(a[j - 1] > a[j]) {
                swap(a,j - 1,j);
            }
        }
    }
}

//bubble sort nguoc
public static void reverseBubbleSort(int[] a) {
    int n = a.length;

    //Sắp xếp ngược theo chỉ số
    for(int i = 1; i < n; i++) {
        for(int j = 1; j < n;j++) {
            if(a[j - 1] > a[j]) {
                swap(a,j - 1,j);
            }
        }
    }

    // Sắp xếp theo thứ tụ giảm dần
    // for(int i = n - 1;i > 0;i--) {
    //     for(int j = 1; j < n; j++) {
    //         if(a[j - 1] < a[j]) {
    //             swap(a,j - 1,j);
    //         }
    //     }
    // }

}

//ham swap
public static void swap(int[] a, int i,int j) {
    int temp = a[i];
    a[i] = a[j];
    a[j] = temp;
}

// shuffle
public static void shuffle(int[] a) {
    Random rand = new Random();
    for(int i = 0; i < a.length;i++) {
        int j = rand.nextInt(a.length);
        swap(a,i,j);
    }
}

//sap xep chon
public static void selectionSort(int[] a) {
    int n = a.length;

    for(int i = 0; i < n - 1;i++) {
        for(int j = i + 1; i < n;i++) {
            if(a[i] > a[j]) {
                swap(a,i,j);
            }
        }
    }
}

// sap xep chọn theo thu tu tang dan
public static void reverseSelectionSort(int[] a) {
    int n = a.length;

    for(int i = 0;i < n;i++) {
        for(int j = i + 1;j < n;j++) {
            if(a[i] < a[j]) {
                swap(a,i,j);
            }
        }
    }
}

// In mang
public static void printArray(int[] numberArray) {
    for(int i = 0; i < numberArray.length;i++) {
        System.out.print(numberArray[i] + " ");
    }
}

}
