package Pekan9_2511533016;

import java.util.*;
public class GraphTraversal_2511533016 {
	private Map<String, List<String>> graph = new HashMap<>();
	
	// Menambahkan edge (graf tak berarah)
	public void addEdge_2511533016(String node1_3016, String node2_3016) {
		graph.putIfAbsent(node1_3016, new ArrayList<>());
		graph.putIfAbsent(node2_3016, new ArrayList<>());
		graph.get(node1_3016).add(node2_3016);
		graph.get(node2_3016).add(node1_3016);
	}
	// Manampilkan graf awal
	public void printGraph_2511533016() {
		System.out.println("Graf Awal (Adjacency List) : ");
		for(String node_3016 : graph.keySet()) {
			System.out.print(node_3016 + " -> ");
			List<String> neighbors_3016 = graph.get(node_3016);
			System.out.println(String.join(", ",  neighbors_3016));
		}
		System.out.println();
	}
	
	// DFS rekursif
	public void dfs_2511533016(String start_3016) {
		Set<String> visited_3016 = new HashSet<>();
		System.out.println("Penelusuran DFS : ");
		dfsHelper_2511533016(start_3016, visited_3016);
		System.out.println();
	}
	private void dfsHelper_2511533016(String current_3016, Set<String> visited_3016) {
		if(visited_3016.contains(current_3016)) return;
		visited_3016.add(current_3016);
		System.out.print(current_3016 + " ");
		for (String neighbor_3016 : graph.getOrDefault(current_3016, new ArrayList<>())) {
			dfsHelper_2511533016(neighbor_3016, visited_3016);
		}
	}
	// BFS iteratif
	public void bfs_2511533016(String start_3016) {
		Set<String> visited_3016 = new HashSet<>();
		Queue<String> queue_3016 = new LinkedList<>();
		queue_3016.add(start_3016);
		visited_3016.add(start_3016);
		System.out.println("Penelusuran BFS : ");
		while(!queue_3016.isEmpty()) {
			String current_3016 = queue_3016.poll();
			System.out.print(current_3016 + " ");
			for(String neightbor : graph.getOrDefault(current_3016, new ArrayList<>()))
				if(!visited_3016.contains(neightbor)) {
					queue_3016.add(neightbor);
					visited_3016.add(neightbor);
				}
		}
		System.out.println();
	}
	//Main
	public static void main(String[] args) {
		GraphTraversal_2511533016 graph_3016 = new GraphTraversal_2511533016();
		
		// Contoh graf : A-B, A-C, B-D, B-E
		graph_3016.addEdge_2511533016("A", "B");
		graph_3016.addEdge_2511533016("A", "C");
		graph_3016.addEdge_2511533016("B", "D");
		graph_3016.addEdge_2511533016("B", "E");
		// Cetak graf awal
		System.out.println("Graf Awal adalah : ");
		graph_3016.printGraph_2511533016();
		// Lakukan penelusuran 
		graph_3016.dfs_2511533016("A");
		graph_3016.bfs_2511533016("A");
	}
	
	
}
