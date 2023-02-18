package Week_1_to_3.week_3.compression;

public class RLE {
    public static int length(int[] t) {
        // Xu ly ngoai le
        if(t == null) {
            System.out.println("NULL ARRAY: ");
            return - 1;
        }
        if(t.length == 0) {
            return 0;
        }
        int len = 0;
        for(int i = 0; i < t.length;i++) {
            if(t[i] != t[i + 1]) {
                len++;
            }
        }
        return 2 * len;

    }
}




///hh
// public class RLE {
	
// 	/**
// 	 * Computes the length of the compression array.
// 	 * @param t a binary array
// 	 * @return an integer.
// 	 */
// 	public static int length(int[] t) {
// 		if(t == null) {
//             System.out.print("NULL ARRAY: ");
//             return -1;
//         }
//         if(t.length == 0) {
//             return 0;
//         }
//         int len = 1;
//         for(int i = 0; i < t.length;i++) {
//             if(t[i] != t[i + 1]) {
//                 len++;
//             }
//         }
//         return 2 * len;
// 	}

// 	/**
// 	 * Compresses an array in RLE format and return the result.
// 	 * @param t
// 	 * @return compressed array.
// 	 */
// 	public static int[] compress(int[] t) {
// 		int n = t.length;
// 		if(n == 0) {
// 		    return new int[0];
// 		}
		
// 		int temp = t[0];
// 		int count = 1;
// 		int[] compress = new int[n];
// 		int idx = 0;
		
// 		for(int i = 0;i < t.length;i++) {
// 		    if(t[i] == temp) {
// 		        count++;
// 		    } else {
// 		        compress[idx] = temp;
// 		        compress[idex + 1] = count;
// 		        temp = t[i];
// 		        count = 1;
// 		        idx += 2;
// 		    }
// 		}
		
		
// 		compress[idx] = temp;
// 		compress[idex + 1] = count;
// 		return compress;
// 	}

// 	/**
// 	 * Computes the length of the decompressed array.
// 	 * @param t
// 	 * @return an integer.
// 	 */
// 	public static int lengthInverse(int[] t) {
// 		// TODO: Your code here
// 		return 0;
// 	}
	
// 	/**
// 	 * Decompresses the array.
// 	 * @param t
// 	 * @return an array
// 	 */
// 	public static int[] decompress(int[] t) {
// 		return null;
// 	}
// }

