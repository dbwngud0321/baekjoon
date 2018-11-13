package simulater;

import java.util.Scanner;

public class baekjoon2455_train {

	/**
	 * 기차 문제 
	 * 4개의 역에 대해, 각 역에서 내린 사람 수와 탄사람 수가 주어졌을때,
	 * 기차에 사람이 가장 많을 때의 사람 수 구하기
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int max = 0;
		int count = 0;
		for(int i=0; i<4; i++) {
			count -= scan.nextInt();
			count += scan.nextInt();
			
			if(max < count) // count값이 max보다 크면 max값은 갱
				max = count;
		}
		System.out.print(max);
	}

}
