package Week_1_to_3.week_2.card_project;

public class SimpleSort {
    static void bubbleSort(Comparable[] a) {
        for(int i = a.length - 1;i > 0;i--) {
            for(int j = 1; j < a.length ;j++) {
                if(a[j].compareTo(a[j + 1]) > 0) {
                    Comparable temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }
    
}
