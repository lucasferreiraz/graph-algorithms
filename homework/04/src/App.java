public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Question 1: \n");
        int[][] matrix1 = {
                { 0, 1, 0, 0, 1, 0 },
                { -1, 0, 1, 0, 0, 0 },
                { 0, -1, 0, 1, -1, 0 },
                { 0, 0, -1, 0, 0, -1 },
                { -1, 0, 1, 0, 0, 1 },
                { 0, 0, 0, 1, -1, 0 }
        };
        Graph.nodesDegree(matrix1);

        // ------------------------------------------------

        System.out.println("\nQuestion 2: \n");
        int[][] matrix2 = {
                {0, 1, 1, 1, 1, 0, 0, 0, 0},
                {1, 0, 0, 0, 0, 1, 1, 0, 0},
                {1, 0, 0, 0, 0, 0, 0, 0, 0},
                {1, 0, 0, 0, 0, 0, 0, 1, 0},
                {1, 0, 0, 0, 0, 0, 0, 0, 1},
                {0, 1, 0, 0, 0, 0, 0, 0, 0},
                {0, 1, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 1, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 1, 0, 0, 0, 0},
        };
        System.out.println("in-depth search result: ");
        Graph.depthSearchInitializer(0, matrix2);

        System.out.println("breath search result: ");
        Graph.breadthSearch(0, matrix2);

    }
}
