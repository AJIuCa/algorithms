package lesson7;

import java.util.ArrayList;
import java.util.LinkedList;

public class SearchFirstPath {

    protected boolean[] marked;
    protected int source;
    protected int[] parent;


    public SearchFirstPath() {
    }


    public boolean hasPathTo(int v) {
        return marked[v];
    }

    public LinkedList<Integer> pathTo(int v) {
        if (hasPathTo(v) == false) {
            return null;
        }
        LinkedList<Integer> stack = new LinkedList<>();
        int vertex = v;
        while (vertex != source){
            stack.push(vertex);
            vertex = parent[vertex];
        }
        return stack;
    }


}
