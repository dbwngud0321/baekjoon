package codeplus;

import java.util.Arrays;
import java.util.Scanner;

public class baekjoon1427 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		scan.close();
		String strArr[] = str.split("");
		int arr[] = new int[strArr.length];
		for(int i=0; i<strArr.length; i++){
			arr[i] = Integer.parseInt(strArr[i]);
		}
		Arrays.sort(arr);
		
		for(int i=arr.length-1; i>=0; i--){
			System.out.print(arr[i]);
		}
		
	}

}
