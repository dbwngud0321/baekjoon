package codeplus;

import java.util.Scanner;

public class baekjoon11721 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		int length = str.length();
		int count = length/10;
		int i=0;
		for(int j=0;j<=count;j++){
			if(i+10>length){
				System.out.println(str.substring(i,length));
				break;
			}
			System.out.println(str.substring(i, i+10));
			i=i+10;
		}
		scan.close();
	}

}
