package Week_1_to_3.bubble_sort;

import java.util.Scanner;
public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số phần tử của mảng: ");
        int n = sc.nextInt();
        int[] numberArray = new int[n];

        //Nhap phan tu cua mang
        for(int i = 0; i < n; i++) {
            numberArray[i] = sc.nextInt();
        }

        //In ra man hinh mang vua nhap
        for(int i = 0; i < n;i++) {
            System.out.println(numberArray[i]);
        }

        //Thực thi buble sort
        numberArray = bubbleSort(numberArray,n);

        //In ra màn hình mang sau khi da sắp xếp
        System.out.println("Mảng cần tìm là: ");
        for(int i = 0; i < n;i++) {
            System.out.print(numberArray[i] + " ");
        }
    }

    // Bubble sort xuôi: sắp xếp thoe thứ tự tăng dần
    public static int[] bubbleSort(int[] numberArray, int n) {
        for(int i = n - 1; i > 0;i--) {
            for(int j = 1; j <= n - 1; j++) {
                if(numberArray[j - 1] > numberArray[j]) {
                    int swap = numberArray[j - 1];
                    numberArray[j - 1] = numberArray[j];
                    numberArray[j] = swap;
                }
            }
        }
        return numberArray;
    }
    
    //Bubble sort ngược
    public static int[] bubbleSortVer2(int[] numberArray, int n) {
        for(int i = n - 1; i > 0; i--) {
            for(int j = 1; j < n; j++) {
                if(numberArray[j - 1] < numberArray[j]) {
                    int swap = numberArray[j - 1];
                    numberArray[j - 1] = numberArray[j];
                    numberArray[j] = swap;
                }
            }
        }
        return numberArray;
    }
}