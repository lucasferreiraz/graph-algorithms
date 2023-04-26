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

        System.out.println("Question 3:");
        int[][] graph2 = {
                { 0, 1, 0, 1, 0 },
                { 1, 0, 1, 0, 1 },
                { 0, 1, 0, 1, 0 },
                { 1, 0, 1, 0, 1 },
                { 0, 1, 0, 1, 0 }
        };

        if (Graph.isWheel(graph2))
            System.out.println("This is a wheel graph.");
        else
            System.out.println("This isn't a wheel graph.");

    }
}
