package codility;

/**
 * Your goal is to find that missing element.
 * ex)  
 * A[0] = 2  
 * A[1] = 3
 * A[2] = 1
 * A[3] = 5
 * the function should return 4, as it is the missing element.
 * @author jh11.yoo
 *
 */
public class PerMissingElem {

	public static int solution(int A[]){
		int arrSum = 0;
		long N = A.length;
		long sum = (N+1)*(N+2)/2;
		for(int i: A){
			arrSum += i;
		}
		return (int) sum - arrSum;
		// long으로 선언하여 계산 후 int로 형변환하여 return 해야 100프로 int로만 하면 80%
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[] = {2,3,1,5};
		int N = 4;
		System.out.println(solution(A));
	}

}
