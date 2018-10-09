package codeplus;

import java.util.Scanner;

public class baekjoon10039 {

	static int N=5;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] arr = new int[N];
		int average=0;
		int sum=0;
		for(int i=0; i<N; i++) {
			arr[i]=scan.nextInt();
			if(arr[i]<40)
				arr[i]=40;
			
			sum+=arr[i];
		}
		average=sum/N;
		System.out.println(average);

	}

}
