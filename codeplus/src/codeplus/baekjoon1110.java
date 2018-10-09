package codeplus;

import java.util.Scanner;

public class baekjoon1110 {

	static int N;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		N = scan.nextInt();
		int result = 0;
		int sum = 0;
		int count = 0;
		result = N;
		while(true) {
			// left number ex)26 -> 26/10=2
			int left = N/10;
			// right number ex)26 -> 26%10=6
			int right = N%10;
			// right number of sum ex)26 -> 2+6%10=8
			sum = (left+right)%10;
			// new number of rightnumber + sum ex)26 -> 2+6=8, 6+8=14
			N = right*10+sum;
			count++;
			if(result == N)
				break;
		}
		System.out.println(count);
		
	}

}
