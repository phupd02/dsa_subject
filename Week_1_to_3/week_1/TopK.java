package Week_1_to_3.week_1;

public class TopK {

    /*
     * Hoàn thiện phương thức getTopk trả lại giá trị lớn thứ k trong dãy
     * k <= a.length
     */
    public static int getTopk(int[] a, int k)
    {
        int n = a.length;
        for(int i = 0; i < n - 1;i++) {
            for(int j = i + 1;j < n;j++) {
                if(a[i] < a[j]) {
                   int temp = a[i];
                   a[i] = a[j];
                   a[j] = temp;
                }
            }
        }
        return a[k-1];
    }

    public static void main(String[] args) {
        int[] a = { 1, 3, 2, 1, 4, 5, 7, 9, 8, 5, 6 };
        int k = 3;

        System.out.printf("Phần tử lớn thứ %d là: %d", k, getTopk(a, k));

    }
}