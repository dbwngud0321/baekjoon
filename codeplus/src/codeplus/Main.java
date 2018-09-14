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
		
		// p 가 1인경우 단위분수이다
		
	}
	
	public static void gamso() {
		Scanner scan = new Scanner(System.in);
		int num = 0; // 실제 숫자 값
		int count = 0; // 개수(몇번 재 인지)
		int N = scan.nextInt(); // input 값
		
		if(N<10){
			System.out.println(N);
		}else if(N>1022){
			System.out.println(-1); // 최대개수는 1022번째 2^10-1 -> 이해는 안감..
		}else {
			while(num != 0) {
				
			}
				
		}
		
	}
	
	
	public static void tile() {
		Scanner scan = new Scanner(System.in);
		int r = scan.nextInt();
		int b = scan.nextInt();
		
		int w;	// 갈색 가로
		int l;	// 갈색 세로
		
		for(l=1; ; l++){
			// 갈색 총 개수 % 세로길이 == 0 
			if(b % l == 0){
				w = b/l; // 가로길이 == 총개수/세로길이
				
				if(r == l*2 + 2*w + 4){
					System.out.println((w+2) +" "+ (l+2));
					break;
				}
			}
		}
	}
	
	public static void dungchi() {
		Scanner scan = new Scanner(System.in);
		int result[];
		int N = scan.nextInt();
		result = new int[N];
//		N행 2열 배열
		int arr[][] = new int[N][2];
		for(int i=0; i<N; i++){
			result[i] = 1;
			arr[i][0] = scan.nextInt();	// 몸무게
			arr[i][1] = scan.nextInt(); // 키
		}
		
		for(int i=0; i<N; i++){
			for(int j=0; j<N; j++){
				if(arr[i][0] > arr[j][0] && arr[i][1] > arr[j][1]){
					// i번째가 더 므다 따라서 j번째의 순위를 +해서 한순위 뒤로 미뤄준다.
					result[j]++;
				}
			}
		}
		
		for(int i=0; i<N; i++){
			System.out.print(result[i] + " ");
		}
		
	}
	
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
		int num1 = n/100 % 10;
		int num2 = n/10 % 10;
		int num3 = n % 10;
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
		// 입력받을 상수들
		int E = sc.nextInt();
		int S = sc.nextInt();
		int M = sc.nextInt();
		// 비교할 값들
		int e=1, s=1, m=1;
		// 세 값이 같아질때까지 반복
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
		int N; // 이동하려는 채널  (0<=N<=500000) 
		int M; // 고장난 버튼 개수		
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
		
		// 오름차순 정렬
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
