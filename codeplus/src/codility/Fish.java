package codility;

import java.util.Stack;

public class Fish {
	
	public static int solution(int[] A, int[] B){
		int N = A.length;
		int alive = 0;
		Stack<Integer> stack = new Stack<Integer>();
		for(int i=0; i<N; i++){
			if(B[i]==1){
				stack.push(A[i]);
			} else {
				while(!stack.isEmpty()){
					if(stack.peek() > A[i]){ // 새로운 물고기 사망
						break;
					} else {
						stack.pop();
					}
				}
				if(stack.isEmpty() && B[i]==0){
					alive++;
				}
			}
		}
		return alive + stack.size();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {4,3,2,1,5};
		int[] B = {0,1,0,0,0};
		System.out.println(solution(A,B));
	}

}
