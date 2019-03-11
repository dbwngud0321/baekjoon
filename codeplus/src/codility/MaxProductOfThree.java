package codility;

import java.util.Arrays;

public class MaxProductOfThree {

	 public static int solution(int[] A) {
		 int result = 0;
		 Arrays.sort(A); // sorting Array
		 
		 int N = A.length;
		 result = A[N-1]* A[N-2] * A[N-3];
		 
		 int count =0;
		 
		 for(int i: A){
			 if(i<0)
				 count++;
		 }
		 if(count%2==0){
			 int result2 = A[0]*A[1]*A[N-1];
			 if(result2>result)
				 result = result2;
		 }
		 if(Math.abs(A[0])>= A[N-1]) {
			 int result2 = A[0]*A[1]*A[N-1];
			 if(result2>result)
				 result = result2;
		 }
		 return result;
	 }
	
	public static void main(String[] args) {
//		int A[] = {-3,1,2,-2,5,6};
//		int A[] = {-6,1,2,-2,5,6};
		int A[] = {-10,1,2,-2,5,100};
		System.out.println(solution(A));
	}

}
