package codeplus;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class baekjoon10845_que {

	public static int N;
	public static Queue<Integer> que;
	public static void main(String[] args) {
		/**
		 * 큐 생성 기본문제
		 * push X: 정수 X를 큐에 넣는 연산이다. -> add
		 * pop: 큐에서 가장 앞에 있는 정수를 빼고, 그 수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다. -> poll
		 * size: 큐에 들어있는 정수의 개수를 출력한다. -> size
		 * empty: 큐가 비어있으면 1, 아니면 0을 출력한다. -> isEmpty
		 * front: 큐의 가장 앞에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다. -> peek
		 * back: 큐의 가장 뒤에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다. -> 마지막 수 b
		 */
		
		/**
		 * **Queue 는 LinkedList로 초기화한다.
		 */
		Scanner scan = new Scanner(System.in);
		N = scan.nextInt();

		// 큐의 마지막 수 에 해당하는 값 초기화
		int b = 0;
		
		que = new LinkedList<>();
		for(int i=0; i<N; i++){
			String str = scan.next();
			
			if(str.equals("push")){
				b=scan.nextInt();
				que.add(b);
			}
			else if(str.equals("pop")){
				if(que.isEmpty())
					System.out.println(-1);
				else
					System.out.println(que.poll());
			}
			else if(str.equals("size")){
				System.out.println(que.size());
			}
			else if(str.equals("empty")){
				if(que.isEmpty())
					System.out.println(1);
				else
					System.out.println(0);
			}
			else if(str.equals("front")){
				if(que.isEmpty())
					System.out.println(-1);
				else
					System.out.println(que.peek());
			}
			else if(str.equals("back")){
				if(que.isEmpty())
					System.out.println(-1);
				else
					System.out.println(b);
			}
		}
		
	}

}
