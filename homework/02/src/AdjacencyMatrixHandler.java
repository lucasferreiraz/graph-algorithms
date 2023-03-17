import java.util.TreeMap;

public class AdjacencyMatrixHandler {

    public static int[][] completeGraph(int nodeNumbers) {
        if (nodeNumbers < 0) {
            throw new IllegalArgumentException("Graph not defined for negative number of nodes.");
        }

        int matrix[][] = new int[nodeNumbers][nodeNumbers];

        for (int row = 0; row < nodeNumbers; row++) {
            for (int column = 0; column < nodeNumbers; column++) {
                if (row == column)
                    matrix[row][column] = 0;
                else
                    matrix[row][column] = 1;
            }
        }
        return matrix;
    }

    public static void nodesDegree(int[][] matrix) {

        TreeMap<String, Integer> nodeDegrees = new TreeMap<String, Integer>();

        for (int row = 0; row < matrix.length; row++) {
            int input = 0, output = 0;
            for (int column = 0; column < matrix[row].length; ++column) {
                if (matrix[row][column] < 0) {
                    input++;
                    nodeDegrees.put(row + " - in", input);
                } else if (matrix[row][column] > 0) {
                    output++;
                    nodeDegrees.put(row + " - out", output);
                }

                boolean containsInput = nodeDegrees.containsKey(row + " - in");
                boolean containsOutput = nodeDegrees.containsKey(row + " - out");

                if (!containsInput)
                    nodeDegrees.put(row + " - in", 0);
                else if (!containsOutput)
                    nodeDegrees.put(row + " - out", 0);
            }
        }

        for (String node : nodeDegrees.keySet()) {
            System.out.println(node + ": " + nodeDegrees.get(node));
        }
    }

    // auxiliar functions
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
