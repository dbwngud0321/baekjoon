package codility;

import java.util.Scanner;

/**
 * binary gap codility
 * @author jh11.yoo
 *
 */
public class CyclicRotation {

	public static int[] solution(int[] A, int K){
		int N = A.length;
		int result[] = new int[N];
		for(int j=0; j<K; j++){
			for(int i=0; i<N-1; i++){
				int temp = A[N-1];
				result[0]=temp;
				result[i+1] = A[i];
			}
			A = result.clone();
		}
		
		return A;
		
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("input K : ");
		int K = scan.nextInt();
//		int A[] = {3,8,9,7,6};
		int A[] = {1,2,3,4};
//		int B[] = solution(A,K);
		A = solution(A,K);
		for(int i: A){
			System.out.println(i);
		}
		
	}
}
