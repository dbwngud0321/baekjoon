package codeplus;

import java.util.HashSet;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * baekjoon 3671s
 * spy 
 * @author heejeongroh
 *
 */
public class baekjoon3671 {

	private static HashSet<String> primeSet;
	private static int count;
	private static int [] pocket;
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		StringTokenizer st;
		
		int arr[];
		
		int c = scan.nextInt();
		for(int i=0; i<c; i++) {
			String str = scan.nextLine();
			str.length();
			for(int j=0; j<str.length(); j++) {
				pocket[j]=str.charAt(j);
			}
			
			// reset search list (primeSet)
			primeSet = new HashSet();
			
		}
	}
	
	private static boolean isSosu(int num) {
		boolean result = false;
		
		
		return result;
	}

}
