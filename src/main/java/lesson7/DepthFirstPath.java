package lesson7;

public class DepthFirstPath extends SearchFirstPath {

    public DepthFirstPath(Graph g, int source) {

        this.source = source;
        marked = new boolean[g.getVertexCount()];
        parent = new int[g.getVertexCount()];
        dfs(g, source);
    }

    private void dfs(Graph g, int source) {
        marked[source] = true;
        for (int i : g.getAdjList(source)) {
            if (marked[i] == false) {
                parent[i] = source;
                dfs(g, i);
            }
        }
    }
}
