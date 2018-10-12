package codeplus;

import java.util.Scanner;

public class baekjoon11720 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		String str = scan.next();
		String arr[] = str.split("");
		int result[] = new int[N];
		int sum = 0;
		
		for(int i=0; i<N; i++) {
			result[i] = Integer.parseInt(arr[i]);
			sum+= result[i];
		}
		
		System.out.println(sum);

	}

}
