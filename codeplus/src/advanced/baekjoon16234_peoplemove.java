package advanced;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * 백준 16234 인구이동
 * N×N크기의 땅이 있고, 땅은 1×1개의 칸으로 나누어져 있다. 각각의 땅에는 나라가 하나씩 존재하며, 
 * r행 c열에 있는 나라에는 A[r][c]명이 살고 있다. 인접한 나라 사이에는 국경선이 존재한다.
 * 모든 나라는 1×1 크기이기 때문에, 모든 국경선은 정사각형 형태이다.오늘부터 인구 이동이 시작되는 날이다.
 * 국경선을 공유하는 두 나라의 인구 차이가 L명 이상, R명 이하라면, 두 나라가 공유하는 국경선을
 * 오늘 하루동안 연다.위의 조건에 의해 열어야하는 국경선이 모두 열렸다면, 인구 이동을 시작한다.
 * 국경선이 열려있어 인접한 칸만을 이용해 이동할 수 있으면, 그 나라를 오늘 하루 동안은 연합이라고 한다.
 * 연합을 이루고 있는 각 칸의 인구수는 (연합의 인구수) / (연합을 이루고 있는 칸의 개수)가 된다. 편의상 소수점은 버린다.
 * 연합을 해체하고, 모든 국경선을 닫는다.
 * ------------------------------
 * 예제 입력1
 * 2 20 50
 * 50 30
 * 20 40
 * 예제 출력1
 * 1
 * --------------------------------
 * 50|30  -> 50:30 -> 35 35
 * ㅡㅡㅡㅡ	 -----
 * 20|40  -> 20:40 -> 35 35
 * 국경존재        국경해제    연합 : (50+30+20+40)/4 = 35
 * @author dbwng
 * 입력
 * 첫째 줄에 N, L, R이 주어진다. (1 ≤ N ≤ 50, 1 ≤ L ≤ R ≤ 100)
 * 둘째 줄부터 N개의 줄에 각 나라의 인구수가 주어진다. r행 c열에 주어지는 정수는 A[r][c]의 값이다. (1 ≤ A[r][c] ≤ 100)
 * 출력
 * 인구 이동이 몇 번 발생하는지 첫째 줄에 출력한다.
 */
public class baekjoon16234_peoplemove {

	public static int N;
	public static int A[][];
	public static int L;
	public static int R;
	public static boolean visited[][]; //방문여부를 위한 행렬
	public static void main(String[] args) {
		
		//DFS 사용 문제 -> stack
		Scanner scan = new Scanner(System.in);
		N = scan.nextInt();  // N*N 크기 땅 존재(배열)
		L = scan.nextInt();  // L명 이상
		R = scan.nextInt();  // R명 이하
		// 두 나라의 인구차이 L이상R이하이면 국경 오픈
		// 연합 인구수/연합의 칸 개수
		A = new int[N][N];
		int result = 0; // 결과 값 count
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				A[i][j] = scan.nextInt();
			}
		}
		
		while(true) {
			visited = new boolean[N][N]; // 방문여부 초기화
			
		}
		
	}

	// 인구이동 필요한지 확인
	public static boolean check() {
		List<Node> list;
		boolean check = true; // 이동이 필요 없을 경우 true
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				if(!visited[i][j]) {
					list = new LinkedList<>();
					list.add(new Node(i,j));
					
					int sum = dfs(i,j,list,0);
				}
			}
		}
		return check;
	}
	
	public static void average(int sum, List<Node> list) {
		int average = sum/list.size();
		for(Node node:list) {
			A[node.x][node.y]= average; 
		}
	}
	
	public static int dfs(int x, int y, List<Node> list, int sum) {
		visited[x][y] = true;
		sum = A[x][y];
		
		
		
		
		return sum;
	}
}

/**
 * x,y 값 저장 위한 객체 class
 * Node class
 * @author heejeongroh
 *
 */
class Node {
	int x;
	int y;
	public Node(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
