package graph.edge;

import graph.vertex.Vertex;
import java.util.UUID;

/**
 * Representation edge of the Graph
 * pl:"krawędź"
 */
public class Edge {

    private UUID uuid;
    private Vertex begin;
    private Vertex end;
    private double weight;

    public Edge() {
    }

    public Edge(Vertex begin, Vertex end, double weight) {
        this.uuid = UUID.randomUUID();
        this.begin = begin;
        this.end = end;
        this.weight = weight;
    }

    public static Edge defaultEdge () {
        return new Edge();
    }
    public Vertex getBegin() {
        return begin;
    }

    public Vertex getEnd() {
        return end;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Edge{" +
                "uuid=" + uuid +
                ", begin=" + begin +
                ", end=" + end +
                ", weight=" + weight +
                '}';
    }
}