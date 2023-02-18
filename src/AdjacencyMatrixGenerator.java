public class AdjacencyMatrixGenerator {

    public static int[][] completeGraph(int nodeNumbers) {
        
        if(nodeNumbers < 0){
            throw new IllegalArgumentException("Graph not defined for negative number of nodes");
        }

        int matrix[][] = new int[nodeNumbers][nodeNumbers];

        for (int rows = 0; rows < nodeNumbers; rows++) {
            for (int colums = 0; colums < nodeNumbers; colums++) {
                if (rows == colums)
                    matrix[rows][colums] = 0;
                else
                    matrix[rows][colums] = 1;
            }
        }
        return matrix;
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

}
