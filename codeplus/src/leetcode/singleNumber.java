package leetcode;

public class singleNumber {

	public static void main(String[] args) {
		int[] nums = {1,1,4,4,3};
		System.out.print(singleNumber(nums));
	}

	public static int singleNumber(int[] nums) {
		int result = 0;
		/**
		 *  0 ^ 1 => 1
		  	1 ^ 4 => 4
		  	4 ^ 4 => 0
			비트연산자 ^ -> a ^ b 일때 a==b 이면 0 a!=b 이면 b가 반한된다.
		 */
		for(int i=0; i<nums.length; i++){
			result = result ^ nums[i];
		}
		return result;
	}
}
