package codeplus;

import java.util.Scanner;
import java.util.Stack;
/**
 * stack 구현 기본 문제
 * push X: 정수 X를 스택에 넣는 연산이다.
 * pop: 스택에서 가장 위에 있는 정수를 빼고, 그 수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
 * size: 스택에 들어있는 정수의 개수를 출력한다.
 * empty: 스택이 비어있으면 1, 아니면 0을 출력한다.
 * top: 스택의 가장 위에 있는 정수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
 */
public class baekjoon10828_stack {

	public static int N;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Stack<Integer> stack = new Stack<Integer>();
		
		int N = scan.nextInt();
		
		for(int i=0; i<N; i++){
			String str = scan.next();
			
			if(str.equals("push")){
				int num = scan.nextInt();
				stack.push(num);
			}else if(str.equals("pop")){
				if(stack.isEmpty())
					System.out.println(-1);
				else
					System.out.println(stack.pop());
			}else if(str.equals("size")){
				System.out.println(stack.size());
			}else if(str.equals("empty")){
				if(stack.isEmpty())
					System.out.println(1);
				else 
					System.out.println(0);
			}else if(str.equals("top")){
				if(stack.isEmpty())
					System.out.println(-1);
				else
					System.out.println(stack.peek());
			}
			
		}
		
	}

}
