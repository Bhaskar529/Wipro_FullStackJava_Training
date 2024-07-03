package datastructures.searchingAlgorithms;

import java.util.LinkedList;
import java.util.Queue;

class Graph1{
	int vertices;
	LinkedList<Integer>[] adjList;
    
	Graph1(int vertices){
		this.vertices=vertices;
		adjList=new LinkedList[vertices];
		for(int i=0;i<vertices;++i)
			adjList[i]=new LinkedList<>();
	}
	void addEdge(int u,int v) {
		adjList[u].add(v);
	}
	
	void bfs(int startNode) {
		Queue<Integer> queue=new LinkedList<>();
		boolean[] visited =new boolean[vertices];
		
		visited[startNode]=true;
		queue.add(startNode);
		while(! queue.isEmpty()) {
			int currentNode=queue.poll();
			System.out.println(currentNode+" ");
			for(int neighbour:adjList[currentNode]) {
				if(!visited[neighbour]) {
					visited[neighbour]=true;
					queue.add(neighbour);
				}
			}
		}
	}
}

public class BFSDemo {
		
	public static void main(String[] args) {
		int vertices=5;
		Graph1 graph=new Graph1(vertices);
		graph.addEdge(0,1);
		graph.addEdge(0, 2);
		graph.addEdge(1, 3);
		graph.addEdge(1, 4);
		graph.addEdge(2, 4);

		System.out.println("Breadth first Traversal starting");
		graph.bfs(0);
		
	}

}
