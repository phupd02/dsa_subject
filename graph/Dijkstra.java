package graph;

import java.util.ArrayList;
import java.util.List;

public class Dijkstra {
    private int[][] adj;

    // dijkstra
    public int[] dijkstra(int[][] adj, int x, int y) {
       /*
        * Input: ma trận kề, đỉnh bắt đầu x, đỉnh kết thúc y
        * Ouput: ma trận đường đi
        */
        int n = adj.length;
        int[] dist = new int[n]; // mảng lưu trữ nhãn của các đỉnh - khoảng cách từ nguồn tới đỉnh đó
        boolean[] visited = new boolean[n]; // các đỉnh đã thăm sẽ được đánh dấu là false
        int[] prev = new int[n] ; // mảng truy vết các đỉnh

        // Khởi tạo các giá trị ban đầu
        for (int i = 0; i < n; i++) {
            dist[i] = Integer.MAX_VALUE;
            prev[i] = -1;
            visited[i] = false;
        }

        // bắt đầu thuật toán
        for (int i = 0; i < n; i++) {
            // tìm ra đỉnh có nhãn nhỏ nhất ở mỗi lượt xét( mỗi dòng nếu làm ra giấy)
            int u = minDistance(dist,visited);
            visited[u] = true;
            for (int v = 0; v < n; v++) {
                if(visited[v] == false && adj[u][v] > 0 && dist[v] > dist[u] + adj[u][v] && 
                dist[u] != Integer.MAX_VALUE) {
                    dist[v] = dist[u] + adj[u][v];
                    prev[v] = u;
                }
            }  
        }

        List<Integer> paths = new ArrayList<>();
		int temp = y;

        // truy xuất các đỉnh
		while (true) {
			if (prev[temp] == -1)
				break;
			paths.add(prev[temp]);
			temp = prev[temp];
		}

		int[] result = new int[paths.size()]; // mảng kết quả
		result[0] = x;
		result[result.length - 1] = y;
		int k = 0;
		for (int i = result.length - 1; i >= 0; i--) {
			result[i] = paths.get(k++) + 1;
		}
		return result;
    }

    private int minDistance(int[] dist, boolean[] visited) {
        int min = Integer.MAX_VALUE;
        int idxMin = -1;

        for (int i = 0; i < adj.length; i++) {
            if(dist[i] < min && !visited[i]) {
                min = dist[i];
                idxMin = i;
            }
        }
        return idxMin;
    }
    public static void main(String[] args) {
        int adj[][] = {{0,4,0,0},{2,0,0,0},{0,2,4,0},{2,5,0,0}};
    }
}
