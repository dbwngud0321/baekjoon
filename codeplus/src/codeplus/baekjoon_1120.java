package codeplus;

import java.util.Scanner;

public class baekjoon_1120 {

	/**
	 * 백준 1120
	 * 문자열  
	 * @param args
	 */
	/*public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		String b = scan.next();
		int min = 50;
		int cnt = 0;
		
		for(int i=0; i<= b.length() - a.length(); i++) {
			cnt = 0;
			
			for(int j=0; j<a.length(); j++) {
				if(a.charAt(j) != b.charAt(j+i))
					cnt++;
			}
			
			min = min>=cnt ? cnt:min;
			
		}
		System.out.println(min);
	}*/
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		String b = scan.next();
		int min = 50;
		int cnt = 0;
		
		for(int i=0; i<= b.length() - a.length(); i++) {
			cnt = 0;
			
			for(int j=0; j<a.length(); j++) {
				System.out.println("a.charAt(j) " + a.charAt(j));
				System.out.println("b.charAt(j) " + b.charAt(j));
				if(a.charAt(j) != b.charAt(j+i))
					cnt++;
			}
			
			min = Math.min(min, cnt);
//			min = min>=cnt ? cnt:min;
			
		}
		System.out.println(min);
	}
	
}
