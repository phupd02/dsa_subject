package compression;

/**
 * @author Phuong LE-HONG
 * <p>
 * Jan 25, 2015, 2:58:23 PM
 * <p>
 * The RLE algorithm to compress data.
 *
 */
public class RLE {
	
	/**
	 * Computes the length of the compression array.
	 * @param t a binary array
	 * @return an integer.
	 */
	public static int length(int[] t) {
		if(t == null) {
		    System.out.println("NULL ARRAY!!!");
            return -1;
        }
        if(t.length == 0) {
            return 0;
        }
        int len = 1;
        for(int i = 0; i < t.length - 1;i++) {
            if(t[i] != t[i + 1]) {
                len++;
            }
        }
        return 2 * len;
	}

	/**
	 * Compresses an array in RLE format and return the result.
	 * @param t
	 * @return compressed array.
	 */
	public static int[] compress(int[] t) {
		int n = length(t);
		if(n == 0) {
		    return new int[0];
		}
		
		int temp = t[0];
		int count = 1;
		int[] compress = new int[n];
		int idx = 0;
		
		for(int i = 1;i < t.length;i++) {
		    if(t[i] == temp) {
		        count++;
		    } else {
		        compress[idx] = temp;
		        compress[idx + 1] = count;
		        temp = t[i];
		        idx += 2;
		        count = 1;
		    }
		}
		
		
		compress[idx] = temp;
		compress[idx + 1] = count;
		return compress;
	}

	/**
	 * Computes the length of the decompressed array.
	 * @param t
	 * @return an integer.
	 */
	public static int lengthInverse(int[] t) {
	   int length = 0;

        //(0,5,1,1,0,5) ----> (5,1,5) ----> 5 + 1 + 5 = 11 = lengthInverse;
        for(int i = 0; i < t.length;i++) {
            if(i % 2 != 0) {
				length = length + t[i];
			}
        }
        return length;
	}
	
	/**
	 * Decompresses the array.
	 * @param t
	 * @return an array
	 */
	public static int[] decompress(int[] t) {
	    int decompress[] = new int[lengthInverse(t)];
		
		if(decompress.length == 0) {
			return decompress;
		}
		int pos = 0;
		int key = t[1];

		for (int i = 0; i < decompress.length; i++) {
			if(key > 0) {
				decompress[i] = t[pos];
				key--;
			} else {
				pos+= 2;
				decompress[i] = t[pos];
				key =  t[pos + 1];
				key--;
			}
			
		}
		return decompress;
	}
}
