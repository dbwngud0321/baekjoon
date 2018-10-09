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
	
	public static void dungchi() {
		Scanner scan = new Scanner(System.in);
		int result[];
		int N = scan.nextInt();
		result = new int[N];
//		N�뻾 2�뿴 諛곗뿴
		int arr[][] = new int[N][2];
		for(int i=0; i<N; i++){
			result[i] = 1;
			arr[i][0] = scan.nextInt();	// 紐몃Т寃�
			arr[i][1] = scan.nextInt(); // �궎
		}
		
		for(int i=0; i<N; i++){
			for(int j=0; j<N; j++){
				if(arr[i][0] > arr[j][0] && arr[i][1] > arr[j][1]){
					// i踰덉㎏媛� �뜑 誘��떎 �뵲�씪�꽌 j踰덉㎏�쓽 �닚�쐞瑜� +�빐�꽌 �븳�닚�쐞 �뮘濡� 誘몃쨪以��떎.
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
		
		// n�씠 �몢�옄由ъ닔 �씤 寃쎌슦 紐⑤몢 �븳�닔�엫
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
		// 以묎컙 * 2 == 1踰덉㎏3踰덉㎏媛믪쓽 �빀 �씠硫� �벑李⑥닔�뿴�씠�떎
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
