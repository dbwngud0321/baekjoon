package codility;

public class PermCheck {

	public static int solution(int[] A) {
		long result = 0;
		long N = A.length;
		result = N*(N+1)/2;
		for(int i: A){
			result -= i;
		}
		if(result == 0) {
			return 1;
		} else {
			return 0;
		}
	}
	
	public static void main(String[] args) {
		int A[] ={4,1,2};
		System.out.println(solution(A));
	}

}
