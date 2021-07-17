package lesson7;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Graph {
    private int vertexCount;
    private int edgeCount;
    private LinkedList<Integer>[] adjList;

    public Graph(int vertexCount) {
        if (vertexCount <= 0) {
            throw new IllegalArgumentException("vertexCount:" + vertexCount);
        }
        this.vertexCount = vertexCount;
        adjList = new LinkedList[vertexCount];
        for (int i = 0; i < adjList.length; i++) {
            adjList[i] = new LinkedList<>();
        }
    }

    public int getVertexCount() {
        return vertexCount;
    }

    public int getEdgeCount() {
        return edgeCount;
    }

    public List<Integer> getAdjList(int vertex) {
        return Collections.unmodifiableList(adjList[vertex]);
    }

    public void addEdge(int vertex1, int vertex2) {
        if (vertex1 < 0 || vertex2 < 0 || vertex1 >= vertexCount || vertex2 >= vertexCount) {
            throw new IllegalArgumentException();
        }
        adjList[vertex1].add(vertex2);
        if (vertex1 == vertex2) {
            return;
        }
        adjList[vertex2].add(vertex1);
    }

}
