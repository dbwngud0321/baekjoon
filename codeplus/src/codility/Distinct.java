package codility;

import java.util.HashSet;
import java.util.Set;

public class Distinct {
	static public int solution(int[] A) {
		Set<Integer> set = new HashSet<Integer>();
		for(int i: A) {
			set.add(i);
		}
		
		return set.isEmpty() ? 0:set.size();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] A = {2,1,1,2,3,4,5,1};
		System.out.println(solution(A));
	}

}
