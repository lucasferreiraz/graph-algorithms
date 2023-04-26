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

    public static boolean isWheel(int[][] graph) {
        int numVertices = graph.length;

        int countDegreeNMinus1 = 0;
        int indexDegreeNMinus1 = -1;

        for (int i = 0; i < numVertices; i++) {
            int degree = countDegree(graph, i);

            if (degree == numVertices - 1) {
                countDegreeNMinus1++;
                indexDegreeNMinus1 = i;
            }
        }

        if (countDegreeNMinus1 != 1)
            return false;

        for (int i = 0; i < numVertices; i++)
            if (i != indexDegreeNMinus1 && countDegree(graph, i) != 2)
                return false;

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
