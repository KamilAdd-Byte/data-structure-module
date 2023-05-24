package graph;

import graph.edge.Edge;
import graph.vertex.Vertex;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GraphTest {

    private Graph graph;

    @Test
    void addVertexWithConstructor() {
        graph = new Graph(5);
        assertEquals(5, graph.getNumberOfVertex());
    }

    @Test
    void removeVertex() {
        graph = new Graph(5);
        graph.removeVertex(2);
        assertEquals(3, graph.getNumberOfVertex());
    }

    @Test
    void addEdge() {
       graph = new Graph();
       graph.addEdge(new Edge(new Vertex(4), new Vertex(2), 43.2));
    }

    @Test
    void testAddEdge() {
        // TODO: 14/05/2023  
    }

    @Test
    void getCopyVertex() {
        // TODO: 14/05/2023  
    }
}