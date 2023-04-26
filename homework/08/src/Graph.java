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

    private static int countDegree(int[][] graph, int vertice) {
        int degree = 0;

        for (int i = 0; i < graph.length; i++)
            if (graph[vertice][i] == 1)
                degree++;

        return degree;
    }
}
