package lesson7;

import java.util.LinkedList;

public class WidthFirstPath extends SearchFirstPath {


    public WidthFirstPath(Graph g, int source) {

        this.source = source;
        marked = new boolean[g.getVertexCount()];
        parent = new int[g.getVertexCount()];
        bfs(g, source);
    }

    private void bfs(Graph g, int source) {
        LinkedList<Integer> queue = new LinkedList<>();
        queue.add(source);
        marked[source] = true;

        while (queue.isEmpty() == false){
            int vertex = queue.removeFirst();
            for (int i : g.getAdjList(vertex)) {
                if(marked[i] == false){
                    marked[i] = true;
                    parent[i] = vertex;
                    queue.addLast(i);
                }
            }
        }
    }

}
