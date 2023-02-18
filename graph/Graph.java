package graph;

interface Graph {
    int numVertices(); // tra ve so dinh cua do thi
    int numEdge();// tra ve so canh cua do thi
    void addEdge(int u, int v); // them mot canh vao do thi khi truyen vao 2 dinh
    Iterable<Integer> adjacency(int v); // tra ve cac dinh lien ke voi dinh truyen vao
    void dfs(int u);
}
