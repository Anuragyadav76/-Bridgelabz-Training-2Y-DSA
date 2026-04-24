import java.util.*;

class SocialNetwork {
    Map<String, List<String>> graph = new HashMap<>();

    // Add friendship
    void addEdge(String u, String v) {
        graph.putIfAbsent(u, new ArrayList<>());
        graph.putIfAbsent(v, new ArrayList<>());
        graph.get(u).add(v);
        graph.get(v).add(u);
    }

    // Find friends
    void getFriends(String user) {
        System.out.println(graph.get(user));
    }

    // Check direct connection
    boolean isConnected(String u, String v) {
        return graph.get(u).contains(v);
    }

    // BFS shortest path
    void shortestPath(String start, String end) {
        Queue<String> q = new LinkedList<>();
        Map<String, String> parent = new HashMap<>();
        Set<String> visited = new HashSet<>();

        q.add(start);
        visited.add(start);

        while (!q.isEmpty()) {
            String curr = q.poll();

            if (curr.equals(end)) break;

            for (String nei : graph.get(curr)) {
                if (!visited.contains(nei)) {
                    visited.add(nei);
                    parent.put(nei, curr);
                    q.add(nei);
                }
            }
        }

        // Print path
        List<String> path = new ArrayList<>();
        String curr = end;
        while (curr != null) {
            path.add(curr);
            curr = parent.get(curr);
        }
        Collections.reverse(path);
        System.out.println("Path: " + path);
    }

    public static void main(String[] args) {
        SocialNetwork g = new SocialNetwork();

        g.addEdge("Alice", "Bob");
        g.addEdge("Alice", "Charlie");
        g.addEdge("Bob", "David");
        g.addEdge("Charlie", "Eve");
        g.addEdge("David", "Eve");

        g.getFriends("Alice");
        System.out.println(g.isConnected("Bob", "Eve"));
        g.shortestPath("Alice", "Eve");
    }
}