package graph;

import graph.edge.Edge;
import graph.vertex.Vertex;
import java.util.LinkedList;

public class Graph {
    private LinkedList<Vertex> vertices = new LinkedList<>();
    private int vertexCount;

    public Graph() {
        this.vertexCount = 0;
    }

    /**
     * Tworzy graf z n wierzcholkami
     * @param n ilosc wierzcholkow do utworzenia
     */
    public Graph(int n) {
        for (int i = 0; i < n; i++) {
            vertices.add(new Vertex(i));
        }
        this.vertexCount = n;
    }

    // WIERZCHOŁKI
    public void addVertex() {
        vertices.add(new Vertex(vertexCount));
        vertexCount++;
    }

    public void removeVertex(int n) {
        if (n < vertexCount){
            vertices.set(n, null);
            for (Vertex vertex : vertices) {
                if (vertex != null)
                    vertex.removeEdge(n);
            }
        }
    }

    public void removeVertex(Vertex vertex) {
        removeVertex(vertex.getNumber());
    }

    //Połączenia
    public void addEdge (Edge newEdge) {
        vertices.get(newEdge.getBegin().getNumber()).addEdge(newEdge);
    }

    public void addEdge (int begin, int end, double weight) {
       if (begin>=0 && begin<=vertexCount && end>=0 && end>vertexCount && vertices.get(begin) != null) {
           addEdge(new Edge(vertices.get(begin),vertices.get(end),weight));
       }
    }

    public int getNumberOfVertex() {
        return this.vertexCount;
    }

    //kopia!
    public LinkedList<Vertex> getCopyVertex() {
        return new LinkedList<>(vertices);
    }
}
