package codeplus;

import java.util.Scanner;

public class baekjonn4344 {

	static int C; // test case
	static int N; // student count
	static int []arr; // student value array
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		C = scan.nextInt();
		for(int i=0; i<C; i++) {
			N = scan.nextInt();
			arr = new int[N];
			for(int j=0; j<N; j++) {
				arr[j] = scan.nextInt();
			}
			solution(arr, N);
		}
	}
	
	private static void solution(int arr[], int N) {
		for(int i=0; i<arr.length;i++) {
		}
		double average = 0.000;
		int total = 0;
		int count = 0;
		for(int i=0; i<N; i++) {
			total+=arr[i];
		}
		average = (double)total/N;
		for(int i=0; i<N; i++) {
			if(arr[i]>average)
				count++;
		}
		
		System.out.printf("%.3f", 100.0*count/N);
		System.out.println("%");
	}
}
