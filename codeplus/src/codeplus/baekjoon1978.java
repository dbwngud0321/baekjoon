package codeplus;

import java.util.Scanner;

public class baekjoon1978 {
	/**
	 * baekojoon1978 find sosu
	 * @param args
	 */
	public static int count;
	public static int N;
	public static int result;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		count = 0;
		result = 0;
		for(int i=0; i<N; i++){
			int num = scan.nextInt();
			count = 0;
			
			for(int j=1; j<= num; j++) {
				if(num % j == 0)
					count++;
			}
			if(count == 2){
				result++;
			}
		}
		
		System.out.print(result);
	}

}
