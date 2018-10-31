package codeplus;

import java.util.Scanner;

public class DFS_BFS_baekjoon1260 {

	static int[][] graph;
	static boolean[] visit;
	static int N;
	static int M;
	static int V;
	
	public static void dfs(int i) {
		visit[i] = true;
		System.out.print(i+" ");
		
		for(int j=1; j<=N; j++) {
//			System.out.println(graph[i][j]);
			if(graph[i][j]==1&& visit[j]==false)
				dfs(j);
		}
	}
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		N = scan.nextInt();
		graph = new int[1001][1001];
		M = scan.nextInt();
		visit = new boolean[10001];
		V = scan.nextInt();
		
		int a, b;
		
		for(int i=0; i<M; i++){
			a = scan.nextInt();
			b = scan.nextInt();
			
			graph[a][b] = graph[b][a] =1;
		}
		
		dfs(V);

	}

}
