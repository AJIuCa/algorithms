package lesson7;

public class Main {
    public static void main(String[] args) {

        Graph graph = new Graph(10);

        graph.addEdge(4,1);
        graph.addEdge(4,2);
        graph.addEdge(2,6);
        graph.addEdge(3,5);
        graph.addEdge(5,8);
        graph.addEdge(5,7);
        graph.addEdge(4,3);
        graph.addEdge(4,9);
        graph.addEdge(3,9);
        

        System.out.println("Depth search");
        DepthFirstPath dfp = new DepthFirstPath(graph, 1);
        System.out.println(dfp.hasPathTo(4));
        System.out.println(dfp.hasPathTo(2));
        System.out.println(dfp.pathTo(5));

        System.out.println("\nWidth search");

        System.out.println(graph.getAdjList(9));
        WidthFirstPath widthFirstPath = new WidthFirstPath(graph, 4);
        System.out.println(widthFirstPath.hasPathTo(8));
        System.out.println(widthFirstPath.pathTo(6));


    }
}
