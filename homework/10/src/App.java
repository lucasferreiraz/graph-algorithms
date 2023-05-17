public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Question 1:");
        int[][] graph = {
                { 0, 1, 1, 1, 1 },
                { 1, 0, 1, 0, 0 },
                { 1, 1, 0, 1, 0 },
                { 1, 0, 1, 0, 1 },
                { 1, 0, 0, 1, 0 }
        };

        if (Graph.isRegular(graph))
            System.out.println("The graph is regular.");
        else
            System.out.println("The graph isn't regular.");

        if (Graph.isPlanar(graph, graph.length))
            System.out.println("The graph is planar.");
        else
            System.out.println("The graph isn't planar.");

        System.out.println("Question 2:");
        int[][] incidenceMatrix = {
            {1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {1, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 1, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0},
            {0, 0, 1, 0, 0, 1, 1, 0, 0, 0, 0, 0},
            {0, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 1},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0}
        };

        Graph.printMatrix(incidenceMatrix);

        System.out.println("Question 3:");
        int[][] incidenceMatrix2 = {
            {1, 1, 0, 0, 0},
            {1, 0, 1, 1, 0},
            {0, 1, 1, 0, 1},
            {0, 0, 0, 1, 1}
        };

        int ReducibleNodes = Graph.countReducibleNodes(incidenceMatrix2);
        System.out.println("Number of reducible nodes in series: " + ReducibleNodes);

        System.out.println("Question 4:");
        int[][] adjacencyMatrix = {
            {0, 1, 1, 1, 0},
            {1, 0, 1, 0, 1},
            {1, 1, 0, 1, 1},
            {1, 0, 1, 0, 0},
            {0, 1, 1, 0, 0}
        };


        int edges = Graph.countEdges(adjacencyMatrix);
        System.out.println("Number of edges: " + edges);
    }
}
