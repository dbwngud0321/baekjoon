package advanced;

import java.util.Stack;

public class DFS {

	/**
	 * dfs 깊이우선 탐색 
	 * 인접행렬의 재귀 or 스택 사용 
	 * @param args
	 */
	public static void main(String[] args) {

	}

	/**
	 * dfs 구현 -> 인접행렬의 재귀형태로
	 * @param a : 인접행렬
	 * @param c : 방문여부
	 * @param v : 정점
	 */
	public static void dfs(int[][] a, boolean[] c,int v) {
		int n = a.length -1;
		
		c[v] = true;
		System.out.println(v+ " ");
		
		for(int i=0; i<=n; i++) {
			if(a[v][i] == 1 && !c[i]) {
				dfs(a,c,i);
			}
		}
	}
	
	/**
	 * dfs 구현 -> 스택사용한 형태
	 * @param a : 인접행렬
	 * @param c : 방문여부
	 * @param v : 정점
	 * @param flag
	 */
	public static void dfs(int[][] a, boolean[] c, int v, boolean flag) {
		Stack<Integer> stack = new Stack<>();
		int n = a.length-1;
		
		stack.push(v);
		c[v] = true;
		System.out.print(v + " ");
		
		while(!stack.isEmpty()) {
			int vv = stack.peek(); // 스택의 최상위 값 조회(제거하지 않음)
			flag = false;
			for(int i=1; i<=n; i++) {
				if(a[vv][i] == 1 && !c[i]) {
					stack.push(i);
					System.out.println(i + " ");
					
					c[i] = true;
					flag = true;
					break;
				}
			}
			
			if(!flag) {
				stack.pop();
			}
		}
		
	}
}
