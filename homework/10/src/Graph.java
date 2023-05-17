public class Graph {
    public static boolean isRegular(int[][] graph) {
        int degree = countDegree(graph, 0);

        for (int i = 1; i < graph.length; i++) {
            int actualDegree = countDegree(graph, i);

            if (actualDegree != degree)
                return false;
        }

        return true;
    }

    public static boolean isPlanar(int[][] graph, int numVertices) {
        if (numVertices <= 2)
            return true;

        if (numVertices > 2 && numVertices <= 4)
            return false;

        int edges = 0;
        int faces = 0;

        for (int i = 0; i < numVertices; i++)
            for (int j = i + 1; j < numVertices; j++)
                if (graph[i][j] == 1)
                    edges++;

        faces = 2 - numVertices + edges;

        if (faces <= 2)
            return true;

        return false;
    }

    public static int countReducibleNodes(int[][] incidenceMatrix) {
        int ReducibleNodes = 0;
        int edges = incidenceMatrix[0].length;

        for (int i = 0; i < incidenceMatrix.length; i++) {
            int degree = 0;
            for (int j = 0; j < edges; j++)
                if (incidenceMatrix[i][j] == 1)
                    degree++;

            if (degree == 2)
                ReducibleNodes++;
        }

        return ReducibleNodes;
    }

    public static int countEdges(int[][] adjacencyMatrix) {
        int numVertices = adjacencyMatrix.length;
        int edges = 0;

        for (int i = 0; i < numVertices; i++)
            for (int j = i + 1; j < numVertices; j++)
                if (adjacencyMatrix[i][j] == 1)
                    edges++;

        return edges;
    }

    private static int countDegree(int[][] graph, int vertice) {
        int degree = 0;

        for (int i = 0; i < graph.length; i++)
            if (graph[vertice][i] == 1)
                degree++;

        return degree;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] line : matrix) {
            for (int element : line) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
