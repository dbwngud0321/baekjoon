package codeplus;

import java.util.Arrays;
import java.util.Scanner;

public class baekjoon1546 {

	static int M; // max value
	static int N; // count value
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		N = scan.nextInt();
		double arr[] = new double[N];
		for(int i=0; i<N; i++) {
			arr[i]=scan.nextInt();
		}
		Arrays.sort(arr);
		// max value setting
		M = (int) arr[N-1];
		for(int i=0; i<N; i++) {
			arr[i] = (arr[i]/M)*100;
		}
		double total = 0;
		for(int i=0; i<N; i++) {
			total += arr[i];
		}
		System.out.println(total/N);
	}

}
