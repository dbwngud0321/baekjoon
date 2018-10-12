package codeplus;

import java.util.Scanner;

public class baekjoon2920 {

	static int N=8;
	static int []arr;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String result = "";
		arr = new int[N];
		for(int i=0; i<N; i++) {
			arr[i] = scan.nextInt();
		}

		for(int i=0; i<N-1; i++) {
			if(arr[i+1]-arr[i] == 1) {
				result = "ascending";
			}else if(arr[i+1]-arr[i] == -1){
				result = "descending";
			}else {
				result = "mixed";
				break;
			}
		}
		System.out.println(result);
	}

}
