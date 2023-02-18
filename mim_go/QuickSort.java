package mim_go;

public class QuickSort{
    
    
    public int partition(int[] a)
    {
        double average = calAverage(a);
        int key = findKey(a,average);
        int temp = a[key];
        a[key] = a[0];
        a[0] = temp;
        int u = 0;
        int v = a.length - 1;
        int i = u;
        int j = v + 1;
        while(true){
            while(a[++i] < a[u])
                if(i == v) break;
            while(a[u] < a[--j])
                if( j == u) break;
            if (i >= j) break;
            swap(a,i,j);
        }
        swap(a,u,j);
        return j;
        
    }
    
    public void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    //cal Average
    public static double calAverage(int[] a) {
        int sum = 0;
        for(int i = 0;i < a.length;i++) {
            sum = sum + a[i];
        }
        double average = sum / a.length;
        return average;
    }
    
    //find key 
    public static int findKey(int[]a, double average) {
        double minDelta = Math.abs(a[0] - average);
    
        for (int i = 1; i < a.length; i++) {
            if(Math.abs(a[i] - average) <= minDelta) {
                minDelta = Math.abs(a[i] - average);
            }
        }
       
        for (int i = 0; i < a.length; i++) {
            if(Math.abs(a[i] - average) == minDelta) {
                return i;
            }
        }

        return 0;
    }
    
    


    public static void main(String[] args) {
        QuickSort q = new QuickSort();
        
        int[] a = {1,2,5,3,4,1,3,4,5,6,10};
        
        int key = q.partition(a);
        
        System.out.println("key = "+a[key]+" index = "+key);
        System.out.print("Array a = ");
        for(int i = 0 ; i < a.length ; i++)
            System.out.print(a[i]+" ");
    }
    
}