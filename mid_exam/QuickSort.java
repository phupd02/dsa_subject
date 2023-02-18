package mid_exam;
import java.util.PriorityQueue;
import java.util.Queue;
public class QuickSort {

    public static void main(String[] args) {
        int[] array = {2,3,1,7,4,5,8};
        Queue<Integer> queue = new PriorityQueue<Integer>();
    }


    //partition - phan hoach
    public int partition(int[] a,int u, int v) {
        int i = u;
        int j = v + 1;
        int pivot = a[0];

        // 4 1 5 6 3 9
        /* pivot = 4, length = 5, i = 0, j = a.length = 6
         ++i = 1,a[i] = 1 < pivot = 4
         ++i = 2, a[i] = 5 > pivot --> break
         point ---> a[2] = 5
         --> exits the first loop

         - Begining the second loop
         --j = 5, a[j] = 9 > pivot
         --j = 4, a[j] = 3 < pivot --> break
         point ---> a[4] = 3
         swap(a, i, j) = swap(a,2,4); swap(5,3)


         - The array after swaping 5 with 3
         4 1 3 6 5 9
             *   *
         pivot = 4, i = 2, a[i] = 3
         j = 4, a[j] = 5
         ++i = 3, a[i] = 6 > pivot ---> break
         point ---> a[3] = 6
         ---> exist the first loop

         - Begin the second loop
         j = 4
         --j = 3, a[j] = 6 > pivot ---> break
         point ---> a[3] = 6

         ****i = 3, j = 3
         if(i >= j) it means we need to swap a[0] = pivot with j to completely task
         swap(a,u, j)
         return j (j = the partition position)
        */
        //partition
        while(true) {
            while(a[++i] < pivot) {
                if(i == v) break;
            }
            while(a[--j] > pivot) {
                if(j == u) break;
            }
            if(i >= j) break;
            swap(a, i, j);
        }
        swap(a,u,j);
        return j;
    }


    private void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

}

    