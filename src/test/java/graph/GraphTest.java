package graph;

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
        // TODO: 14/05/2023  
        assertEquals(3, graph.getNumberOfVertex());
    }

    @Test
    void testRemoveVertex() {
        // TODO: 14/05/2023  
    }

    @Test
    void addEdge() {
        // TODO: 14/05/2023  
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