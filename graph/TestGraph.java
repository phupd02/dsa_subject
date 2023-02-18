package graph;

public class TestGraph {
    public static void main(String[] args) {
        MatrixGraph matrixGraph = new MatrixGraph(6);
        matrixGraph.addEdge(0, 1);
        matrixGraph.addEdge(0, 5);
        matrixGraph.addEdge(1, 2);
        matrixGraph.addEdge(1, 5);
        matrixGraph.addEdge(2, 3);
        matrixGraph.addEdge(2, 4);
        matrixGraph.addEdge(3, 4);
        matrixGraph.addEdge(4, 5);

        // print adjacency matrix
        System.out.println("PRINT ADJ MATRIX: ");
       matrixGraph.printAdj();

       // numEdge
       System.out.println("EDGE OF GRAPH: " + matrixGraph.numEdge());
       //numVetices
       System.out.println("VERTICES OF GRAPH: " +  matrixGraph.numVertices());

       //test dfs
       System.out.println("DFS ");
       matrixGraph.dfs(4);
    }
}
