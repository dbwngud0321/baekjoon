package codeplus;

import java.util.Scanner;

public class baekjoon8393 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		scan.close();
		int result = 0;
		for(int i=1; i<=N; i++){
			result += i;
		}
		
		System.out.println(result);
	}

}
