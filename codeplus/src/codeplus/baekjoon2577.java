package codeplus;

import java.util.Scanner;

public class baekjoon2577 {

	static int A;
	static int B;
	static int C;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		A=scan.nextInt();
		B=scan.nextInt();
		C=scan.nextInt();
		int multiple = A*B*C;
		String str = String.valueOf(multiple);
		String result[] = str.split("");
		// array for 0~9 count
		int [] arr = new int[10];
		for(int i=0; i<str.length(); i++) {
			for(int j=0; j<10; j++) {
				if(Integer.parseInt(result[i]) == j) {
					arr[j]++;
				}
			}
		}
		for(int a: arr) {
			System.out.println(a);
		}
	}

}
