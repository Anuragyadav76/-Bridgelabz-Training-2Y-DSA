import java.util.*;

class CourseGraph {
    Map<String, List<String>> graph = new HashMap<>();

    void addEdge(String u, String v) {
        graph.putIfAbsent(u, new ArrayList<>());
        graph.get(u).add(v);
    }

    // Cycle Detection (DFS)
    boolean hasCycleUtil(String node, Set<String> visited, Set<String> stack) {
        if (stack.contains(node)) return true;
        if (visited.contains(node)) return false;

        visited.add(node);
        stack.add(node);

        for (String nei : graph.getOrDefault(node, new ArrayList<>())) {
            if (hasCycleUtil(nei, visited, stack)) return true;
        }

        stack.remove(node);
        return false;
    }

    boolean hasCycle() {
        Set<String> visited = new HashSet<>();
        Set<String> stack = new HashSet<>();

        for (String node : graph.keySet()) {
            if (hasCycleUtil(node, visited, stack)) return true;
        }
        return false;
    }

    // Topological Sort (DFS)
    void topoSortUtil(String node, Set<String> visited, Stack<String> st) {
        visited.add(node);

        for (String nei : graph.getOrDefault(node, new ArrayList<>())) {
            if (!visited.contains(nei)) {
                topoSortUtil(nei, visited, st);
            }
        }
        st.push(node);
    }

    void topoSort() {
        Set<String> visited = new HashSet<>();
        Stack<String> st = new Stack<>();

        for (String node : graph.keySet()) {
            if (!visited.contains(node)) {
                topoSortUtil(node, visited, st);
            }
        }

        while (!st.isEmpty()) {
            System.out.print(st.pop() + " ");
        }
    }

    public static void main(String[] args) {
        CourseGraph g = new CourseGraph();

        g.addEdge("CS101", "CS102");
        g.addEdge("CS101", "CS201");
        g.addEdge("CS102", "CS202");
        g.addEdge("MATH101", "CS201");

        System.out.println("Cycle: " + g.hasCycle());
        g.topoSort();
    }
}