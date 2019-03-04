package codility;

import java.util.Stack;

public class Fish {
	
	public static int solution(int[] A, int[] B){
		int result = 0;
		Stack<Integer> stack = new Stack<Integer>();
		// B index 가 1인 값을 stack에 넣자
		for(int i: B){
			if(i == 1)
				stack.push(i);
		}
		for(int i: A) {
			
		}
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {4,3,2,1,5};
		int[] B = {0,1,0,0,0};
		System.out.println(solution(A,B));
	}

}
