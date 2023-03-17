public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("\nFirst exercise: \n");
        int[][] matrix1 = {
            {0, 1, 0, 0, 0, 0},
            {1, 0, 1, 1, 0, 0},
            {0, 1, 0, 0, 0, 0},
            {0, 1, 0, 0, 1, 1},
            {0, 0, 0, 1, 0, 1},
            {0, 0, 0, 1, 1, 0}
        };
        AdjacencyMatrixHandler.printMatrix(matrix1);

        System.out.println("\nSecond exercise:");
        int[][] matrix2 = AdjacencyMatrixHandler.completeGraph(5);
        System.out.println("Complete graph with 5 nodes:\n");
        AdjacencyMatrixHandler.printMatrix(matrix2);

        System.out.println("\nThird exercise: \n");
        int[][] matrix3 = {
            {0, 1, 0, 0, 1, 0},
            {-1, 0, 0, 0, 0, 1},
            {0, 0, 0, 1, -1, 0},
            {0, 0, -1, 0, 0, -1},
            {-1, 0, 1, 0, 0, 1},
            {0, -1, 0, 1, -1, 0}
        };

        AdjacencyMatrixHandler.nodesDegree(matrix3);

    }
}
