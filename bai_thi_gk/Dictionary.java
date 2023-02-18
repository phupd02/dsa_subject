package bai_thi_gk;


@SuppressWarnings("unchecked")
public class Dictionary {
    private DictList<String> enList = null; // Danh sách lưu các từ tiếng Anh
	private DictList<String> viList = null; // Danh sách lưu các từ tiếng Việt
	
	//Phương thức loadDictionary(String[] en, String[] vi), phương thức này thực hiện nạp từ điển, 
	//lưu các phần tử trong mảng en vào danh sách chứa các từ tiếng Anh, 
	//và các phần từ trong mảng vi vào danh sách chứa các từ tiếng Việt.
    //
	public void loadDictionary(String[] en, String[] vi) {
        // nap cac tu tieng anh
	    enList = new DictList<String>();
        for (int i = 0; i < en.length; i++) {
            enList.add(en[i]);
            
        }

        // nap cac tu tieng viet
        viList = new DictList<String>();
        for (int i = 0; i < vi.length; i++) {
            viList.add(vi[i]);
        }
	}
	
	//	Phương thức translate(DictList en), 
	//phương thức này trả lại 1 danh sách các từ tiếng Việt tương ứng với các từ trong danh sách en.
	// muc tieu se la get(i) cua tung key bang cach so sanh voi dictionary da tao ra
    // sau khi da lay duoc chi so tung ung, ta return values;(add values vao mang tra ve)
	public DictList<String> translate(DictList<String> en) {
        // List of Vietnamese 
        DictList<String> result = new DictList<String>();
        for (int i = 0; i < en.size(); i++) {
           for (int j = 0; j < enList.size(); j++) {
            if(en.get(i).equals(enList.get(j))) {
                result.add(viList.get(j));
                break;
            }
           }
        }
		return result;
	}

}

