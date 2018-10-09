package codeplus;

import java.util.Scanner;

public class baekjonn9498 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int num = 0;
		num = scan.nextInt();
		solution(num);
	}

	private static void solution(int num) {
		String result = "F";
		if(num>=90 && num<=100) {
			System.out.println("A");
			return;
		}else if(num>=80 && num<=89) {
			System.out.println("B");
			return;
		}
		else if(num>=70 && num<=79) {
			System.out.println("C");
			return;
		}else if(num>=60 && num<=69) {
			System.out.println("D");
			return;
		}else {
			System.out.println("F");
			return;
		}
	}
}
