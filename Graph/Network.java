import java.util.*;

class Network {
    Map<String, List<String>> graph = new HashMap<>();

    void addEdge(String u, String v) {
        graph.putIfAbsent(u, new ArrayList<>());
        graph.putIfAbsent(v, new ArrayList<>());
        graph.get(u).add(v);
        graph.get(v).add(u);
    }

    // BFS for connectivity
    boolean isConnected(String start, int totalNodes) {
        Set<String> visited = new HashSet<>();
        Queue<String> q = new LinkedList<>();

        q.add(start);
        visited.add(start);

        while (!q.isEmpty()) {
            String curr = q.poll();
            for (String nei : graph.get(curr)) {
                if (!visited.contains(nei)) {
                    visited.add(nei);
                    q.add(nei);
                }
            }
        }
        return visited.size() == totalNodes;
    }

    // BFS shortest path (min hops)
    void minHops(String start, String end) {
        Queue<String> q = new LinkedList<>();
        Map<String, Integer> dist = new HashMap<>();

        q.add(start);
        dist.put(start, 0);

        while (!q.isEmpty()) {
            String curr = q.poll();

            for (String nei : graph.get(curr)) {
                if (!dist.containsKey(nei)) {
                    dist.put(nei, dist.get(curr) + 1);
                    q.add(nei);
                }
            }
        }

        System.out.println("Hops: " + dist.get(end));
    }

    public static void main(String[] args) {
        Network g = new Network();

        g.addEdge("R1", "R2");
        g.addEdge("R1", "R3");
        g.addEdge("R2", "R4");
        g.addEdge("R3", "R4");
        g.addEdge("R4", "R5");
        g.addEdge("R5", "R6");

        System.out.println(g.isConnected("R1", 6));
        g.minHops("R1", "R6");
    }
}