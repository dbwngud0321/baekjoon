package codeplus;

import java.util.Arrays;
import java.util.Scanner;

public class baekjoon10817 {

	static int n = 3;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] arr = new int[3];
		
		for(int i=0; i<n; i++) {
			arr[i] = scan.nextInt();
		}
		Arrays.sort(arr);
		System.out.println(arr[1]);
	}

}
