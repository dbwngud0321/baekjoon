package codility;

import java.util.Scanner;

public class OddOccurrencesInArray {

	public static int solution(int[] A) {
		int result = 0;
		/*int count = 0;
		for(int i=0; i<A.length; i++){
			for(int j=0; j<i; j++){
				if(A[i] == A[j]){
					count++;
				}
			}
			if(count == 0){
				result = A[i];
			} else {
				count = 0;
			}
		}*/
		
		for(int i: A){
			result ^= i;
			// result = result ^ A[i]
			// exclusive or
			// bit 연산으로 같으면 0 다르면 1 로 비교 1001 xor 10 -> 1011
			System.out.println(result);
		}
		
		return result;
	}
	public static void main(String[] args) {
		int A[] = {9,3,9,3,9,7,9};
		System.out.println(solution(A));

	}

}
