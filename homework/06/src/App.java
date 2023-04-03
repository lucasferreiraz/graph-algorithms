public class App {
    public static void main(String[] args) throws Exception {
        
        System.out.println("\nQuestion 1:");

        Graph g1 = new Graph(5);
        g1.addEdge(0, 3);
        g1.addEdge(0, 4);
        g1.addEdge(1, 0);
        g1.addEdge(1, 3);
        g1.addEdge(3, 0);
        g1.addEdge(3, 2);
        g1.addEdge(3, 4);
        g1.addEdge(4, 3);
        g1.print();

        System.out.println("\nQuestion 2:");

        Graph g2 = new Graph(4);
        g2.addEdge(0, 1);
        g2.addEdge(0, 2);
        g2.addEdge(1, 2);
        g2.addEdge(2, 0);
        g2.addEdge(2, 3);
        g2.addEdge(3, 3);

        System.out.print("Topological ordering of the graph: ");
        g2.topologicalSort();

        System.out.println(g2.isCyclic());

        System.out.println("\nQuestion 3:");

        Graph g3 = new Graph(4);
        g3.addEdge(0, 1);
        g3.addEdge(0, 2);
        g3.addEdge(1, 2);
        g3.addEdge(2, 0);
        g3.addEdge(2, 3);
        g3.addEdge(3, 3);

        System.out.println("Does this graph contain a cycle? -> " + g3.isCyclic());

    }
}
