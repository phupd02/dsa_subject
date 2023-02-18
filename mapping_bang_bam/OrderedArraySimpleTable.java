package mapping_bang_bam;
import java.util.*;

public class OrderedArraySimpleTable <Key extends Comparable<Key>, Value> implements OrderedSimpleTable<Key, Value> {
	private static final Map Integer = null;
	private Key[] keys;
	private Value[] values;
	private int n; // size of the array
	private int default_size = 100;
	
	// Chú ý hoàn thiện hàm dựng, khởi tạo 2 mảng keys và values
	public OrderedArraySimpleTable() {
		Key[] keys = (Key[]) new Comparable[default_size];
		Value[] values = (Value[]) new Object[default_size];
	}
	

	@Override
	//Phương thức thực hiện thêm 1 phần tử vào bảng tra cứu, phần tử mới được thêm vào sao
	// cho mảng keys luôn được sắp tăng dần
	public void put(Key key, Value value) {
		int rank = rank(key);// the position to inserts "key"

		//if find 'key' in the array
		if(get(key) != null) {
			values[rank] = value;
		}

		// else can't find 'key' in the array
		else {
			n++;
			//if the array isn't overflowed 
			keys[rank] = key;
			values[rank] = value;

			// else the array is overflowed
			if(n - 1 == keys.length) {
				Key[] newKeys = (Key[]) new Comparable[default_size + 10];
				Value[] newValues = (Value[]) new Object[default_size + 10];

				//copy all 'key','value' from old array to the new array
				System.arraycopy(keys, 0, newKeys, 0, n);
				System.arraycopy(values, 0, newValues, 0, n);

				keys = newKeys;
				values = newValues;

				// move elements to the back
				for(int i = n - 1; i > rank;i--) {
					keys[i] = keys[i - 1];
					values[i] = values[i - 1];
				}

				newKeys[rank] = key;
				newValues[rank] = value;
			}
		}
	}
	
	
	//Phương thức thực hiện tìm kiếm khóa key trên mảng keys bằng thuật toán tìm kiếm nhị phân
	// kết quả trả về là chỉ số (index) của phần tử key trong mảng key
	// nếu không tìm thấy key trong mảng keys, trả lại -1
	public int binarySearch(Key key) {
		int result = rank(key);
		if(result < n) {
			return result;
		}
		return -1;
	}
	
	
	// Phương thức get, lấy ra giá trị value tương ứng với key
	// Phương thức này gọi tới phương thức binarySearch(Key key)
	@Override
    public Value get(Key key) {
		int posKey = binarySearch(key);
		if(key.compareTo(keys[posKey]) == 0) {
			return values[posKey];
		}
		return null;
	}

	
	@Override
	// xóa phần tử ra khỏi bảng tra cứu, dồn lại mảng sau khi xóa
	public void delete(Key key) {
		int posKey = binarySearch(key);
		if(posKey > -1) {
			for (int i = posKey; i < n - 1; i++) {
				keys[i] = keys[i + 1];
				values[i] = values[i + 1];
			}
			keys[--n] = null;
			values[--n] = null;
		}
	}

	@Override
	public boolean contains(Key key) {
		return get(key) != null;
	}

	@Override
	public boolean isEmpty() {
		return size() == 0;
	}

	@Override
	public int size() {
		return n;
	}

	@Override
	public Iterable<Key> keys() {
		return null;
	}

	@Override
	public Key min() {
		return null;
	}

	@Override
	public Key max() {
		return null;
	}

	@Override
	public Key floor(Key key) {
		int r = rank(key);
		int c = key.compareTo(keys[r]);
		if(r > 0) {
			if(c == 0) return keys[r];
			else return keys[r - 1];
		}
		return null;
	}
	//Cách 2: độ phức tạp cao
	// public Key floor(Key key) {
	// 	if (!isEmpty()) {
	// 		Key temp = keys[0];
	// 		for (int i = 0; i < n; i++) {
	// 			if (keys[i].compareTo(key) <= 0)
	// 				temp = keys[i];
	// 		}
	// 		return temp;
	// 	}
	// 	return null;
	// }


	@Override
	public Key ceiling(Key key) {
		if (!isEmpty()) {
			for (int i = 0; i < n; i++) {
				if (keys[i].compareTo(key) >= 0)
					return keys[i];
			}
		}
		return null;
	}

	@Override
	public int rank(Key key) {
		int u = 0;
		int v = n - 1;
		int m = u + (v - u) / 2;

		// 1 4 2 5 10 12 <---3
		//binary search
		while(u <= v) {
			if(key.compareTo(keys[m]) < 0) {
				v = m - 1;
			} else if(key.compareTo(keys[m]) > 0) {
				u = m + 1;
			} else {
				return m;
			}
		}
		return u;
		
	}

	@Override
	public Key select(int k) {
		return null;
		
	}

	@Override
	public void deleteMin() {
		
	}

	@Override
	public void deleteMax() {
		
	}

	@Override
	public int size(Key u, Key v) {
		return n;
	}

	@Override
	public Iterable<Key> keys(Key u, Key v) {

		return null;
	}

}
