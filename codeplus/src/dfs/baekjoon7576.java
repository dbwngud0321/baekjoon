package dfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class baekjoon7576 {
	/**
	 * 백준 7576 토마토 문제
	 * 동시 다발적으로 일어나면 큐를 사용한 BFS 사용
	 * @param args
	 */
	static int M;
	static int N;
	static int arr[][];
	// 익은 토마토의 상하좌우를 계산하기 위한 x,y좌표.
	static int[] dx = {-1,1,0,0};
	static int[] dy = {0,0,-1,1};
	public static void main(String[] args) {
		/**
		 * 1. 토마토가 익은 지점을 큐에 넣는다.
		 * 2. 익은 토마토 상하좌우를 탐색, 익지 않은 토마토있으면 큐에 위치를 넣는다.
		 * 3. 큐가 비어질때까지 계속 반복.
		 * 4. 전체 토마토 탐색하여 익지않은 토마토 있다면 -1 출력.
		 * 5. 익지않은 토마토가 없다면 최대 일수 출력.
		 */

		Scanner scan = new Scanner(System.in);
		M = scan.nextInt();
		N = scan.nextInt();
		arr = new int[N][M];

		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {
				arr[i][j] = scan.nextInt();
			}
		}
		
		BFS(arr, N, M);
	}

	public static void BFS(int[][] arr, int N, int M) {
		Queue<Node> queue = new LinkedList<Node>();
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {
				if(arr[i][j] == 1)
					queue.add(new Node(i,j));
			}
		}
		
		while(!queue.isEmpty()) {
			Node tomato = queue.poll();
			// 상하좌우 이므로 4번 반복.
			for (int i=0;i<4; i++) {
				int nextX = tomato.x + dx[i];
				int nextY = tomato.y + dy[i];
				
				// x,y 가 0 보다 작거나(덜익었거나) 상자크기보다 클때는 제외(N,M)
				if(nextX < 0 || nextY < 0 || nextX >= N || nextY >= M) {
					continue;
				}
				
				if(arr[nextX][nextY] != 0) {
					continue;
				}
				
				arr[nextX][nextY] = arr[tomato.x][tomato.y];
				queue.add(new Node(nextX, nextY));
			}
		}
		
		int max = 0;
		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {
				if(arr[i][j] ==0) {
					System.out.println(-1);
					return;
				}
				max = Math.max(max, arr[i][j]);
			}
		}
		
		System.out.println(max);
	}

}

class Node {
	int x;
	int y;
	Node(int x, int y){
		this.x = x;
		this.y = y;
	}
}