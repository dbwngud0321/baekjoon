package codeplus;

import java.util.Scanner;

public class baekjoon2490 {

	/**
	 * baekjoon2490 yootnori
	 * 윷놀이 배(0) 등(1) 도: 배한개 등세개 -> 0 1 1 1 
	 * 윷의 상태를 출력하는 프로그램(도,개,겇,율,모) a,b,c,d,e
	 * 입력: 첫째 줄부터 셋째 줄까지 각 줄에 각각 한 번 던진 윷짝들의 상태를 나타내는 네 개의 정수(0 또는 1)가  빈칸을 사이에 두고 주어진다.
     * 출력: 첫째 줄부터 셋째 줄까지 한 줄에 하나씩 결과를  도는 A, 개는 B, 걸은 C, 윷은 D, 모는 E로 출력한다.
	 * @param args
	 */
	public static int N;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		for(int i=0; i<3; i++) {
			int arr[] = new int[4];
			String str = scan.nextLine();
			for(int j=0; j<4; j++) {
				arr[j] = Integer.parseInt(str.split(" ")[j]);
			}
			check(arr);
		}
	}

	public static void check(int arr[]) {
		int count = 0;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==0)
				count++;
		}
		switch(count) {
		case 0:
			System.out.println("E");
			break;
		case 1:
			System.out.println("A");
			break;
		case 2:
			System.out.println("B");
			break;
		case 3:
			System.out.println("C");
			break;
		case 4:
			System.out.println("D");
		
		}
	}
}
