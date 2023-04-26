public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Question 2:");
        int[][] graph = {
                { 0, 1, 1, 1 },
                { 1, 0, 1, 1 },
                { 1, 1, 0, 1 },
                { 1, 1, 1, 0 }
        };

        if (Graph.isRegular(graph))
            System.out.println("The graph is regular.");
        else
            System.out.println("The graph isn't regular.");

    }
}
