package codility;

import java.util.Arrays;

public class Triangle {
	/* N is an integer within the range [0..100,000];
	 * each element of array A is an integer within the range [−2,147,483,648..2,147,483,647].
	 * -> must to use long type as A
	 */
	 public static int solution(int[] A) {
		 Arrays.sort(A);
		 int N = A.length;
		 for(int i=0; i<N-2; i++){
			 // negative number except
			 if(A[i]<0)
				 continue;
			 if((long)A[i]+A[i+1]>A[i+2]){
				 return 1;
			 }
		 }
		 
		 return 0;
	 }
	
	public static void main(String[] args) {
//		int A[] = {10,2,5,1,8,20};
		int A[] = {10,50,5,1};
		System.out.println(solution(A));
	}
}
