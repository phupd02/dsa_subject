package symbol_table_ordered;

import java.util.*;

@SuppressWarnings("unchecked")

public class OrderedArraySimpleTable <Key extends Comparable<Key>, Value> implements OrderedSimpleTable<Key, Value> {

	private Key[]  keys;
	private Value[] values;
	int n = 0, default_size = 100;
	
	
	// Chú ý hoàn thiện hàm dựng, khởi tạo 2 mảng keys và values
	public OrderedArraySimpleTable() {
		keys = (Key[]) new Comparable[default_size];
		values = (Value[]) new Object[default_size];
	}
	
	@Override
	//Phương thức thực hiện thêm 1 phần tử vào bảng tra cứu, phần tử mới được thêm vào sao
	// cho mảng keys luôn được sắp tăng dần
	public void put(Key key, Value value) {
		int r = rank(key);

		if(get(key) != null) {
			values[r] = value;
		} else {
			n++;

			/*xu ly ngoai le* - mang het su chua*/
			if(n - 1 == keys.length) {
				Key[] newKey = (Key[])new Comparable[default_size + 5];
				Value[] newValue = (Value[])new Comparable[default_size + 5];

				// sao chep data tu mang cu sang mang moi
				for (int i = 0; i < keys.length; i++) {
					newKey[i] = keys[i];
					newValue[i] = values[i];
				}
				//gan lai 2 mang cu cho mang ban dau
				keys = newKey;
				values = newValue;
			}

			for (int i = n - 1; i  > r; i--) {
				keys[i] = keys[i - 1];
				values[i] = values[i - 1];
			}

			keys[r] = key;
			values[r] = value;
		}
	}
	
	
	
	//Phương thức thực hiện tìm kiếm khóa key trên mảng keys bằng thuật toán tìm kiếm nhị phân
	// kết quả trả về là chỉ số (index) của phần tử key trong mảng key
	// nếu không tìm thấy key trong mảng keys, trả lại -1
	public int binarySearch(Key key) {
		if(!isEmpty()) {
			int idxLessKey = rank(key); // so phan tu nho bang key
			if(idxLessKey < n && (key.compareTo(keys[idxLessKey]) == 0)) {
				return idxLessKey;
			}
		}
		return -1;
	}
	
	
	// Phương thức get, lấy ra giá trị value tương ứng với key
	// Phương thức này gọi tới phương thức binarySearch(Key key)
	@Override
    public Value get(Key key) {
		int posKey = binarySearch(key);
		if (posKey >= 0) {
			return values[posKey];
		}
		return null;
	}

	
	@Override
	// xóa phần tử ra khỏi bảng tra cứu, dồn lại mảng sau khi xóa
	public void delete(Key key) {
		int posKey = binarySearch(key);
		if (posKey >= 0) {
			for (int i = posKey; i < n - 1; i++) {
				keys[i] = keys[i + 1];
			}
			keys[--n] = null;
		}
	}

	@Override
	public boolean contains(Key key) {
		// TODO Auto-generated method stub
		return get(key) != null;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return size() == 0;
	}

	@Override
	public int size() {
		return n;
	}

	@Override
	public Iterable<Key> keys() {
		List<Key> keys = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			keys.add(this.keys[i]);
		}
		return keys;
	}

	@Override
	public Key min() {
		return keys[0];
	}

	@Override
	public Key max() {
		return keys[n - 1];
	}

	@Override
	public Key floor(Key key) {
		if (!isEmpty()) {
			Key temp = keys[0];
			for (int i = 0; i < n; i++) {
				if (keys[i].compareTo(key) <= 0)
					temp = keys[i];
			}
			return temp;
		}
		return null;
	}

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
		while (u <= v) {
			int m = u + (v - u) / 2;
			int c = keys[m].compareTo(key);
			if (c < 0) {
				u = m + 1;
			} else if (c > 0) {
				v = m - 1;
			} else
				return m;
		}

		return u;
	}

	@Override
	public Key select(int k) {
		if (k < n) {
			return keys[k];
		}
		return null;
	}

	@Override
	public void deleteMin() {
		// TODO Auto-generated method stub
		delete(min());
	}

	@Override
	public void deleteMax() {
		// TODO Auto-generated method stub
		delete(max());
	}

	@Override
	public int size(Key u, Key v) {
		// TODO Auto-generated method stub
		int rankU = rank(u);
		int rankV = rank(v);
		return rankV - rankU;
	}

	@Override
	public Iterable<Key> keys(Key u, Key v) {
		// TODO Auto-generated method stub
		int rankU = rank(u);
		int rankV = rank(v);
		List<Key> keys = new ArrayList<>();
		for (int i = rankU; i < rankV; i++) {
			keys.add(this.keys[i]);
		}
		return keys;
	}

}
