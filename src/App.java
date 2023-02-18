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
        AdjacencyMatrixGenerator.printMatrix(matrix1);

        System.out.println("\nSecond exercise:");
        int[][] matrix2 = AdjacencyMatrixGenerator.completeGraph(5);
        System.out.println("Complete graph with 5 nodes:\n");
        AdjacencyMatrixGenerator.printMatrix(matrix2);
    }
}
