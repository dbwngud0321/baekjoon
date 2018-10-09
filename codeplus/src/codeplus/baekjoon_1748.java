package codeplus;

import java.util.Scanner;

public class baekjoon_1748 {
/*
 * 시간초과 걸리는 로직
	*//**
	 * 백준 1748 수 이어 쓰기 1
	 * @param args
	 *//*
	public static void main(String[] args) {
		int N;
		Scanner scan = new Scanner(System.in);
		N = scan.nextInt();
		String num = "";
		int count = 0;
		for(int i=1; i<=N; i++) {
			num+=Integer.toString(i);
			count = num.length();
		}
		
		System.out.println(count);
	}*/

	/*
	public static void main(String[] args) {
		int N;
		Scanner scan = new Scanner(System.in);
		N = scan.nextInt();
		int length = 0;
		length = String.valueOf(N).length();
		int count = 0;
		String result = "";
		for(int i=1; i<=length; i++) {
			result+=Integer.toString(i);
			count = result.length();
		}
		
		System.out.println(count);
	}*/
	
	static int len(int now) {
		int result = 0;
		while(now!=0) {
			now/=10;
			result++;
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		int N;
		Scanner scan = new Scanner(System.in);
		N = scan.nextInt();
		int result = 0;
		for (int i=1; i<=N; i++) {
			result += len(i);
		}
		System.out.println(result);
	}
	
	
}
