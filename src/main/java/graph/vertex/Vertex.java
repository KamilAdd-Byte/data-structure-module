package graph.vertex;

import graph.edge.Edge;
import io.vavr.control.Try;

import java.text.MessageFormat;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Representation vertex of the Graph
 * "wierzchołek"
 */
public class Vertex {

    private static final Logger logger = Logger.getLogger(Vertex.class.getName());
    private int number;//numer porzadkowy wierzcholka
    private final LinkedList<Edge> edges = new LinkedList<>();//lista krawędzi wychodzacych z wierzcholka

    private Vertex() { }

    /**
     * @param number ordinal number of the vertex being created
     */
    public Vertex(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public LinkedList<Edge> getEdgeList() {
        return new LinkedList<>(edges);
    }

    /**
     * Removes edges running to the i-th vertex (if any)
     * pl:"Usuwa krawedzie biegnace do i-tego wierzcholka (jezeli istnieje)"
     * @param numberOfVertex number of the vertex to which the removed edge runs
     * pl:"numer wierzcholka do ktorego biegnie usuwana krawedz"
     */
    public void removeEdge(int numberOfVertex) {
        int indexes = edges.size() - 1;
        while (indexes >= 0) {
            if (edges.get(numberOfVertex).getEnd().getNumber() == numberOfVertex) {
                logger.log(Level.INFO, MessageFormat.format("index decreases: {0} ", numberOfVertex));
                indexes--;
            }
        }
    }

    public void removeEdge(Vertex vertex) {
        removeEdge(vertex.number);
        logger.warning("Vertex has been removed: " + vertex.getNumber());
    }

    public void addEdge(Edge edge) {
        edges.add(edge);
    }

    public Edge getEdgeAt(int number) {
        return Try.of(() -> getOneEdge(number))
                .getOrElse(Edge.defaultEdge());
    }

    private Edge getOneEdge(int number) {
        if (number >= 0 && number < edges.size()) {
            return edges.get(number);
        }
        return null;
    }
    /**
     * Zwraca krawedz biegnaca do wierzcholka o numerze porzadkowym n (jezeli istnieje)
     * @param n numer wierzcholka do ktorego biegnie szukana krawedz
     */
    public Edge getEdge(int n) {
        for(Edge edge : edges)
            if(edge.getEnd().getNumber() == n)
                return edge;
        return Edge.defaultEdge();
    }

    @Override
    public String toString() {
        return "Vertex{" +
                "number=" + number +
                ", edges=" + edges +
                '}';
    }
}
