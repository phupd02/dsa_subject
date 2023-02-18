package lib_in_java;

import java.util.ArrayList;
import java.util.Iterator;


/**
 * Iterator trong Java là một interface dùng để: 
 * - Duyệt các phần tử từ đầu đến cuối của một collection.
 * - Iterator cho phép xóa phần tử khi lặp một collection.
 * 
     *** Các phương thức trong iterator:
 * boolean hasNext(): trả về true nếu còn phần tử để duyệt
 * Object next(): trả về phần tử hiện tại và dịch chuyển con trỏ đến phần tử tiếp theo
 * void remove(): loại bỏ phần tử cuối - ít khi sử dụng
 */
public class IteratorTest {
    public static void main(String[] args) {
        
        ArrayList<Student> list = new ArrayList<Student>();
        Student student1 = new Student("Nam", 13);
        Student student2 = new Student("Nu", 14);
        list.add(student1);
        list.add(student2);


        //su dung iterable de duyet noi dung cua list
        System.out.println("Content: \n");
        Iterator<Student> iter = list.iterator();
        while(iter.hasNext()) {
            System.out.print(iter.next() + " ");
        }
    }
}
