package list.set;

import graph.Graph;
import graph.edge.Edge;
import graph.vertex.Vertex;

import java.util.HashSet;
import java.util.Optional;

public class SetFactory {
    public static HashSet<Graph> graphHashSet = new HashSet<>();

    public static void main(String[] args) {
        Graph graph = new Graph();
        graph.addEdge(new Edge(new Vertex(1), new Vertex(7), 4.44));

        graphHashSet.add(graph);
        graphHashSet.add(new Graph(3));
        graphHashSet.add(new Graph(5));


        System.out.println(graph.toString());
    }
}
