import java.util.*;

class Pair {
    String node;
    int weight;

    Pair(String n, int w) {
        node = n;
        weight = w;
    }
}

class CityGraph {
    Map<String, List<Pair>> graph = new HashMap<>();

    void addEdge(String u, String v, int w, boolean twoWay) {
        graph.putIfAbsent(u, new ArrayList<>());
        graph.get(u).add(new Pair(v, w));

        if (twoWay) {
            graph.putIfAbsent(v, new ArrayList<>());
            graph.get(v).add(new Pair(u, w));
        }
    }

    // BFS (ignoring weights)
    void bfs(String start) {
        Queue<String> q = new LinkedList<>();
        Set<String> visited = new HashSet<>();

        q.add(start);
        visited.add(start);

        while (!q.isEmpty()) {
            String curr = q.poll();
            System.out.print(curr + " ");

            for (Pair nei : graph.getOrDefault(curr, new ArrayList<>())) {
                if (!visited.contains(nei.node)) {
                    visited.add(nei.node);
                    q.add(nei.node);
                }
            }
        }
    }

    public static void main(String[] args) {
        CityGraph g = new CityGraph();

        g.addEdge("A", "B", 5, false);
        g.addEdge("B", "C", 3, true);
        g.addEdge("A", "D", 7, true);
        g.addEdge("D", "E", 2, false);
        g.addEdge("C", "E", 4, false);

        g.bfs("A");
    }
}