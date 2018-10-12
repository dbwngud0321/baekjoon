package codeplus;

import java.util.Scanner;

public class baekjoon1152 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine().trim();
		scan.close();
		
		String arr[] = str.split(" ");
		if(str.isEmpty()){
			System.out.println(0);
		}else {
			System.out.println(arr.length);
		}
	}

}
