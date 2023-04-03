import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;

public class Graph {

    private int nodes;
    private ArrayList<ArrayList<Integer>> matrix;

    public Graph(int size) {
        this.nodes = size;
        matrix = new ArrayList<>(size);

        for (int i = 0; i < size; i++)
            matrix.add(new ArrayList<Integer>());
    }

    public void addEdge(int source, int destiny) {
        matrix.get(source).add(destiny);
    }

    public void topologicalSort() {
        Stack<Integer> stack = new Stack<>();

        ArrayList<Boolean> visited = new ArrayList<>(nodes);

        for (int i = 0; i < nodes; i++)
            visited.add(false);

        for (int i = 0; i < nodes; i++)
            if (visited.get(i) == false)
                topologicalSortUtil(i, visited, stack);

        while (stack.empty() == false)
            System.out.print(stack.pop() + " ");
        System.out.println();
    }

    public void topologicalSortUtil(int node, ArrayList<Boolean> visited, Stack<Integer> stack) {
        visited.set(node, true);
        Integer i;

        Iterator<Integer> it = matrix.get(node).iterator();
        while (it.hasNext()) {
            i = it.next();
            if (!visited.get(i))
                topologicalSortUtil(i, visited, stack);
        }

        stack.push(node);
    }

    public boolean isCyclic() {
        ArrayList<Boolean> visited = new ArrayList<>(nodes);
        ArrayList<Boolean> recursionStack = new ArrayList<>(nodes);

        for (int i = 0; i < nodes; i++) {
            visited.add(false);
            recursionStack.add(false);
        }

        for (int i = 0; i < nodes; i++)
            if (isCyclicUtil(i, visited, recursionStack))
                return true;

        return false;
    }

    private boolean isCyclicUtil(int i, ArrayList<Boolean> visited, ArrayList<Boolean> recStack) {
        if (recStack.get(i))
            return true;
        if (visited.get(i))
            return false;

        recStack.set(i, true);
        visited.set(i, true);

        ArrayList<Integer> children = matrix.get(i);

        for (Integer elem : children)
            if (isCyclicUtil(elem, visited, recStack))
                return true;

        recStack.set(i, false);

        return false;
    }

    public void print() {
        for (int i = 0; i < matrix.size(); i++) {
            System.out.println("\nAdjacency list of vertex"
                    + i);
            System.out.print("head");
            for (int j = 0; j < matrix.get(i).size(); j++) {
                System.out.print(" -> " + matrix.get(i).get(j));
            }
            System.out.println();
        }
    }

}
