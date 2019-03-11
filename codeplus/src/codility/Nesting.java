package codility;

import java.util.Stack;

public class Nesting {
	
		public static int solution(String S) {
			Stack <Character> stack = new Stack<>();
			int N = S.length();
			if(N%2!=0) return 0;
			for(char i: S.toCharArray()){
				if(i == '(') {
					stack.push(i);
				}else {
					if(stack.size() == 0 || stack.pop() != '('){
						return 0;
					}
				}
			}
			
			return stack.size() == 0 ? 1: 0;
		}
	
	public static void main(String[] args) {
		String S="(()(())())"; //1
//		String S="())"; // 0
		System.out.println(solution(S));
	}

}
