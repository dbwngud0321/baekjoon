package codeplus;

import java.util.Scanner;

public class baekjoon10871 {

	static int N;
	static int X;
	static int[] A;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	
		N = scan.nextInt();
		X = scan.nextInt();
		A = new int[N];
		for(int i=0; i<N; i++) {
			A[i] = scan.nextInt();
		}
		
		int resultArr[] = new int[X];
		
		for(int i=0; i<N; i++) {
			if(A[i]<X) {
				System.out.println(A[i]);
			}
		}
	}

}
