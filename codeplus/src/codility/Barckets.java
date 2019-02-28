package codility;

import java.util.Stack;

public class Barckets {

	public static int solution(String S) {
		long N = S.length();
//		check pair
		if(N%2 != 0) return 0;
		Stack<Character> stack = new Stack<Character>();
		for(char i : S.toCharArray()) {
			if(i == '{' || i == '[' || i == '(') {
				stack.push(i);
			} else {
				if(stack.isEmpty())
					return 0;
				if(i == '}') {
					if(stack.pop() != '{') {
						return 0;
					}
				}
				if(i == ']'){
					if(stack.pop() != '[') {
						return 0;
					}
				}
				if(i == ')') {
					if(stack.pop() != '(') {
						return 0;
					}
				}
			}
		}
		
		return stack.isEmpty() ? 1: 0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String S = "([)()]";
		System.out.println(solution(S));
	}

}
