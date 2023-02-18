package Week_1_to_3.week_1;

public class InsertionPosition {

    public static int getInsertPosition(int[] a, int x){
        int n = a.length;
        //Mảng mới
        int newArray[] = new int[n+1];

        //Sao chep gia tri sang mang moi
        for(int i = 0; i < n;i++) {
            newArray[i] = a[i];
        }
        newArray[n] = x;

        //Sắp xếp mảng mới
        for(int i = 0;i < n + 1;i++) {
            for(int j = i + 1;j < n + 1;j++) {
                if(newArray[i] > newArray[j]) {
                    int temp = newArray[i];
                    newArray[i] = newArray[j];
                    newArray[j] = temp;
                }
            }
        }

        //tìm vị tri cua so moi
        for(int i = 0;i < n + 1;i++) {
            if(newArray[i] == x) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int x = 6;
        int[] a = {1,2,3,4,5};
        int position = getInsertPosition(a,x);
        System.out.println(position);
    }

}