package codeplus;

import java.util.Scanner;

public class baekjoon1094_stick {

	public static int N = 64; // 갖고있는 막대 길이 64cm
	public static int X; // 길이가 Xcm인 막대
	public static void main(String[] args) {
		/**
		 * 백준 1094 막대기 문제
		 * 지민이가 가지고 있는 막대의 길이를 모두 더한다. 처음에는 64cm 막대 하나만 가지고 있다. 이때, 합이 X보다 크다면, 아래와 같은 과정을 반복한다.
		 * 가지고 있는 막대 중 길이가 가장 짧은 것을 절반으로 자른다.
		 * 만약, 위에서 자른 막대의 절반 중 하나를 버리고 남아있는 막대의 길이의 합이 X보다 크거나 같다면, 위에서 자른 막대의 절반 중 하나를 버린다.
		 * 이제, 남아있는 모든 막대를 풀로 붙여서 Xcm를 만든다.
		 * X가 주어졌을 때, 위의 과정을 거친다면, 몇 개의 막대를 풀로 붙여서 Xcm를 만들 수 있는지 구하는 프로그램을 작성하시오. 
		 * 입력
		 * 첫째 줄에 X가 주어진다. X는 64보다 작거나 같은 자연수이다.
		 * 출력
		 * 문제의 과정을 거친다면, 몇 개의 막대를 풀로 붙여서 Xcm를 만들 수 있는지 출력한다.
		 */
		Scanner scan = new Scanner(System.in);
		N = 64;
		int count = 0; // 정답 개수
		int X = scan.nextInt();
		while(X > 0){
			
			if(N > X){ 
				N /= 2;
			}else {
				count++; // x를 만들 재료 찾음 -> 카운트 증가 
				X -= N; // 제외한 길이 를 다시 2로나누기 위해 뺀다
			}
		}
		System.out.println(count);
	}

}
