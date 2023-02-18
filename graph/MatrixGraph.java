package graph;

import java.util.ArrayList;
import java.util.List;

public class MatrixGraph implements Graph{
    private int V; // so luong dinh cua do thi
    private int E; // so luong canh cua do thi
    private int[][] adj; // mang hai chieu de bieu dien graph
    
    // constructor
    public MatrixGraph(int v) {
        this.V = v;
        this.E = 0; // canh mac dinh bang 0
        this.adj = new int[v][v]; // ma tran co v x v bieu dien ma tran
    }

    public void setV(int v) {
        V = v;
    }

    public void setE(int e) {
        E = e;
    }

    @Override
    public int numVertices() {
        return V;
    }

    @Override
    public int numEdge() {
        return E;
    }
    @Override
    public void addEdge(int v1, int v2) {
       this.adj[v1][v2] = 1;
       this.adj[v2][v1] = 1;
       E++;
    }

    //adjacency - tim cac dinh duoc ket noi voi V - tuong tu nhu ham next();
    @Override
    public Iterable<Integer> adjacency(int v) {
        // duyet cac phan tu canh v
        // neu bang 1 thi add vao list(
        List<Integer> nextV = new ArrayList<Integer>();
        for (int i = 0; i < V; i++) {
            if(adj[v][i] == 1) nextV.add(i);
        }
        return nextV;
    }

    // print adj matrix
    public void printAdj() {
        for (int i = 0; i < V; i++) {
            for (int j = 0; j < V; j++) {
                System.out.print(adj[i][j] + " ");
            }
            System.out.println();
        }
    }

    @Override
    public void dfs(int u) {
        /*Phan tu trong mang mac dinh bang 0, phan tu nao da duoc duyet de nhan gia tri 1*/
        int[] visited = new int[V];
        visited[u] = 1;
        ArrayList<Integer> adj = (ArrayList<Integer>) adjacency(u);
        for (Integer v : adj) {
            if(visited[v] == 0) {
                dfs(v);
            }
        }
    }

    void visit(int u) {
        System.out.println(u + " ");
    }
}
