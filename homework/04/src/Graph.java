import java.util.LinkedList;
import java.util.Queue;
import java.util.TreeMap;

public class Graph {

    private static int[][] depthSearchMatrix;

    public static void nodesDegree(int[][] matrix) {

        TreeMap<String, Integer> nodeDegrees = new TreeMap<String, Integer>();

        for (int row = 0; row < matrix.length; row++) {
            int input = 0, output = 0;
            for (int column = 0; column < matrix[row].length; ++column) {
                if (matrix[row][column] < 0) {
                    input++;
                    nodeDegrees.put((row + 1) + " - in", input);
                } else if (matrix[row][column] > 0) {
                    output++;
                    nodeDegrees.put((row + 1) + " - out", output);
                }

                boolean containsInput = nodeDegrees.containsKey(row + " - in");
                boolean containsOutput = nodeDegrees.containsKey(row + " - out");

                if (!containsInput)
                    nodeDegrees.put((row + 1) + " - in", 0);
                else if (!containsOutput)
                    nodeDegrees.put((row + 1) + " - out", 0);
            }
        }

        for (String node : nodeDegrees.keySet()) {
            System.out.println(node + ": " + nodeDegrees.get(node));
        }
    }

    public static void depthSearchInitializer(int start, int[][] matrix) {
        boolean[] visited = new boolean[matrix.length];
        depthSearchMatrix = matrix;
        deaphSearch(start, visited);
        System.out.println("\n");
    }

    private static void deaphSearch(int start, boolean[] visited) {
        if (visited[start])
            return;

        visited[start] = true;

        System.out.print((start + 1)  + " ");

        for (int i = 0; i < depthSearchMatrix[start].length; i++)
            if (depthSearchMatrix[start][i] == 1)
                deaphSearch(i, visited);

        return;
    }

    public static void breadthSearch(int start, int[][] matrix) {
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[matrix.length];

        queue.offer(start);
        visited[start] = true;

        while(queue.size() != 0) {
            start = queue.poll();

            System.out.print((start + 1)  + " ");

            for (int i = 0; i < matrix[start].length; i++) {
                if(matrix[start][i] == 1 && !visited[i]) {
                    queue.offer(i);
                    visited[i] = true;
                }
            }
        }
        System.out.println("\n");
    }

}
