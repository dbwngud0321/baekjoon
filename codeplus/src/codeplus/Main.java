package codeplus;

import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
//		snowwhite();
//		devideSum();
//		HanNumber();
//		dungchi();
//		tile();
		
	}
	
	public static void divideSum() {
		Scanner scan = new Scanner(System.in);
		int p,q,a,n;
		p = scan.nextInt();
		q = scan.nextInt();
		a = scan.nextInt();
		n = scan.nextInt();
		
		// p 媛� 1�씤寃쎌슦 �떒�쐞遺꾩닔�씠�떎
		
	}
	
	public static void gamso() {
		Scanner scan = new Scanner(System.in);
		int num = 0; // �떎�젣 �닽�옄 媛�
		int count = 0; // 媛쒖닔(紐뉖쾲 �옱 �씤吏�)
		int N = scan.nextInt(); // input 媛�
		
		if(N<10){
			System.out.println(N);
		}else if(N>1022){
			System.out.println(-1); // 理쒕�媛쒖닔�뒗 1022踰덉㎏ 2^10-1 -> �씠�빐�뒗 �븞媛�..
		}else {
			while(num != 0) {
				
			}
				
		}
		
	}
	
	
	public static void tile() {
		Scanner scan = new Scanner(System.in);
		int r = scan.nextInt();
		int b = scan.nextInt();
		
		int w;	// 媛덉깋 媛�濡�
		int l;	// 媛덉깋 �꽭濡�
		
		for(l=1; ; l++){
			// 媛덉깋 珥� 媛쒖닔 % �꽭濡쒓만�씠 == 0 
			if(b % l == 0){
				w = b/l; // 媛�濡쒓만�씠 == 珥앷컻�닔/�꽭濡쒓만�씠
				
				if(r == l*2 + 2*w + 4){
					System.out.println((w+2) +" "+ (l+2));
					break;
				}
			}
		}
	}
	
	/**
	 * 백준 7568 
	 * 덩치
	 * N명의 집단에서 각 사람의 덩치 등수는 자신보다 더 "큰 덩치"의 사람의 수로 정해진다. 만일 자신보다 더 큰 덩치의 사람이 k명이라면 그 사람의 덩치 등수는 k+1이 된다. 이렇게 등수를 결정하면 같은 덩치 등수를 가진 사람은 여러 명도 가능하다. 아래는 5명으로 이루어진 집단에서 각 사람의 덩치와 그 등수가 표시된 표이다.
	 * 	이름	<몸무게, 키>	덩치 등수
	 * 	A	<55, 185>	2
	 * 	B	<58, 183>	2
	 * 	C	<88, 186>	1
	 * 	D	<60, 175>	2
	 * 	E	<46, 155>	5
	 * 	위 표에서 C보다 더 큰 덩치의 사람이 없으므로 C는 1등이 된다.그리고 A, B, D 각각의 덩치보다 큰 사람은 C뿐이므로 이들은 모두 2등이 된다. 그리고 E보다 큰 덩치는 A, B, C, D 이렇게 4명이므로 E의 덩치는 5등이 된다. 위 경우에 3등과 4등은 존재하지 않는다. 
	 *  여러분은 학생 N명의 몸무게와 키가 담긴 입력파일을 읽어서 각 사람들의 덩치 등수를 계산하여 출력해야 한다
	 *  입력
	 *  첫 줄에는 전체 사람의 수 N이 주어진다. 그리고 이어지는 N개의 줄에는 각 사람의 몸무게와 키를 나타내는 양의 정수 x와 y가 하나의 공백을 두고 각각 나타난다.
	 *  단, 2 ≤ N ≤ 50, 10 ≤ x,y ≤ 200 이다.
	 *  출력
	 *  여러분은 입력에 나열된 사람의 덩치 등수를 구해서 그 순서대로 첫 줄에 출력해야 한다. 단 각 덩치 등수는 공백문자로 분리되어야 한다.
	 *  입력 ex)
	 *  5
	 *  55 185
	 *  58 183
	 *  88 186
	 *  60 175
	 *  46 155
	 *  출력 ex)
	 *  2 2 1 2 5  <- 등수 
	 */
	public static void dungchi() {
		Scanner scan = new Scanner(System.in);
		int result[];
		int N = scan.nextInt();
		result = new int[N]; // 등수 표시할 배열 크기는 N
//		N행 2열 배열
//		2차원 배열은 행/열 이라고 생각하자 -> (55,185) 0행 0열: 55 0행1열: 185
		int arr[][] = new int[N][2];
		for(int i=0; i<N; i++){
			result[i] = 1;
			arr[i][0] = scan.nextInt();	// 몸무게
			arr[i][1] = scan.nextInt(); // 키
		}
		
		// 같은 열의 값 끼리 비교
		for(int i=0; i<N; i++){
			for(int j=0; j<N; j++){
				// i번째 키와 몸무게가 j보다 크다면
				if(arr[i][0] > arr[j][0] && arr[i][1] > arr[j][1]){
					// i번째가 더 크다 따라서 j번째의 순위를 +해서 한순위 뒤로 미뤄준다.
					result[j]++;
				}
			}
		}
		
		for(int i=0; i<N; i++){
			System.out.print(result[i] + " ");
		}
		
	}
	
	/**
	 * 백준 1065
	 * 한수
	 * 어떤 양의 정수 X의 자리수가 등차수열을 이룬다면, 그 수를 한수라고 한다. 등차수열은 연속된 두 개의 수의 차이가 일정한 수열을 말한다. 
	 * N이 주어졌을 때, 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력하는 프로그램을 작성하시오.
	 * 입력
	 * 첫째 줄에 1,000보다 작거나 같은 자연수 N이 주어진다.
	 * 출력
	 * 첫째 줄에 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력한다.
	 */
	public static void HanNumber(){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		// n이 두자리수 인 경우 모두 한수임
		if(n<100) {
			System.out.println(n);
		} else {
			int result = 99;
			for(int i=100; i<n+1; i++){
				result+=checkHanNumber(i);
			}
			
			if(n == 1000){
				result--;
			}
			System.out.println(result);
		}
	}
	
	public static int checkHanNumber(int n){
		int num1 = n/100 % 10; // n을 100으로 나눈 몫에서 10으로 나눈 나머지 값 -> 100의자리 숫자
		int num2 = n/10 % 10;  // n을 10으로 나눈 몫에서 10으로 나눈 나머지 값 -> 10의자리 숫자
		int num3 = n % 10; // n을 1으로 나눈 몫에서 10으로 나눈 나머지 값 -> 1의자리 숫자
		// 중간 * 2 == 1번째3번째값의 합 이면 등차수열이다
		if(num2 * 2 == num1+num3){
			return 1;
		}
		
		return 0;
	}

	public static void devideSum(){
		int N= 1000000;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int result = 0;
		
		for(int i=1; i<n+1; i++){
			if(isSame(i,n)){
				result = i;
				break;
			}
				
		}
			
		System.out.println(result);
		
	}
	
	public static boolean isSame(int k, int n){
		String str = String.valueOf(k);
		
		for(int i=0; i<str.length(); i++){
			k += str.charAt(i)-48;
		}
		
		if(k==n)
			return  true;
		
		return false;
	}	
	public static void calculateDate(){
		Scanner sc = new Scanner(System.in);
		// �엯�젰諛쏆쓣 �긽�닔�뱾
		int E = sc.nextInt();
		int S = sc.nextInt();
		int M = sc.nextInt();
		// 鍮꾧탳�븷 媛믩뱾
		int e=1, s=1, m=1;
		// �꽭 媛믪씠 媛숈븘吏덈븣源뚯� 諛섎났
		for(int i=1;; i++){
			if(e == E && s == S && m == M){
				System.out.println(i);
				break;
			}
			
			e += 1;
			s += 1;
			m += 1;
			if(e==16){
				e=1;
			}
			if(s==29){
				s=1;
			}
			if(m==20){
				m=1;
			}
		}
	}
	
	public static void remotecontrol(){
		int N; // �씠�룞�븯�젮�뒗 梨꾨꼸  (0<=N<=500000) 
		int M; // 怨좎옣�궃 踰꾪듉 媛쒖닔		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<=500000; i++){
			
		}
	}
	
	public static void lotto(){
		int k;
		Scanner sc = new Scanner(System.in);
		k = sc.nextInt(); // k
		int S[];
		S = new int[k];
		
		for(int i=0; i<k; i++){
			S[i]=sc.nextInt();
		}
	}
	
	public static void snowwhite(){
		int N=9;
		int K=100;
		
		int sum=0;
		int arr[] = new int[9];
		boolean check = false;
		
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<9; i++){
			// arr setting
			arr[i] = sc.nextInt();
			// sum
			sum += arr[i];
		}
		
		// �삤由꾩감�닚 �젙�젹
		Arrays.sort(arr);
		
		for(int i=0; i<N-1; i++){
			for(int j=i+1; j<N; j++){
				if(sum-(arr[i]+arr[j]) == K){
					arr[i]=0;
					arr[j]=0;
					check = true;
					break;
				}
			}
			if(check)
				break;
		}
		

				
		for(int i=0; i<N; i++){
			if(arr[i]!=0){
				System.out.println(arr[i]);
			}
		}
	}
}
